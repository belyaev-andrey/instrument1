package com.eth.instrument1.web.screens.instrumentoneproposaldata;

import com.haulmont.cuba.gui.screen.*;
import com.eth.instrument1.entity.InstrumentOneProposalData;

@UiController("instrument1_InstrumentOneProposalData.browse")
@UiDescriptor("instrument-one-proposal-data-browse.xml")
@LookupComponent("instrumentOneProposalDatasTable")
@LoadDataBeforeShow
public class InstrumentOneProposalDataBrowse extends StandardLookup<InstrumentOneProposalData> {
}