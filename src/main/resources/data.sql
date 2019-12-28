drop table IF EXISTS student;

create TABLE student (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  first_name VARCHAR(250) NOT NULL,
  middle_name VARCHAR(250) DEFAULT NULL,
  last_name VARCHAR(250) NOT NULL,
  birth_date VARCHAR(250) DEFAULT NULL,
  email VARCHAR(250) DEFAULT NULL
);

insert into student (first_name, middle_name, last_name, birth_date, email) values
 ('Ivan', 'Ivanovich', 'Ivanov', '2001-01-01', 'ivanov@mail.ru'),
 ('Petr', 'Petrovich', 'Petrov', '2002-02-02', 'petrov@yandex.ru'),
 ('Sidor', 'Sidorovich', 'Sidorov', '2003-03-03', 'sidorov@gmail.com');
