package rafakob.sysidmath.bus;

import rafakob.sysidmath.sysid.identification.IdentificationModel;

/**
 * Author: Rafal Kobylko
 * Created on: 2015-04-08
 */
public class IdentificationFinishedEvent  {
    public final IdentificationModel idModel;

    public IdentificationFinishedEvent(IdentificationModel idModel) {
        this.idModel = idModel;
    }
}
