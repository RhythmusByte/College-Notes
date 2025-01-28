## PSQL Commands
```sql
CREATE DATABASE employee_db;

CREATE TABLE employees (
    id SERIAL PRIMARY KEY,
    name VARCHAR(100),
    position VARCHAR(100),
    salary DECIMAL
);

INSERT INTO employees (name, position, salary)
VALUES
    ('John Doe', 'Software Engineer', 75000),
    ('Jane Smith', 'Project Manager', 85000),
    ('Alice Johnson', 'HR Manager', 65000);

SELECT * FROM employees;
```
