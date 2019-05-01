# Dept-Ninja Server

### Used Ports:
- 5432: PostgreSQL
- 84: pgAdmin
- 9000: MinIO
- 5000: flask

# Initial Start
1) Edit server.json 
    - Change __Host__ to server IP
2) Start

# Stop & delete Data
```sh
docker-compose down && docker-compose rm -f
```
# Build
```sh
docker-compose build
```

# Start
```sh
docker-compose up -d
```

# Stop
```sh
docker-compose down
```