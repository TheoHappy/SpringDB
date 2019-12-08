CREATE TABLE Student
(
    studentId serial primary key,
    firstName varchar(15) not null,
    lastName  varchar(15) not null,
    gender    varchar(15) not null,
    "group"   varchar(15) not null,
    average   float       not null
);


INSERT INTO Student(firstName, lastName, gender, "group", average) VALUES ('Teodor','Vrabie','male','Fi-181',9);

SELECT *FROM Student;


