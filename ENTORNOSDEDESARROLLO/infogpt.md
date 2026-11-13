# AC201 - Los IDE de MurgiTIC

**Módulo:** Entornos de Desarrollo  
**Curso:** 1.º DAW

## 1. IDE frente a editor de texto

Aunque se puede programar Java utilizando el Bloc de Notas y una terminal, trabajar con un IDE como IntelliJ IDEA o VS Code ofrece muchas más facilidades.

Un IDE integra diferentes herramientas que ayudan a programar de forma más rápida y a cometer menos errores.

Algunos de sus componentes principales son:

- **Editor de código:** permite escribir código con resaltado de sintaxis, autocompletado y detección de errores.
- **Depurador:** permite ejecutar el programa paso a paso, detenerlo mediante breakpoints y comprobar el valor de las variables.
- **Terminal integrada:** permite ejecutar comandos sin salir del entorno de desarrollo.
- **Control de versiones:** permite guardar y controlar los cambios realizados en el código mediante Git.

En mi opinión, utilizar un IDE facilita bastante el trabajo, ya que reúne en un mismo programa herramientas que, de otra manera, tendríamos que utilizar por separado.

## 2. IntelliJ IDEA y VS Code

IntelliJ IDEA y VS Code son dos entornos de desarrollo que comparten varias funciones, aunque su organización y funcionamiento tienen algunas diferencias.

**Tres funciones comunes:**

1. **Editor de código:** ambos permiten escribir código, utilizar el autocompletado y detectar errores.
2. **Terminal integrada:** permiten ejecutar comandos sin tener que salir del programa.
3. **Control de versiones:** los dos permiten trabajar con Git para controlar los cambios del proyecto.

**Dos diferencias:**

- **IntelliJ IDEA:** está especialmente optimizado para Java y dispone de herramientas avanzadas para analizar, desarrollar y depurar código.
- **VS Code:** es un entorno más ligero y personalizable, que permite añadir funcionalidades mediante extensiones.

Conocer los conceptos de editor, explorador de archivos, terminal, depurador y control de versiones facilita cambiar de un entorno a otro, porque las funciones principales siguen siendo prácticamente las mismas, aunque cambie su ubicación o los atajos de teclado.

## 3. Build y Rebuild

La diferencia entre Build Project y Rebuild Project está en la forma de compilar el proyecto.

- **Build Project:** realiza una compilación incremental. Esto significa que solamente vuelve a compilar las clases que han cambiado y sus dependencias. Es más rápido y se utiliza normalmente durante el desarrollo.
- **Rebuild Project:** realiza una reconstrucción completa. Primero limpia los archivos generados y las cachés y después vuelve a compilar todo el proyecto desde cero.

Si añadimos una dependencia y el IDE no la reconoce, antes de realizar una reconstrucción completa comprobaría que el proyecto Maven o Gradle se haya actualizado o sincronizado correctamente, para que reconozca las nuevas dependencias.

## 4. Instalación de herramientas: JDK e IntelliJ IDEA

El JDK y JetBrains Runtime tienen funciones diferentes.

El **JDK (Java Development Kit)** es el kit de desarrollo necesario para programar en Java. Incluye herramientas como `javac`, que permite compilar el código, además de la JVM y las bibliotecas necesarias.

Por otro lado, **JetBrains Runtime** viene incluido con IntelliJ IDEA y sirve para ejecutar el propio entorno de desarrollo, pero no sustituye al JDK necesario para desarrollar aplicaciones Java.

Por eso necesitamos configurar el **JDK 21 LTS** para poder compilar y ejecutar nuestros proyectos.

En cuanto a la edición de IntelliJ IDEA, el nuevo integrante podría instalar la **Community Edition**, que es gratuita y de código abierto, y resulta suficiente para las necesidades del curso de DAW. También existe la edición Ultimate, que es comercial.

## 5. Plugins y extensiones

Los plugins y las extensiones son complementos que se instalan en un entorno de desarrollo para añadir nuevas funcionalidades, como soporte para otros lenguajes, herramientas de depuración o análisis de código.

Su principal ventaja es que permiten adaptar el IDE a las necesidades de cada programador. Sin embargo, instalar demasiados puede consumir más recursos del ordenador y provocar que el entorno funcione más lentamente.

Para añadir un complemento relacionado con Java:

- **En IntelliJ IDEA:** entraría en Settings > Plugins, buscaría el complemento y pulsaría Install. Después sería necesario reiniciar el IDE.
- **En VS Code:** abriría la vista de extensiones con `Ctrl + Shift + X`, buscaría el complemento y pulsaría Install.

Para desactivarlo o eliminarlo, utilizaría el apartado de plugins o extensiones instaladas. En IntelliJ IDEA se puede desactivar sin eliminarlo o desinstalarlo completamente. En VS Code también se puede deshabilitar o desinstalar.

Considero que lo mejor es instalar únicamente los complementos que realmente necesitamos para evitar consumir recursos innecesariamente.