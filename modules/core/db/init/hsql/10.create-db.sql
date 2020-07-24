-- begin INSTRUMENT1_PROPOSAL_DATA
create table INSTRUMENT1_PROPOSAL_DATA (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    PROPOSAL_ID varchar(36) not null,
    MONEY_AMOUNT decimal(19, 2) not null,
    SHORT_DESCRIPTION longvarchar,
    PROPOSED_DEADLINE timestamp,
    --
    primary key (ID)
)^
-- end INSTRUMENT1_PROPOSAL_DATA
