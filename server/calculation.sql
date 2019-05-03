SELECT * FROM ReceiptDebt rd
JOIN Receipt r ON (r.receiptid = rd.receiptid)
WHERE r.userid <> rd.userid;

-- A: in debt
SELECT rd.userid, sum(debt) * -1 AS debt FROM ReceiptDebt rd
JOIN Receipt r ON (r.receiptid = rd.receiptid)
WHERE r.userid <> rd.userid
--AND r.receipttimestamp -- DATE CHECK --
GROUP BY rd.userid;

-- B: given credit
SELECT r.userid, sum(debt) AS debt FROM ReceiptDebt rd
JOIN Receipt r ON (r.receiptid = rd.receiptid)
WHERE r.userid <> rd.userid
GROUP BY r.userid;

-- Total calculation (pseudo sql) 
/*
SELECT pd.userid, pd.debt, nd.debt, pd.debt + nd.debt AS total 
FROM A pd
JOIN B nd ON (pd.userid = nd.userid);
*/