
--2.1
SELECT *
FROM employee; 


SELECT *
FROM employee
WHERE LASTNAME = 'King'; 

SELECT *
FROM employee
WHERE FIRSTNAME = 'Andrew'
AND REPORTSTO IS NULL; 

--2.2
SELECT *
FROM ALBUM
ORDER BY TITLE DESC; 


SELECT FIRSTNAME
FROM CUSTOMER
ORDER BY CITY ASC; 

--2.3
INSERT INTO GENRE VALUES (26, 'Country');
INSERT INTO GENRE VALUES (27, 'Trap Musik');

INSERT INTO EMPLOYEE VALUES(9, 'Watts', 'Robbin','IT Staff',6,null,null,null,null,null,null,null,null,null,'Robbin@chinookcorp.com'); 
INSERT INTO EMPLOYEE VALUES (10, 'Trevino', 'Danny','IT Staff',6,null,null,null,null,null,null,null,null,null,'Danny@chinookcorp.com'); 

INSERT INTO CUSTOMER VALUES(60, 'SandwichMan', 'Tarek','IT Staff',6,null,null,null,null,null,null,'tarek@chinookcorp.com',null); 
INSERT INTO CUSTOMER VALUES (61, 'DollaSign', 'Jquery','IT Staff',6,null,null,null,null,null,null,'drugs@chinookcorp.com',null); 

--2.4
UPDATE CUSTOMER SET FIRSTNAME  = 'Robert'
WHERE FIRSTNAME = 'Aaron';

UPDATE CUSTOMER SET LASTNAME  = 'Walter'
WHERE LASTNAME= 'Mitchell';



UPDATE ARTIST SET NAME  = 'CCR'
WHERE NAME = 'Creedence Clearwater Revival';

--2.5
SELECT * FROM INVOICE
WHERE BILLINGADDRESS LIKE 'T%';

--2.6
SELECT * FROM INVOICE
WHERE TOTAL BETWEEN 15 AND 50;

SELECT EMPLOYEEID FROM EMPLOYEE
WHERE HIREDATE BETWEEN '01-JUN-03' AND '01-MAR-04';

--2.7
ALTER TABLE INVOICE
DROP CONSTRAINT FK_INVOICECUSTOMERID; 

DELETE FROM CUSTOMER 
WHERE FIRSTNAME ='Robert' AND LASTNAME='Walter';  

