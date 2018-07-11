-- begin BIKEWORKSHOP_CLIENT
create table BIKEWORKSHOP_CLIENT (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    PHONE varchar(20) not null,
    EMAIL varchar(255),
    OTHER_CONTACTS varchar(255),
    --
    primary key (ID)
)^
-- end BIKEWORKSHOP_CLIENT
-- begin BIKEWORKSHOP_WORKER
create table BIKEWORKSHOP_WORKER (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    USER_ID varchar(36) not null,
    HOURLY_RATE decimal(19, 2) not null,
    --
    primary key (ID)
)^
-- end BIKEWORKSHOP_WORKER
-- begin BIKEWORKSHOP_SPARE_PART
create table BIKEWORKSHOP_SPARE_PART (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    TITLE varchar(255) not null,
    DESCRIPTION varchar(255),
    PRICE decimal(19, 2) not null,
    --
    primary key (ID)
)^
-- end BIKEWORKSHOP_SPARE_PART
-- begin BIKEWORKSHOP_ORDER
create table BIKEWORKSHOP_ORDER (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    CLIENT_ID varchar(36) not null,
    WORKER_ID varchar(36) not null,
    DESCRIPTION varchar(255),
    HOURS_SPENT integer,
    TOTAL_COST decimal(19, 2),
    STATUS integer not null,
    --
    primary key (ID)
)^
-- end BIKEWORKSHOP_ORDER
-- begin BIKEWORKSHOP_ORDER_SPARE_PART_LINK
create table BIKEWORKSHOP_ORDER_SPARE_PART_LINK (
    ORDER_ID varchar(36) not null,
    SPARE_PART_ID varchar(36) not null,
    primary key (ORDER_ID, SPARE_PART_ID)
)^
-- end BIKEWORKSHOP_ORDER_SPARE_PART_LINK
