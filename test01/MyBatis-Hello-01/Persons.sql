use SPRING;

drop table PERSONS;

CREATE TABLE IF NOT EXISTS PERSONS (
    ID     bigint        AUTO_INCREMENT, /* generated by default as identity (start with 1), */
    NAME   varchar(255)  CHARACTER SET utf8,
    primary key (ID)
);

