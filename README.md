# banco-nacional
# Marco Wilson Pineda Guaraca

La configuración de comunicación asíncrona se validó mediante rabbit para que la misma funcione correctamente e debe validar que rabbit se encuentre operativo y levantado dentro el servidor.

Caso contrario para probar los APIS se puede comentar la línea 30 de ClienteService.
En el caso practico se hicieron pruebas con postman, presentando una respuesta acorde a los solicitado.
Se realizaron pruebas con swagger.
El desarrollo esta con la base de datos relacion SQL Server
Esta moquiado la prueba unitaria solicitada.

Se realizo un pequeño front en Angular, para verificar el funcionamiento de uno de los endpoint




Validación Docker comandos:

docker build -t micro1 .
docker build -t micro2 .

docker run -d --name micro1 -p 8080:8080 micro1
docker run -d --name micro2 -p 8081:8081 micro2

docker ps