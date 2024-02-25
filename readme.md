# LABORATORIO 5 - CVDS
## Integrantes:
* Camilo Nicolás Murcia Espinosa
* David Leonardo Piñeros Cortés

# Parte 1
### Peticion GET
![GitPrincipal](img/error1.png)
¿Qué codigo de error sale?, revise el significado del mismo en la lista de códigos de estado HTTP.

### Realice nueva conexion con Telnet

### Contar el número de caracteres

### Investigue: ¿Cuál esla diferencia entre los verbos GET y POST? ¿Qué otros tipos de peticiones existen?

**GET**: Es utilizado para solicitar datos de un recurso específico en un servidor. Cuando realizas una solicitud GET, los parámetros de la solicitud (si los hay) se envían en la URL. Esta solicitud es visible en la barra de direcciones del navegador y puede ser almacenada en caché por el navegador y por servidores intermedios (como proxies). Se usa comúnmente para recuperar información, como solicitar una página web o un recurso específico de una API.

**POST**: Es utilizado para enviar datos al servidor para su procesamiento. A diferencia de GET, los parámetros de la solicitud POST se envían en el cuerpo del mensaje HTTP, lo que permite enviar una cantidad mayor de datos que con GET. Esta solicitud no es visible en la barra de direcciones del navegador y no es almacenada en caché por el navegador. Se utiliza para enviar formularios en línea, cargar archivos y realizar otras acciones que requieren enviar datos al servidor.

Tenemos otras peticiones HTTP como:

- **PUT**: PUT significa "reemplazar". Sirve para actualizar un recurso completo en el servidor, como modificar un artículo en un blog.
- **DELETE**: DELETE es fácil de adivinar, significa "borrar". Elimina un recurso del servidor, como un archivo subido.
- **OPTIONS**: OPTIONS pregunta "¿qué puedes hacer?". Se usa para saber qué métodos admite un recurso específico.
- **HEAD**: Este método es como "mirar el escaparate". Te da información sobre un recurso sin descargarlo completo, como el tamaño o la fecha de modificación.
- **PATCH**: PATCH es como "arreglar un poco". Aplica modificaciones parciales a un recurso, sin necesidad de reemplazarlo entero.
- **TRACE**: Este método realiza una prueba de bucle de retorno de mensaje a lo largo de la ruta al recurso de destino.
- **CONNECT**: Este método establece un túnel hacia el servidor identificado por el recurso.

### Curl

curl "www.httpbin.org"

![GitPrincipal](img/curl1.png)

Utilice ahora el parámetro -v y con el parámetro -i:

-v: 
![GitPrincipal](img/curl2.png)

-i: 
![GitPrincipal](img/curl3.png)

Los parámetros -v e -i en el comando curl tienen distintos propósitos:

- -v: Al emplear este parámetro, se activa el modo detallado o "verbose". Esto conlleva a que curl proporcione información ampliada y detallada acerca de la transferencia de datos, presentando los pormenores tanto de la solicitud como de la respuesta. Este modo es útil para depurar y comprender el funcionamiento interno del proceso.
- -i: Por otro lado, al utilizar el parámetro -i, se añade la cabecera HTTP a la salida. curl mostrará tanto los encabezados de respuesta HTTP como los datos del cuerpo, combinándolos en la salida para una mejor comprensión del intercambio de información.



