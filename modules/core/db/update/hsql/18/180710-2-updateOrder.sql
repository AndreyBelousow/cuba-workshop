-- update WORKSHOP_ORDER set CLIENT_ID = <default_value> where CLIENT_ID is null ;
alter table WORKSHOP_ORDER alter column CLIENT_ID set not null ;
-- update WORKSHOP_ORDER set WORKER_ID = <default_value> where WORKER_ID is null ;
alter table WORKSHOP_ORDER alter column WORKER_ID set not null ;
