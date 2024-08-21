# Database

```yaml 
sudo su
```

> Enter your password
---
```yaml
su postgres
```
---
```yaml
psql -d template1
```
---
```yaml
create user username with password 'password';
```
---
```yaml
creata database databaseName;
```

---

```yaml
grant all on database databaseName to username;
```

> Open new terminal

---

```yaml
psql -h localhost -U username -d databaseName
```
Enter the database password
---
Now create a table

```yaml
create table tableName(id int primary key, name varchar(20), salary int);
```
---
```yaml
insert into tableName values(1, 'name', 1000), (2, 'name', 1000);
```
---
```yaml
select * from tableName;
```

---

```yaml
export CLASSPATH=/home/rhythmusbyte/Desktop/JAVA/postgresql-42.7.3.jar
```
