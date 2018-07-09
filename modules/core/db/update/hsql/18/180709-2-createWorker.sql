alter table WORKSHOP_WORKER add constraint FK_WORKSHOP_WORKER_ON_USER foreign key (USER_ID) references SEC_USER(ID);
create index IDX_WORKSHOP_WORKER_ON_USER on WORKSHOP_WORKER (USER_ID);
