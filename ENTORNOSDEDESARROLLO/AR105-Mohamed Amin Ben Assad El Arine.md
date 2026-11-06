# AR105-Mohamed Amin Ben Assad El Arine

Mohamed Amin Ben Assad El Arine 

### **Objetivos de aprendizaje:**

- Diferenciar código fuente, código objeto y ejecutable
- Explicar cómo el bytecode y la JVM aportan portabilidad
- Evaluar la funcionalidad de las herramientas CASE
#### **Resultado**

## 1. Diferencias y compromisos entre lenguajes compilados e interpretados

Los lenguajes compilados, como C y C++, necesitan un compilador que transforme el código fuente en código máquina, o código objeto. Después, se utiliza un enlazador para unir el código con las bibliotecas necesarias y crear el archivo ejecutable. La principal ventaja de estos lenguajes es que suelen ejecutar los programas con bastante rapidez. Además, el ejecutable se puede distribuir sin necesidad de entregar el código fuente. Como inconveniente, normalmente hay que compilar el programa para cada sistema, y volver a hacerlo cuando se modifica el código.

Por otro lado, los lenguajes interpretados, como PHP y JavaScript, utilizan un intérprete o un entorno de ejecución para ejecutar el código. Esto hace que sea más cómodo trabajar con ellos y realizar cambios durante el desarrollo. Sin embargo, en algunos casos, pueden ser más lentos que los compilados y el código fuente puede quedar más accesible.

En cuanto a la seguridad, los lenguajes compilados permiten ocultar mejor el código original, aunque eso no significa que el programa sea totalmente seguro. En los lenguajes interpretados, al poder acceder más fácilmente al código, puede resultar más sencillo copiarlo o modificarlo.

En resumen, los lenguajes compilados suelen destacar por su velocidad, mientras que los interpretados ofrecen más comodidad y flexibilidad a la hora de desarrollar.

## 2. El papel de la máquina virtual en la portabilidad de Java

Java funciona de forma un poco diferente a otros lenguajes. Primero, el compilador convierte el código fuente en bytecode, que se guarda en archivos con la extensión «.class». Después, la Máquina Virtual de Java (JVM) se encarga de ejecutar ese código. Para ello, puede interpretarlo o utilizar la compilación JIT, que ayuda a mejorar el rendimiento.

La principal ventaja de la JVM es que permite ejecutar el mismo programa en distintos sistemas operativos, como Windows, Linux o macOS, sin necesidad de volver a compilarlo para cada uno de ellos, siempre que tengan una JVM compatible. Por eso, se suele decir que Java permite escribir el código una vez y ejecutarlo en diferentes plataformas.

Es importante tener en cuenta que la JVM ejecuta el bytecode, no el código fuente de Java, directamente. Esto es lo que facilita que un mismo programa pueda funcionar en distintos sistemas.

No obstante, pueden surgir problemas de compatibilidad si el programa utiliza funciones específicas de un sistema operativo o bibliotecas nativas.

## 3. Herramientas CASE y su papel en la productividad

Las herramientas CASE son programas que ayudan a desarrollar software de una forma más sencilla y organizada. Sirven para ahorrar tiempo, reducir errores, crear documentación y facilitar el mantenimiento de los programas.

Se pueden clasificar en tres tipos, según la fase del desarrollo en la que se utilizan:

- **U-CASE (Upper CASE):** se utilizan al principio del proyecto, por ejemplo, para analizar los requisitos, planificar el trabajo o diseñar el sistema. Un ejemplo serían las herramientas para crear diagramas UML.
- **M-CASE (Middle CASE):** se usan durante el diseño más detallado y la programación. Algunas permiten generar parte del código a partir de modelos diseñados previamente.
— **L-CASE (Lower CASE):** se utilizan en las últimas fases del desarrollo, como las pruebas, la búsqueda de errores, la instalación y el mantenimiento del programa.

En conclusión, las herramientas CASE ayudan a trabajar de forma más rápida y organizada durante el desarrollo de software. Además, permiten detectar errores antes, y hacen que sea más fácil mantener las aplicaciones con el tiempo.