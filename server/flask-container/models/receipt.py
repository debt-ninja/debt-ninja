from app import db
from sqlalchemy.dialects.postgresql import JSON


class Receipt(db.Model):
    __tablename__ = 'receipt'

    receipt_id = db.Column(db.Integer, primary_key=True)
    receipt_link = db.Column(db.String())
    receipt_timestamp = db.Column(db.DateTime())
    receipt_total = db.Column(db.Numeric())
    receipt_debt = db.Column(db.Numeric())
    user_id = db.Column(db.Integer, db.ForeignKey('user.id'))

    def __repr__(self):
        return '<id {}>'.format(self.id)
