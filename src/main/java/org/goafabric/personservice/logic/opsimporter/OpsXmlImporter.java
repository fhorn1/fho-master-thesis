package org.goafabric.personservice.logic.opsimporter;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;
import org.goafabric.model.OpsImportedTuple;
import org.goafabric.model.generated.*;

import javax.enterprise.context.ApplicationScoped;
import javax.validation.constraints.NotNull;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
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

            XMLInputFactory factory = XMLInputFactory.newInstance();
            XMLEventReader someSource = factory.createXMLEventReader(inputStream);

            JAXBElement<OpsRootTyp> rootElement = (JAXBElement<OpsRootTyp>) unmarshaller.unmarshal(someSource);
            OpsRootTyp opsRootType = rootElement.getValue();

            EhdHeaderTyp header = opsRootType.getHeader();
            EhdBodyTyp body = opsRootType.getBody();

            return OpsImportedTuple.builder()
                    .ehdHeaderTyp(header)
                    .ehdBodyTyp(body)
                    .build();
        } catch (JAXBException | XMLStreamException e) {
            throw new IllegalStateException("Operation code catalog unmarshall has not worked ", e);
        }
    }

    // used because JaxB unmarshaller close zip input stream automatically. now close don't do anything
    private class JAXBInputStream extends FilterInputStream {

        JAXBInputStream(InputStream in) {
            super(in);
        }

        @Override
        public void close() {
            // function is empty because inputStream will close automatically otherwise
        }
    }
}
