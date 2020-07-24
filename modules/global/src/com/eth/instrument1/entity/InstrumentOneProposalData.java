package com.eth.instrument1.entity;

import com.eth.proposals.entity.Proposal;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Table(name = "INSTRUMENT1_PROPOSAL_DATA")
@Entity(name = "instrument1_InstrumentOneProposalData")
public class InstrumentOneProposalData extends StandardEntity {
    private static final long serialVersionUID = -1348506208095316720L;

    @Lookup(type = LookupType.DROPDOWN, actions = "lookup")
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "PROPOSAL_ID")
    private Proposal proposal;

    @NotNull
    @Column(name = "MONEY_AMOUNT", nullable = false)
    private BigDecimal moneyAmount;

    @Lob
    @Column(name = "SHORT_DESCRIPTION")
    private String shortDescription;

    @Column(name = "PROPOSED_DEADLINE")
    private LocalDateTime proposedDeadline;

    public LocalDateTime getProposedDeadline() {
        return proposedDeadline;
    }

    public void setProposedDeadline(LocalDateTime proposedDeadline) {
        this.proposedDeadline = proposedDeadline;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public BigDecimal getMoneyAmount() {
        return moneyAmount;
    }

    public void setMoneyAmount(BigDecimal moneyAmount) {
        this.moneyAmount = moneyAmount;
    }

    public Proposal getProposal() {
        return proposal;
    }

    public void setProposal(Proposal proposal) {
        this.proposal = proposal;
    }
}