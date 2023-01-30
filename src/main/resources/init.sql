CREATE TABLE employees (
    id         SERIAL NOT NULL,
    name       VARCHAR(255),
    email      VARCHAR(255),
    department VARCHAR(255),
    CONSTRAINT employees_pkey PRIMARY KEY (id)
);

INSERT INTO employees(name, email, department) VALUES ('Petro Kobevko', 'kobevkopi@gmail.com', 'IT');
INSERT INTO employees(name, email, department) VALUES ('Ivan Voronin', 'voroninvanya@gmail.com', 'Art');
INSERT INTO employees(name, email, department) VALUES ('Natalia Kyrylenko', 'natalkapoltavka@gmail.com', 'Desing');