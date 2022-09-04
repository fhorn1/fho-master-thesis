package org.goafabric.personservice.logic.opsimporter;

import io.quarkus.runtime.annotations.RegisterForReflection;
import org.goafabric.model.OpsImportedTuple;
import org.goafabric.model.generated.EhdBodyTyp;
import org.goafabric.model.generated.EhdHeaderTyp;
import org.goafabric.model.generated.ObjectFactory;
import org.goafabric.model.generated.OpsRootTyp;

import javax.enterprise.context.ApplicationScoped;
import javax.validation.constraints.NotNull;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.FilterInputStream;
import java.io.InputStream;

/**
 * KBV XML to OPS Structure
 */
@ApplicationScoped
public class OpsXmlImporter {

    /**
     * read OPS structure from input stream
     *
     * @param inputStream - not null
     * @return OpsHead (for Catalog) and OpsBody (for Operation Code)
     */
    public OpsImportedTuple startImport(@NotNull final InputStream inputStream) {

        try {
            JAXBContext jc = JAXBContext.newInstance(OpsRootTyp.class, ObjectFactory.class);

            Unmarshaller unmarshaller = jc.createUnmarshaller();
            JAXBElement<OpsRootTyp> rootElement = (JAXBElement) unmarshaller.unmarshal(new JAXBInputStream(inputStream));
            OpsRootTyp opsRootType = rootElement.getValue();

            EhdHeaderTyp header = opsRootType.getHeader();
            EhdBodyTyp body = opsRootType.getBody();

            return OpsImportedTuple.builder()
                    .ehdHeaderTyp(header)
                    .ehdBodyTyp(body)
                    .build();
        } catch (JAXBException e) {
            throw new IllegalStateException("Operation code catalog unmarshall has not worked ", e);
        }
    }

    // used because JaxB unmarshaller close zip input stream automatically. now close don't do anything
    private class JAXBInputStream extends FilterInputStream {

        JAXBInputStream (InputStream in) {
            super(in);
        }

        @Override
        public void close() {
            // function is empty because inputStream will close automatically otherwise
        }
    }
}
