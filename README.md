# migration guide springboot 2.7.x to 3.1.x

## branches
* master branch: as is (spring boot 2.7.x code)
* springboot3 branch: to be (migrated code on spring boot 3.1.x)


## related features
* filter
* interceptor
* rest controller
* mybatis
* jpa
* swagger

## guide pages
* youtube: 

* blog:

## sql query for test
### create table
create table simple
(
id varchar,
name varchar
);

### insert data
insert into SIMPLE (ID, NAME) values ('1', 'banana');
insert into SIMPLE (ID, NAME) values ('2', 'apple');