Desarrollo de Aplicaciones Cliente Servidor - 2017 - Ejemplos Docker
=

# Build
$ docker build -t "dacs:mysql" .

# Run

$ docker run -d -p 3306:3306 --name mysql-01 dacs:mysql

# Test

$ mysql --host=localhost --port=3306 --user=mysql --pasword=mysql --database=dacs

 