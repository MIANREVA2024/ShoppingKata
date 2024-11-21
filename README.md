# Shopping Kata

Implementaremos una Kata.

## Objetivos de Aprendizaje

- Practicar principios de OOP (Abstracción, Encapsulación, Herencia, Polimorfismo, Interfaces) usando TDD.

## Requisitos

1. Hay que usar TDD. Recuerda: **Test → Red → Green → Refactor **
2. No puedes escribir código sin un test que falle
3. No puedes escribir nuevos tests que no fallen.
4. Escribe siempre la solución más sencilla que haga pasar los tests. Refactoriza después.


## Funcionalidades

- Todos los productos tienen **nombre y precio**
- A los productos de alimentación (`FoodProduct`) se les puede añadir un descuento (%):
    - El precio de un producto sin descuento es el precio original del producto
    - El precio de un producto con descuento es el precio original con el descuento del % asignado
- Al carro de la compra `Cart` se le pueden añadir productos uno a uno (pero no puede tener dos productos repetidos).
- Podemos consultar la lista de productos añadidos al carrito.
- El carrito permite eliminar un producto por su nombre.
- El carro de la compra `Cart` contiene un número de productos (puede ser cero).
- El coste total del carro es la suma de los precios de los productos aplicando los descuentos.
- Los productos de tipo `Book` tienen un autor y una descripción (además de nombre y precio) y se les puede añadir un descuento pero no mayor del 10%.

## Tecnologías Utilizadas

Este proyecto utiliza las siguientes tecnologías y herramientas:

- **Java 21 (Corretto)**: Lenguaje de programación principal.
- **JUnit 5**: Framework para la implementación de tests unitarios.
- **Maven**: Sistema de gestión de dependencias y compilación.
- **Git**: Control de versiones para la gestión de cambios en el código.
- **IntelliJ IDEA / Eclipse**: IDEs recomendados para desarrollo en Java.
- **draw.io**: Herramienta para crear diagramas UML.

## Arquitectura del Proyecto

- Uso de clases abstractas y herencia para modelar productos.
- Gestión de productos dentro del carrito utilizando una lista.
- Uso de excepciones personalizadas para manejar errores específicos.

## Estructura del Proyecto

El proyecto está compuesto por las siguientes clases:
- **Main.java**: Punto de entrada de la aplicación. 
- **Product.java**: Clase Principal.
- **Book.java**: Clase heredada de Clase Product.
- **FoodProduct.java**: Clase heredada de clase Product.
- **FreeProduct**: 
- **Cart**: en esta clase gestionaremos los productos en el carrito.
- **Tests**: Se han implementado pruebas unitarias básicas para verificar el funcionamiento de los metodos.

## Características
- **Modelo orientado a objetos:** 
    - Los productos se modelan mediante clases específicas que aplican principios de herencia y polimorfismo.
  
- **Carrito de compras funcional:** 

    - Permite agregar, eliminar y listar productos sin duplicados.
  
- **Descuentos inteligentes:**
    - `FoodProduct`: Descuento variable según configuración.
    - `Book`: Descuento limitado al 10%.
- **Validaciones estrictas:** 

    - Manejo de excepciones personalizadas para productos duplicados o valores inválidos.

- **Diseño limpio y probado:** 
 
    - Proyecto desarrollado utilizando TDD (Desarrollo Guiado por Pruebas).

## Autor

Miguel Reyes ![https://www.linkedin.com/in/miguelreyesvasquez/]( icons8-linkedin-48.png "Logo linkedIn")


## Diagrama UML

