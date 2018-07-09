-- begin WORKSHOP_ORDER
create table WORKSHOP_ORDER (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    STATUS integer,
    CLIENT_ID varchar(36),
    WORKER_ID varchar(36),
    DESCRIPTION varchar(255),
    HOURS_SPEND integer,
    TOTAL_AMOUNT decimal(19, 2),
    --
    primary key (ID)
)^
-- end WORKSHOP_ORDER
-- begin WORKSHOP_WORKER
create table WORKSHOP_WORKER (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    USER_ID varchar(36),
    HOURLY_RATE decimal(19, 2),
    --
    primary key (ID)
)^
-- end WORKSHOP_WORKER
-- begin WORKSHOP_CLIENT
create table WORKSHOP_CLIENT (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255),
    PHONE varchar(255),
    EMAIL varchar(255),
    --
    primary key (ID)
)^
-- end WORKSHOP_CLIENT
-- begin WORKSHOP_SPARE_PART
create table WORKSHOP_SPARE_PART (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    TITLE varchar(255),
    DESCRIPTION varchar(255),
    PRICE decimal(19, 2),
    --
    primary key (ID)
)^
-- end WORKSHOP_SPARE_PART
-- begin WORKSHOP_ORDER_SPARE_PART_LINK
create table WORKSHOP_ORDER_SPARE_PART_LINK (
    SPARE_PART_ID varchar(36) not null,
    ORDER_ID varchar(36) not null,
    primary key (SPARE_PART_ID, ORDER_ID)
)^
-- end WORKSHOP_ORDER_SPARE_PART_LINK
