package com.eth.instrument1.core.role;

import com.haulmont.cuba.security.app.role.AnnotatedRoleDefinition;
import com.haulmont.cuba.security.app.role.annotation.Role;
import com.haulmont.cuba.security.app.role.annotation.ScreenAccess;
import com.haulmont.cuba.security.role.ScreenPermissionsContainer;

@Role(name = Instrument1UserRole.NAME)
public class Instrument1UserRole extends AnnotatedRoleDefinition {
    public final static String NAME = "Instrument1User";

    @ScreenAccess(screenIds = {"instrument1_InstrumentOneProposalData.browse", "application-instrument1", "proposals_Proposal.browse", "application-proposals", "instrument1_InstrumentOneProposalData.edit"})
    @Override
    public ScreenPermissionsContainer screenPermissions() {
        return super.screenPermissions();
    }
}
