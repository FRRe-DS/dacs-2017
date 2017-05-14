Desarrollo de Aplicaciones Cliente Servidor - 2017 - Ejemplos Docker
=

# Build
$ mvn clean package && docker build -t "dacs:jax-rs" .

# Run

$ docker run -d -p 8080:8080 --name jax-rs-01 dacs:jax-rs

# Test

$ curl http://localhost:8080/docker-jax-rs/api/dacs

 