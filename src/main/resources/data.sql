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
 ('Ivan', 'Ivanovich', 'Ivanov', '01-01-2001', 'ivan@gmail.com'),
 ('Petr', 'Petrovich', 'Petrov', '02-02-2002', 'petrov@gmail.com'),
 ('Sidr', 'Sidorovich', 'Sidorov', '03-03-2003', 'sidorov@gmail.com');
