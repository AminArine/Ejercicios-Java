# AC201-Mohamed Amin Ben Assad El Arine
**Mohamed Amin Ben Assad El Arine**
**Módulo:** Entornos de Desarrollo  
**Curso:** 1.º DAW

## Enunciados/Respuesta
### Ejercicio 1.1
*IDE frente a editor de texto: Un compañero afirma que para programar en Java basta con el Bloc de Notas y una terminal. Explica qué ventajas ofrecen IntelliJ IDEA o VS Code frente a un editor de texto plano. Menciona al menos tres componentes de un IDE y explica cómo ayudan durante el desarrollo.*

 -->El editor de código es la herramienta principal que permite escribir y modificar el código fuente del programa. Sus funciones clave incluyen:
*  **Resaltado de sintaxis:** Muestra de forma visual las palabras reservadas según el lenguaje de programación utilizado.
*  **Autocompletado de código:** Ofrece sugerencias que ayudan a completar el código. En el contexto de VS Code, esto se conoce como IntelliSense.
*  **Análisis de código:** Incluye un analizador léxico (que corrige palabras mal escritas) y un analizador sintáctico (que informa si la estructura está bien realizada).
En cambio un bloc de notas no esta preparado para ser usado en el mundo de la programcion.
En mi opinión, utilizar un IDE facilita bastante el trabajo, ya que reúne en un mismo programa herramientas que, de otra manera, tendríamos que utilizar por separado.


El editor de código funciona como la herramienta principal para escribir o modificar todo el fuente del programa.
* Sus funciones esenciales abarcan:
  
-- **Resaltado de sintaxis** donde se muestra visualmente palabras reservadas segun cada lenguaje de programacion utilizado.

-- **Autocompletado de código** el cual ofrece sugerencias para ayudar a completar sentencias siendo conocido en VS Code como IntelliSense.

-- **Análisis de código** incluyendo un analizador léxico que corrige palabras mal escritas además de un sintáctico informando si la estructura esta bien realizada.


Un simple bloc de notas no esta preparado para ser usado en el mundo de la programacion.A mi parecer utilizar un IDE facilita bastante el trabajo puesto que reúne en un mismo programa herramientas que de otra forma tendriamos que usar por separado.


---

### Ejericicio 1.2

*IntelliJ IDEA y VS Code: Una persona empieza a trabajar con un proyecto en IntelliJ IDEA y después debe continuar en VS Code. Describe tres conceptos o funciones comunes y dos diferencias entre ambos entornos. Explica por qué conocer los conceptos de editor, explorador, terminal, depurador o control de versiones facilita el cambio, aunque las interfaces y los atajos no sean idénticos.*

**Tres funciones comunes:**

- **Ventanas de Herramientas (Tool Windows):** Proporcionan funcionalidades complementarias a la edición de código. Por defecto, están acopladas a los lados y al fondo de la ventana principal. Se puede acceder a ellas mediante la barra de iconos laterales o atajos de teclado. Por ejemplo, Alt+1 abre la ventana de Proyecto, y F12 salta desde el editor a la última Tool Window activa.
- **Gutter**: El panel a la izquierda del editor contiene iconos de acción para corregir problemas de código, ejecutar o depurar. También muestra números de línea, puntos de ruptura (breakpoints) y marcadores (bookmarks). Permite el plegado de código y marca las líneas modificadas bajo control de versiones.
- **Barra de Estado (Status Bar):** Se encuentra en la parte inferior de la ventana principal.
    Mensajes: En el lado izquierdo, muestra mensajes de eventos recientes y el progreso de las tareas en segundo plano (Background Tasks).
    Widgets: En el lado derecho, contiene widgets que indican el estado del archivo y del proyecto. Por ejemplo, muestran el número de línea y columna (como 52:11), las terminaciones de línea (LF o CRLF), la codificación (UTF-8) y el estilo de sangría.

**Dos diferencias:**

- **IntelliJ IDEA:** está especialmente optimizado para Java y dispone de herramientas avanzadas para analizar, desarrollar y depurar código.
- **VS Code:** es un entorno más ligero y personalizable, que permite añadir funcionalidades mediante extensiones.

Conocer los conceptos de editor, explorador de archivos, terminal, depurador y control de versiones facilita cambiar de un entorno a otro, porque las funciones principales siguen siendo prácticamente las mismas, aunque cambie su ubicación o los atajos de teclado.


Tres funciones comunes:

Ventanas de Herramientas Ofrecen funcionalidades extras para editar código. Estas se sitúan por defecto en los costados o el fondo de la pantalla principal. Es posible acceder mediante iconos laterales o usar atajos de teclado. Por ejemplo Alt+1 abre Proyecto y F12 saltan desde el editor a la última ventana activa.

Gutter Este panel situado a la izquierda contiene iconos para ejecutar, depurar o arreglar código. También muestra números de línea, marcadores y puntos de ruptura. Permite el plegado de código y marca las líneas que ha sido modificadas bajo control de versiones.

Barra de Estado Ubicada en la parte inferior de la ventana principal.
Mensajes En el lado izquierdo se muestra mensajes de eventos recientes o el progreso de las tareas en segundo plano.
Widgets En el lado derecho contiene widgets que indica el estado del archivo y del proyecto. Muestran, por ejemplo, tanto la línea como la columna (52:11), igual que la codificación UTF-8, estilo de sangría y las terminaciones de línea LF o CRLF.

Dos diferencias:

- IntelliJ IDEA: tiene una optimización especial para Java, además ofrece herramientas muy avanzadas para depurar, analizar o desarrollar código.
- VS Code: resulta un entorno mucho más ligero y personalizable, donde añadir funcionalidades mediante extensiones es posible.

Dominar los conceptos de depurador, explorador, terminal, editor y control de versiones hace más sencillo saltar entre entornos, pues las funciones principales se mantienen casi iguales, pese a que su ubicación o los atajos de teclado cambie.

---

### Ejericicio 1.3
*Build y Rebuild: Al modificar un proyecto Java, IntelliJ IDEA ofrece Build Project y Rebuild Project. Explica la diferencia entre una compilación incremental y una reconstrucción completa. Si se ha añadido una dependencia y el IDE no la reconoce, ¿qué actualización del proyecto comprobarías antes de decidir que hace falta reconstruirlo?*

La diferencia entre Build Project y Rebuild Project está en la forma de compilar el proyecto.

- **Build Project:** realiza una compilación incremental. Esto significa que solamente vuelve a compilar las clases que han cambiado y sus dependencias. Es más rápido y se utiliza normalmente durante el desarrollo.
- **Rebuild Project:** realiza una reconstrucción completa. Primero limpia los archivos generados y las cachés y después vuelve a compilar todo el proyecto desde cero.

Si añadimos una dependencia y el IDE no la reconoce, antes de realizar una reconstrucción completa comprobaría que el proyecto Maven o Gradle se haya actualizado o sincronizado correctamente, para que reconozca las nuevas dependencias.


La diferencia entre Build Project y Rebuild Project radica básicamente en el modo de compilar.

Build Project ejecuta una compilación incremental. Esto quiere decir que solo se compilan las clases modificadas y sus dependencias. Es mucho más rápido, por lo cual se usa seguido durante el desarrollo.

Rebuild Project hace una reconstrucción completa. Primero limpia los archivos generados o las cachés para después compilar todo desde cero.

Si agregamos una dependencia y el IDE no la reconoce, antes de hacer una reconstrucción completa yo comprobaría si el proyecto Maven o Gradle se ha actualizado o sincronizado bien, para que así reconozca los nuevos elementos.

---

### Ejericico 1.4
*Instalación de herramientas: JDK e IntelliJ IDEA: Para desarrollar en Java necesitas un JDK, mientras que IntelliJ IDEA incluye JetBrains Runtime para ejecutar el propio IDE. Explica la diferencia entre ambos y por qué el runtime incluido no sustituye al JDK 21 LTS que se configura para compilar y ejecutar el proyecto. Indica también qué edición de IntelliJ IDEA podría instalar el nuevo miembro del equipo.*

El JDK y JetBrains Runtime tienen funciones diferentes.

El **JDK (Java Development Kit)** es el kit de desarrollo necesario para programar en Java. Incluye herramientas como *javac*, que permite compilar el código, además de la JVM y las bibliotecas necesarias.

El  **JetBrains Runtime** viene incluido con IntelliJ IDEA y sirve para ejecutar el propio entorno de desarrollo, pero no sustituye al JDK necesario para desarrollar aplicaciones Java.

Por eso necesitamos configurar el **JDK 21 LTS** para poder compilar y ejecutar nuestros proyectos.

En cuanto a la edición de IntelliJ IDEA, el nuevo integrante podría instalar la **Community Edition**, que es gratuita y de código abierto, y resulta suficiente para las necesidades del curso de DAW. También existe la edición Ultimate, que es comercial.


El JDK y el JetBrains Runtime cumplen funciones distintas.

Resulta que el JDK es el kit de desarrollo esencial para crear software en Java. Contiene herramientas como el compilador javac, sumado a la propia JVM y las librerías base.

Sobre el JetBrains Runtime, este ya viene en el IntelliJ IDEA para que el entorno funcione, aunque no reemplaza al JDK que se requiere para desarrollar apps.

Por esa razón, debemos configurar el JDK 21 LTS para compilar los proyectos.

Respecto a la edición de IntelliJ IDEA, el compañero puede bajar la Community Edition. Es gratuita, código abierto y alcanza bien para el curso de DAW, ya que la Ultimate es de pago.


---

### Ejericico 1.5

*Plugins y extensiones: Un compañero instala quince complementos porque todos le parecen útiles, pero después nota que el IDE va más lento. Explica qué son los plugins y las extensiones, qué ventajas pueden aportar y qué problemas puede causar instalar demasiados. Describe cómo añadirías y cómo desactivarías o desinstalarías un complemento relacionado con Java.*

Los plugins y las extensiones son complementos que se instalan en un entorno de desarrollo para añadir nuevas funcionalidades, como soporte para otros lenguajes, herramientas de depuración o análisis de código.

Su principal ventaja es que permiten adaptar el IDE a las necesidades de cada programador. Sin embargo, instalar demasiados puede consumir más recursos del ordenador y provocar que el entorno funcione más lentamente.

Para añadir un complemento relacionado con Java:

- **En IntelliJ IDEA:** entraría en Settings > Plugins, buscaría el complemento y pulsaría Install. Después sería necesario reiniciar el IDE.
- **En VS Code:** abriría la vista de extensiones con *Ctrl + Shift + X*, buscaría el complemento y pulsaría Install.

Para desactivarlo o eliminarlo, utilizaría el apartado de plugins o extensiones instaladas. En IntelliJ IDEA se puede desactivar sin eliminarlo o desinstalarlo completamente. En VS Code también se puede deshabilitar o desinstalar.

Considero que lo mejor es instalar únicamente los complementos que realmente necesitamos para evitar consumir recursos innecesariamente.

Los plugins y extensiones son añadidos que se instalan en el entorno de desarrollo para dotarlo de funcionalidades extra, ya sea soporte para lenguajes, depuración o análisis.

Su ventaja principal radica en que el IDE se adapta a las necesidades específicas de cada programador. Aunque, instalar demasiados a veces consumen más recursos del equipo y causan que el entorno marche más lento.

Para añadir un complemento de Java:

En IntelliJ IDEA entrarías en Settings Plugins, buscarías el complemento y le das a Install. Tras esto sería necesario reiniciar el IDE.
En VS Code abres la vista de extensiones mediante Ctrl Shift X, buscas el componente y pulsas Install.

Si quieres desactivarlo o quitarlo, usarías el panel de plugins instalados. En IntelliJ IDEA puedes desactivar sin necesidad de desinstalar del todo. VS Code permite igualmente deshabilitar o borrar.

Creo que lo más inteligente es instalar solo los complementos que realmente hacen falta para así no consumir recursos de forma innecesaria.

