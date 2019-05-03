TRUNCATE TABLE ReceiptDebt CASCADE;
TRUNCATE TABLE Receipt CASCADE;
TRUNCATE TABLE AppUser CASCADE;

ALTER SEQUENCE appuser_userid_seq RESTART 1;
ALTER SEQUENCE receipt_receiptid_seq RESTART 1;

INSERT INTO AppUser (username) VALUES ('Person A');
INSERT INTO AppUser (username) VALUES ('Person B');
INSERT INTO AppUser (username) VALUES ('Person C');

INSERT INTO Receipt (receiptid, receipttotal, receiptdebt, userid) VALUES (1, 70, 50, 1);
INSERT INTO ReceiptDebt (receiptid, userid, debt) VALUES (1, 1, 20);
INSERT INTO ReceiptDebt (receiptid, userid, debt) VALUES (1, 2, 10);
INSERT INTO ReceiptDebt (receiptid, userid, debt) VALUES (1, 3, 20);

INSERT INTO Receipt (receiptid, receipttotal, receiptdebt, userid) VALUES (2, 30, 30, 2);
INSERT INTO ReceiptDebt (receiptid, userid, debt) VALUES (2, 1, 10);
INSERT INTO ReceiptDebt (receiptid, userid, debt) VALUES (2, 2, 10);
INSERT INTO ReceiptDebt (receiptid, userid, debt) VALUES (2, 3, 10);

INSERT INTO Receipt (receiptid, receipttotal, receiptdebt, userid) VALUES (3, 50, 50, 3);
INSERT INTO ReceiptDebt (receiptid, userid, debt) VALUES (3, 1, 10);
INSERT INTO ReceiptDebt (receiptid, userid, debt) VALUES (3, 2, 10);
INSERT INTO ReceiptDebt (receiptid, userid, debt) VALUES (3, 3, 30);

INSERT INTO Receipt (receiptid, receipttotal, receiptdebt, userid) VALUES (4, 20, 20, 2);
INSERT INTO ReceiptDebt (receiptid, userid, debt) VALUES (4, 1, 5);
INSERT INTO ReceiptDebt (receiptid, userid, debt) VALUES (4, 2, 10);
INSERT INTO ReceiptDebt (receiptid, userid, debt) VALUES (4, 3, 5);