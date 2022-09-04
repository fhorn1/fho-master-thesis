package org.goafabric.personservice.service;

import org.goafabric.model.OpsImportStatistics;
import org.goafabric.personservice.logic.OpsImportLogic;

import javax.annotation.security.RolesAllowed;
import javax.inject.Inject;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.io.IOException;

@Path("/ops/import")
@Produces(MediaType.APPLICATION_JSON)
@RolesAllowed("standard_role")
public class OpsImportService {
    @Inject
    OpsImportLogic opsImportLogic;

    @POST
    @Path("importStaticFile")
    public OpsImportStatistics importStaticFile() throws IOException {
        return opsImportLogic.importStaticFile();
    }

//    @GET
//    @Path("startImport")
//    public OpsImportStatistics startImport(@Param("inputStream") InputStream inputStream) {
//        return opsImportLogic.startImport(inputStream);
//    }
}
