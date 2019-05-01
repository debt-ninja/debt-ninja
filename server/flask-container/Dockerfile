FROM python:3.7.3
EXPOSE 5000
ADD . /flask_app
WORKDIR /flask_app
RUN pip install -r requirements.txt
CMD python app.py