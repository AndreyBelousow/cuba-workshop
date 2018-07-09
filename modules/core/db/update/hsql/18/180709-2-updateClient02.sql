alter table WORKSHOP_CLIENT alter column PHONE_NUMBER rename to PHONE_NUMBER__U90572 ^
alter table WORKSHOP_CLIENT alter column PHONE_NUMBER__U90572 set null ;
alter table WORKSHOP_CLIENT add column PHONE varchar(255) ;
alter table WORKSHOP_CLIENT alter column NAME set null ;
alter table WORKSHOP_CLIENT alter column EMAIL set data type varchar(255) ;
alter table WORKSHOP_CLIENT alter column EMAIL set null ;
