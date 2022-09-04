package org.goafabric.personservice.logic.opsimporter;

import lombok.NonNull;
import org.goafabric.model.OpsImportedTuple;
import org.goafabric.model.VersionHelper;
import org.goafabric.model.generated.EhdBodyTyp;
import org.goafabric.model.generated.Opscode;
import org.goafabric.model.generated.OpscodeListe;
import org.goafabric.personservice.persistence.domain.SdOpsCodeEo;
import org.goafabric.personservice.persistence.domain.SdOpsHeadEo;
import org.joda.time.LocalDate;

import javax.enterprise.context.ApplicationScoped;
import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class OpCodeImporter {

    public List<SdOpsCodeEo> startImport(
        @NonNull final OpsImportedTuple opsImportedTuple,
        @NonNull final SdOpsHeadEo opsHead) {

        EhdBodyTyp body = opsImportedTuple.getEhdBodyTyp();

        List<SdOpsCodeEo> opsCodes = new ArrayList<>();

        for (OpscodeListe any :  body.getAny()) {
            for (Opscode opscode : any.getOpscode()) {
                SdOpsCodeEo opCode = new SdOpsCodeEo();
                opCode.setHeadId(opsHead.getId());

                opCode.setOpCode(opscode.getV());
                opCode.setDescription(opscode.getDN());

                opCode.setStartDate(VersionHelper.extractStartDate(opscode.getGueltigkeit().getV()).toString());
                LocalDate endDate = VersionHelper.extractEndDate(opscode.getGueltigkeit().getV());
                opCode.setEndDate(endDate != null ? endDate.toString() : null);

                if (opscode.getKzmedbegruendung() != null && "J".equals(opscode.getKzmedbegruendung().getV())) {
                    opCode.setMedicalMotivation(true);
                }

                opCode.setSideLocation("J".equals(opscode.getKzseite().getV()));

                if (opscode.getKz115B() != null) {
                    opCode.setCategory(opscode.getKz115B().getV());
                    if ("s".equals(opscode.getKz115B().getV()) && opscode.getKz115BInfo() != null) {
                        opCode.setCategoryInfo(opscode.getKz115BInfo().getV());
                    }
                }

                opsCodes.add(opCode);
            }
        }

        return opsCodes;
    }
}
