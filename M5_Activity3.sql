

CREATE TABLE students (
	id SERIAL PRIMARY KEY NOT NULL,
	name VARCHAR(50) NOT NULL,
	age INT,
	email VARCHAR(100) UNIQUE
);

CREATE TABLE courses (
   id SERIAL PRIMARY KEY NOT NULL,
   student_id INT,
   course_name VARCHAR(50),
   grade VARCHAR(2),
   FOREIGN KEY (student_id) REFERENCES students(id)
);

INSERT INTO students (name, age, email)
VALUES ('Juan Dela Cruz', 20, 'juan@example.com');
commit;

INSERT INTO students (name, age, email)
VALUES ('Marie Santos', 21, 'marieexample.com');
commit;

INSERT INTO students (name, age, email)
VALUES ('Jenny Miller', 23, 'Jenny@example.com');
commit;

INSERT INTO students (name, age, email)
VALUES ('Honey Mendez', 21, 'honeyexample.com');
commit;

INSERT INTO students (name, age, email)
VALUES ('Jon Chua', 25, 'jon@example.com');


INSERT INTO courses (student_id, course_name, grade)
VALUES (1, 'Algebra', '90');

INSERT INTO courses (student_id, course_name, grade)
VALUES (2, 'Trigonometry', '95');

INSERT INTO courses (student_id, course_name, grade)
VALUES (3, 'Geometry', '80');


select * from courses;
select * from students;