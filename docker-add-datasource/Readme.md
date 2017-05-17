Desarrollo de Aplicaciones Cliente Servidor - 2017 - Ejemplos Docker
=

# Build
$ docker build -t "dacs:add-datasource" .

# Run

$ docker run -d -p 8080:8080 --name ds-01 dacs:add-datasource
 
