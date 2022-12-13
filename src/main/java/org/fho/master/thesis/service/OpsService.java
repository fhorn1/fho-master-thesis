package org.fho.master.thesis.service;

import org.fho.master.thesis.model.OpsImportStatistics;
import org.fho.master.thesis.logic.OpsLogic;
import org.fho.master.thesis.service.dto.OpCode;
import org.fho.master.thesis.service.dto.OpHead;

import javax.annotation.security.RolesAllowed;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/ops")
@Produces(MediaType.APPLICATION_JSON)
@RolesAllowed("standard_role")
public class OpsService {
    @Inject
    OpsLogic opsLogic;

    @GET
    @Path("getAllHeads")
    public List<OpHead> getAllHeads() {
        return opsLogic.getAllHeads();
    }

    @GET
    @Path("getHead")
    public OpHead getHead(@QueryParam("id") String id) {
        return opsLogic.getHead(id);
    }

    @GET
    @Path("getAllOpCodesOfHead")
    public List<OpCode> getAllOpCodesOfHead(@QueryParam("headId") String headId,
                                            @QueryParam("limit") Integer limit) {
        return opsLogic.getAllOpCodesOfHead(headId, limit);
    }

    @GET
    @Path("getImportStatistics")
    public OpsImportStatistics getImportStatistics(@QueryParam("headId") String headId) {
        return opsLogic.getImportStatistics(headId);
    }

}
