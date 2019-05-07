import os

class Config(object):
    DEBUG = False
    TESTING = False
    SQLALCHEMY_DATABASE_URI = 'jdbc:postgresql://localhost:5432/ninjadb'
    POSTGRES_DB= "ninjadb"
    POSTGRES_USER = "ninja"
    POSTGRES_PASSWORD = "visibleNinja"


class ProductionConfig(Config):
    DEBUG = False



class DevelopmentConfig(Config):
    SQLALCHEMY_DATABASE_URI = 'jdbc:postgresql://192.168.99.100:5432/ninjadb'
    DEVELOPMENT = True
    DEBUG = True

