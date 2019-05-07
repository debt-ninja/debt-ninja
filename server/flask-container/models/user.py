from app import db
from sqlalchemy.dialects.postgresql import JSON


class AppUser(db.Model):
    __tablename__ = 'appuser'

    user_id = db.Column(db.Integer, primary_key=True)
    user_name = db.Column(db.String())

    def __init__(self, user_id, user_name):
        self.user_name = user_name

    def __repr__(self):
        return '<id {}>'.format(self.id)