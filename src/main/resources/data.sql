drop table IF EXISTS student;
drop sequence IF EXISTS student_seq;

create TABLE student (
  id INT PRIMARY KEY,
  first_name VARCHAR(250) NOT NULL,
  middle_name VARCHAR(250) DEFAULT NULL,
  last_name VARCHAR(250) NOT NULL,
  birth_date VARCHAR(250) DEFAULT NULL,
  email VARCHAR(250) DEFAULT NULL
);

create sequence student_seq
minvalue 1
maxvalue 9223372036854775807
start with 1
increment by 1
cache 8
nocycle;

insert into student (id, first_name, middle_name, last_name, birth_date, email) values
 (student_seq.nextval, 'Ivan', 'Ivanovich', 'Ivanov', '2001-01-01', 'ivanov@mail.ru'),
 (student_seq.nextval, 'Petr', 'Petrovich', 'Petrov', '2002-02-02', 'petrov@yandex.ru'),
 (student_seq.nextval, 'Sidor', 'Sidorovich', 'Sidorov', '2003-03-03', 'sidorov@gmail.com');
