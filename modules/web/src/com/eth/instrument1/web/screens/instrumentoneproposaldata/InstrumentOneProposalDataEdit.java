package com.eth.instrument1.web.screens.instrumentoneproposaldata;

import com.haulmont.cuba.gui.screen.*;
import com.eth.instrument1.entity.InstrumentOneProposalData;

@UiController("instrument1_InstrumentOneProposalData.edit")
@UiDescriptor("instrument-one-proposal-data-edit.xml")
@EditedEntityContainer("instrumentOneProposalDataDc")
@LoadDataBeforeShow
public class InstrumentOneProposalDataEdit extends StandardEditor<InstrumentOneProposalData> {
}