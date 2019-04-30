SET timezone = 'Europe/Vienna';

show timezone;

create table Users
(
    UserId   int not null,
    UserName varchar(255),
    primary key (UserId)
);

create table Receipts
(
    ReceiptId        int not null,
    ReceiptLink      varchar(255),
    ReceiptTimestamp timestamp,
    ReceiptTotal     numeric(5, 2),
    ReceiptDebt      numeric(5, 2),
    UserId           int,
    primary key (ReceiptId),
    foreign key (UserId) references Users (UserId)
);