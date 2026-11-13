# AC201-Mohamed Amin Ben Assad El Arine
**Mohamed Amin Ben Assad El Arine**  
**Módulo:** Entornos de Desarrollo  
**Curso:** 1.º DAW

## Enunciados/Respuesta

### Ejercicio 1.1
*IDE frente a editor de texto: Un compañero afirma que para programar en Java basta con el Bloc de Notas y una terminal. Explica qué ventajas ofrecen IntelliJ IDEA o VS Code frente a un editor de texto plano. Menciona al menos tres componentes de un IDE y explica cómo ayudan durante el desarrollo.*

La verdad es que con el Bloc de Notas se puede escribir código, pero se hace todo mucho más pesado. Un IDE como IntelliJ o VS Code te facilita un montón de cosas que con un editor plano no tienes.

Tres cosas que ayudan bastante:

- **Resaltado de sintaxis**: las palabras clave del lenguaje se ven de otro color y es más fácil detectar errores de escritura.
- **Autocompletado**: te va sugiriendo métodos y variables mientras escribes. En VS Code se llama IntelliSense y ahorra bastante tiempo.
- **Análisis de código**: te avisa si hay errores de sintaxis o de estructura antes de ni siquiera compilar.

Además, en un IDE tienes el depurador, el explorador de archivos y la terminal integrada. Todo en el mismo sitio. Con el Bloc de Notas tendrías que estar saltando de una herramienta a otra constantemente, y eso cansa bastante.

### Ejercicio 1.2
*IntelliJ IDEA y VS Code: Una persona empieza a trabajar con un proyecto en IntelliJ IDEA y después debe continuar en VS Code. Describe tres conceptos o funciones comunes y dos diferencias entre ambos entornos. Explica por qué conocer los conceptos de editor, explorador, terminal, depurador o control de versiones facilita el cambio, aunque las interfaces y los atajos no sean idénticos.*

Tres cosas que tienen en común:

- Las **ventanas de herramientas** (Tool Windows). En los dos se pueden abrir a los lados o abajo para ver el proyecto, la terminal, el depurador, etc.
- El **gutter**, esa zona a la izquierda del código donde salen los números de línea, los breakpoints y los iconos para ejecutar o depurar.
- La **barra de estado** de abajo, donde aparece la línea y columna en la que estás, la codificación del archivo y otras cosas del proyecto.

Diferencias:

- IntelliJ viene mucho más preparado de serie para Java. Tiene análisis y herramientas de depuración bastante potentes sin tener que instalar casi nada.
- VS Code es más ligero y se personaliza con extensiones. Si no instalas nada, es bastante básico, pero puedes ir añadiendo lo que necesites.

Aunque cambien los menús y los atajos, si ya sabes qué es el editor, el explorador de archivos, la terminal, el depurador y el control de versiones, el cambio se hace bastante más fácil. Al final buscas las mismas funciones, solo que están en sitios distintos.

### Ejercicio 1.3
*Build y Rebuild: Al modificar un proyecto Java, IntelliJ IDEA ofrece Build Project y Rebuild Project. Explica la diferencia entre una compilación incremental y una reconstrucción completa. Si se ha añadido una dependencia y el IDE no la reconoce, ¿qué actualización del proyecto comprobarías antes de decidir que hace falta reconstruirlo?*

La diferencia principal es esta:

- **Build Project** hace una compilación incremental. Solo compila lo que ha cambiado y lo que depende de ello. Es más rápido y es lo que se usa normalmente mientras programas.
- **Rebuild Project** hace una reconstrucción completa: borra lo generado y compila todo desde cero. Tarda más, pero a veces hace falta cuando hay problemas raros.

Si añado una dependencia y el IDE no la reconoce, antes de hacer un Rebuild miraría si el proyecto Maven o Gradle está bien sincronizado. Muchas veces es solo eso: que no ha actualizado las dependencias y con un refresh o sync se soluciona.

### Ejercicio 1.4
*Instalación de herramientas: JDK e IntelliJ IDEA: Para desarrollar en Java necesitas un JDK, mientras que IntelliJ IDEA incluye JetBrains Runtime para ejecutar el propio IDE. Explica la diferencia entre ambos y por qué el runtime incluido no sustituye al JDK 21 LTS que se configura para compilar y ejecutar el proyecto. Indica también qué edición de IntelliJ IDEA podría instalar el nuevo miembro del equipo.*

Son dos cosas distintas:

El **JDK** es lo que necesitamos para desarrollar. Incluye el compilador (`javac`), la máquina virtual y las librerías de Java. Sin él no puedes compilar ni ejecutar tus programas.

El **JetBrains Runtime** viene dentro de IntelliJ y solo sirve para que el propio IDE funcione. No sirve para compilar nuestros proyectos.

Por eso hay que configurar el JDK 21 LTS aparte. El runtime de JetBrains no lo sustituye.

Para el nuevo compañero, con la **Community Edition** debería sobrar. Es gratuita y para lo que hacemos en DAW es más que suficiente. La Ultimate tiene más cosas, pero es de pago.

### Ejercicio 1.5
*Plugins y extensiones: Un compañero instala quince complementos porque todos le parecen útiles, pero después nota que el IDE va más lento. Explica qué son los plugins y las extensiones, qué ventajas pueden aportar y qué problemas puede causar instalar demasiados. Describe cómo añadirías y cómo desactivarías o desinstalarías un complemento relacionado con Java.*

Los plugins (en IntelliJ) y las extensiones (en VS Code) son complementos que le añaden funciones al entorno: soporte para otros lenguajes, herramientas de depuración, temas, etc.

La ventaja es que puedes adaptar el IDE a lo que necesitas. El problema es que si instalas demasiados, el programa se vuelve más lento y consume más memoria.

Para instalar uno relacionado con Java:

- En **IntelliJ**: Settings → Plugins, buscas el que quieras e Install. A veces pide reiniciar.
- En **VS Code**: Ctrl + Shift + X, buscas la extensión y le das a Install.

Para quitarlo o desactivarlo, en los dos se puede hacer desde la lista de plugins/extensiones instalados. En IntelliJ puedes desactivarlo sin borrarlo del todo, y en VS Code también se puede deshabilitar o desinstalar.

Al final es mejor instalar solo lo que realmente vas a usar. Si no, el IDE acaba yendo más lento de la cuenta.