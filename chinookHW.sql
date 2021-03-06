
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

--3.1
SELECT CURRENT_TIMESTAMP
FROM DUAL;

SELECT LENGTH(NAME)
FROM MEDIATYPE; 

--3.2
SELECT AVG(TOTAL)
FROM INVOICE; 

SELECT MAX(UNITPRICE)
FROM TRACK; 



--3.3
CREATE OR REPLACE FUNCTION AVG_INVOICELINE
RETURN SYS_REFCURSOR
IS 
S SYS_REFCURSOR;
BEGIN
    OPEN S FOR
    SELECT AVG(UNITPRICE) FROM INVOICELINE;
    RETURN S;
END;
/
--CALL FUNCTION
DECLARE
S SYS_REFCURSOR;
N INVOICELINE.UNITPRICE%TYPE; 
BEGIN
    S := AVG_INVOICELINE;
    LOOP
    FETCH S INTO N;
    EXIT WHEN S%NOTFOUND; -- BREAK OUT OF LOOP WHEN NO ROWS ARE AVAILABLE 
    DBMS_OUTPUT.PUT_LINE('Average: '||N);
    END LOOP;
    CLOSE S;
END;


--3.4
--CREATE FUNCTION
CREATE OR REPLACE FUNCTION AFTER_68
RETURN SYS_REFCURSOR
IS 
S SYS_REFCURSOR;
BEGIN
    OPEN S FOR
    SELECT BIRTHDATE FROM EMPLOYEE
    WHERE TO_NUMBER(BIRTHDATE) > 1968;
    RETURN S;
END;
/
--CALL FUNCTION
DECLARE
S SYS_REFCURSOR;
YOUNG_EMP EMPLOYEE.BIRTHDATE%TYPE;
BEGIN
    S := AFTER_68;
    LOOP
    FETCH S INTO YOUNG_EMP;
    EXIT WHEN S%NOTFOUND; -- BREAK OUT OF LOOP WHEN NO ROWS ARE AVAILABLE 
    DBMS_OUTPUT.PUT_LINE('Employees: '||YOUNG_EMP);
    END LOOP;
    CLOSE S;
END;

--4.1
CREATE OR REPLACE PROCEDURE FIRST_LAST
IS
FIRST_LAST_NAME INTEGER;
BEGIN
SELECT COUNT (E.LASTNAME)
INTO FIRST_LAST_NAME
FROM EMPLOYEE E
WHERE E.EMPLOYEEID =1;
END;

--4.2
--RETURN PERSONAL INFO
CREATE OR REPLACE PROCEDURE UPDATE_EMPLOYEE(E_ID IN NUMBER)
AS
BEGIN
UPDATE EMPLOYEE SET FIRSTNAME='Margaret'
WHERE EMPLOYEE.EMPLOYEEID = E_ID;
END;
/
BEGIN
UPDATE_EMPLOYEE(1);
END;
/
--RETURN MANAGERS
CREATE OR REPLACE PROCEDURE MANAGER_GET(E_ID IN NUMBER, MANAGERS OUT VARCHAR2)
IS
NAMES VARCHAR2(30);
BEGIN
SELECT COUNT (E.REPORTSTO)
INTO NAMES
FROM EMPLOYEE E
WHERE E.EMPLOYEEID = E_ID;
MANAGERS := NAMES;
END;
/

DECLARE
MANAGERS VARCHAR2(30);
BEGIN
MANAGER_GET(1, MANAGERS);
END;
/
-- 5.0
CREATE OR REPLACE PROCEDURE DELETE_TRANSACTION (GIVENID NUMBER)
AS
BEGIN
   DELETE FROM INVOICE WHERE INVOICEID = GIVENID;
   COMMIT;
END;

/
--6.1
INSERT INTO EMPLOYEE VALUES (11, 'Schmoe', 'Joe', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);

CREATE OR REPLACE TRIGGER TR_INSERT_EMPLOYEE
AFTER INSERT ON EMPLOYEE
FOR EACH ROW
BEGIN
   DBMS_OUTPUT.PUT_LINE('INSERT TRIGGER WORKED');
END;
/
INSERT INTO ALBUM VALUES (100000, NULL, NULL);
CREATE OR REPLACE TRIGGER TR_AFTER_ALBUM
AFTER INSERT ON ALBUM
FOR EACH ROW
BEGIN
   DBMS_OUTPUT.PUT_LINE('ALBUM INSERT TRIGGER WORKED');
END;
/
CREATE OR REPLACE TRIGGER TR_DELETE_CUSTOMER
AFTER DELETE ON CUSTOMER
FOR EACH ROW
BEGIN
   DBMS_OUTPUT.PUT_LINE('CUSTOMER DELETE TRIGGER WORKED');
END;
/
--7.1
SELECT CUSTOMER.FIRSTNAME, CUSTOMER.LASTNAME, INVOICE.INVOICEID
FROM CUSTOMER
INNER JOIN INVOICE ON CUSTOMER.CUSTOMERID = INVOICE.CUSTOMERID;
/
--7.2
SELECT CUSTOMER.CUSTOMERID, CUSTOMER.FIRSTNAME, CUSTOMER.LASTNAME, INVOICE.INVOICEID, INVOICE.TOTAL
FROM CUSTOMER
FULL OUTER JOIN INVOICE ON CUSTOMER.CUSTOMERID = INVOICE.CUSTOMERID;
/
--7.3
SELECT ARTIST.NAME, ALBUM.TITLE
FROM ALBUM
RIGHT OUTER JOIN ARTIST ON ALBUM.ARTISTID = ARTIST.ARTISTID;
/
--7.4
SELECT *
FROM ALBUM
CROSS JOIN ARTIST
ORDER BY ARTIST.NAME;
/
--7.5
SELECT *
FROM EMPLOYEE A, EMPLOYEE B
WHERE A.REPORTSTO = B.REPORTSTO;