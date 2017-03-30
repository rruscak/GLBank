CREATE DATABASE GLBank;
USE GLBank;
CREATE TABLE Employees ( 
	idemp INTEGER AUTO_INCREMENT,
	firstname VARCHAR(20) NOT NULL,
	lastname VARCHAR(20) NOT NULL,
	email VARCHAR(30) NOT NULL UNIQUE,
	position CHAR(1) NOT NULL DEFAULT 'C',
	PRIMARY KEY (idemp) 
);
CREATE TABLE LoginEmployee ( 
	id INTEGER AUTO_INCREMENT,
	idemp INTEGER,
	login VARCHAR(15),
	password VARCHAR(60),
	PRIMARY KEY (id),
	FOREIGN KEY (idemp) 
		REFERENCES Employees(idemp)
		ON DELETE CASCADE ON UPDATE RESTRICT 
);
CREATE TABLE HistoryLoginEmployee ( 
	id INTEGER AUTO_INCREMENT,
	idemp INTEGER,
	LoginDate DATETIME,
	PRIMARY KEY (id),
	FOREIGN KEY (idemp) 
		REFERENCES Employees(idemp)
		ON DELETE CASCADE ON UPDATE RESTRICT 
);

INSERT INTO Employees VALUES(1, 'Janko', 'Hrasko', 'j.hrasko@gmail.com');
INSERT INTO Employees VALUES(2, 'Anicka', 'Dusicka', 'a.dusicka@gmail.com');
INSERT INTO Employees VALUES(3, 'Chuck', 'Norris', 'ch.norris@gmail.com');

INSERT INTO Employees VALUES(1 ,1 ,'janko', 'hrasko');
INSERT INTO Employees VALUES(2 ,2 , 'anicka', 'dusicka');
INSERT INTO Employees VALUES(3 ,3 , 'chuck', 'norris');

CREATE TABLE Clients(
	idc INTEGER AUTO_INCREMENT,
	firstname VARCHAR(20) NOT NULL,
	lastname VARCHAR(20) NOT NULL,
	disble CHAR(1) DEFAULT 'F',
	PRIMARY KEY (idc)
);
CREATE TABLE ClientDetails(
	idcd INTEGER AUTO_INCREMENT,
	idc INTEGER NOT NULL,
	street VARCHAR(30) NOT NULL,
	housenumber INTEGER NOT NULL,
	postcode CHAR(5) NOT NULL,
	city VARCHAR(20) NOT NULL,
	dob DATE NOT NULL,
	email VARCHAR(30),
	PRIMARY KEY (idcd),
	FOREIGN KEY (idc)
		REFERENCES Client(idc)
		ON DELETE CASCADE ON UPDATE RESTRICT
);
CREATE TABLE LoginClient(
	idlc INTEGER AUTO_INCREMENT,
	idc INTEGER NOT NULL,	
	login VARCHAR(15) NOT NULL UNIQUE,
	password VARCHAR(60) NOT NULL,
	blocked CHAR(5) DEFAULT 'F',
	PRIMARY KEY (idlc),
	FOREIGN KEY (idc)
		REFERENCES Client(idc)
		ON DELETE CASCADE ON UPDATE RESTRICT
);

INSERT INTO Clients VALUES(1, 'Janko', 'Hrasko', 'j.hrasko@gmail.com');
INSERT INTO Clients VALUES(2, 'Anicka', 'Dusicka', 'a.dusicka@gmail.com');
INSERT INTO Clients VALUES(3, 'Chuck', 'Norris', 'ch.norris@gmail.com');

INSERT INTO ClientDetails VALUES(1 ,1 ,'janko', 'hrasko');
INSERT INTO ClientDetails VALUES(2 ,2 , 'anicka', 'dusicka');
INSERT INTO ClientDetails VALUES(3 ,3 , 'chuck', 'norris');

CREATE TABLE Accounts(
	idacc BIGINT unique,
	idc INTEGER NOT NULL,
	balance FLOAT(10,2),
	PRIMARY KEY (idacc),
	FOREIGN KEY (idc)
		REFERENCES Client(idc)
		ON DELETE CASCADE ON UPDATE RESTRICT
);

INSERT INTO Accounts VALUES (4561232588,1,50.20);
INSERT INTO Accounts VALUES (9401953275,1,1250.15);
INSERT INTO Accounts VALUES (28161353,1,98555.33);
INSERT INTO Accounts VALUES (1111886952,2,4521.84);