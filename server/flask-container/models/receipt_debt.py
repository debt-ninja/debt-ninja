from app import db
from sqlalchemy.dialects.postgresql import JSON


class ReceiptDebt(db.Model):
    __tablename__ = 'receiptdebt'

    def __repr__(self):
        return '<id {}>'.format(self.id)
