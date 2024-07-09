# Conversor de monedas
software que consume ExchangeRate-API para mostrar conversiones de monedas. Proyecto desarrollado como parte de mi educación dentro del curso Oracle Next Education en la modalidddad de Backend.

# Descripción

Este proyecto es el primero de los 3 que conforman este modulo dentro de la modalidad Backend. El software desarrollado permite al usuario interactuar con un menú el cual ofrece 4 diferentes opciones de conversión de monedas a dolar, todo esto consumiendo la API ExchangeRate-API, que nos permite consultar valores asi como las funcionalidades de conversion.
El proyecto trabaja solicitando al usuario seleccionar una de las 5 opciones (4 de conversion y la ultima para cerrar el programa) mediante una interfaz de menú para posteriormente pedir que se ingrese la cantidad a convertir.
Una vez dada dicha cantidad se muestra un mensaje donde coloca el codigo ISO de la diviza a convertir seguido del monto y posteriormente la cantidad equivalente en Dolares Americanos.

# Tecnologias

### Lenguajes:
- Java.
### Bibliotecas:
- Gson.
### Entorno de desarrollo:
- IntelliJ IDE, entorno de desarrollo integrado.
### API´s:
- ExchangeRate-API.

# Funcionalidad

### Clase Principal 
Este es la clase main, en ella se incluye la logica principal como la fincionalidad de nuestro menú de opción multiple mostrado en la terminal y la gestión de las divizas a convertir.

### Clase Conversiones 
En esta clase declaramos todas las variables involucradas en nuestro programa, asi como los metodos encargados de generar el mensaje que mostrara el resultado de la conversion y almacenar el valor a convertir.

### Clase ConsultaAPI
Nuestra ultima clase es la encargada de hacer la llamada al API generando nuestro URI con los valores correspindientes almacenados en la clase anterior asi como retornar la respuesta con el resultado y pasandolo de un objeto en formato JSON a String para ser mostrado en la consola.

# Instrucciones

- Clonar el repositorio a tu PC.
- Descargar la biblioteca de GSON: https://search.maven.org/artifact/com.google.code.gson/gson
- Implementar la biblioteca al proyecto.
- Abrir la clase Principal y ejecutarla.

## Desarrollado por:

#### Javier Emilio Chua Camarena.

