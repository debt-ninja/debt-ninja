DROP TABLE ReceiptDebt;
DROP TABLE Receipt;
DROP TABLE AppUser;

SET timezone = 'Europe/Vienna';

show timezone;

CREATE TABLE AppUser
(
    UserId   SERIAL,
    UserName VARCHAR(255),
    PRIMARY KEY (UserId)
);

CREATE TABLE Receipt
(
    ReceiptId        SERIAL,
    ReceiptLink      VARCHAR(255),
    ReceiptTimestamp TIMESTAMP,
    ReceiptTotal     NUMERIC(5, 2),
    ReceiptDebt      NUMERIC(5, 2),
    UserId           INT,
    PRIMARY KEY (ReceiptId),
    FOREIGN KEY (UserId) REFERENCES AppUser (UserId)
);


CREATE TABLE ReceiptDebt
(
    ReceiptId        int not null,
    Debt      NUMERIC(5, 2),
    UserId           INT,
    PRIMARY KEY (ReceiptId, UserId),
    FOREIGN KEY (ReceiptId) REFERENCES Receipt (ReceiptId),
    FOREIGN KEY (UserId) REFERENCES AppUser (UserId)
);