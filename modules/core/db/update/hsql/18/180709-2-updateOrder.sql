alter table WORKSHOP_ORDER alter column BIKE rename to BIKE__U18143 ^
alter table WORKSHOP_ORDER alter column BIKE__U18143 set null ;
alter table WORKSHOP_ORDER alter column CUSTOMER rename to CUSTOMER__U36375 ^
alter table WORKSHOP_ORDER alter column CUSTOMER__U36375 set null ;
alter table WORKSHOP_ORDER alter column STATE rename to STATE__U94334 ^
alter table WORKSHOP_ORDER alter column STATE__U94334 set null ;
alter table WORKSHOP_ORDER add column STATUS integer ;
alter table WORKSHOP_ORDER add column CLIENT_ID varchar(36) ;
alter table WORKSHOP_ORDER add column WORKER_ID varchar(36) ;
alter table WORKSHOP_ORDER add column HOURS_SPEND integer ;
alter table WORKSHOP_ORDER add column TOTAL_AMOUNT decimal(19, 2) ;
