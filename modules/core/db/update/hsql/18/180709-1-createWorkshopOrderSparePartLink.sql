create table WORKSHOP_ORDER_SPARE_PART_LINK (
    SPARE_PART_ID varchar(36) not null,
    ORDER_ID varchar(36) not null,
    primary key (SPARE_PART_ID, ORDER_ID)
);
