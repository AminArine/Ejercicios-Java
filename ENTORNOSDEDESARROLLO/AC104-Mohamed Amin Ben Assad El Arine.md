# AC104-Mohamed Amin Ben Assad El Arine

Mohamed Amin Ben Assad El Arine 
### Enunciado:
La empresa presenta estas situaciones:

- **Iniciativa A (Firmware de sensores):** El programa se ejecutará en un microcontrolador con recursos limitados y deberá comunicarse directamente con los sensores de riego. Se necesita un buen rendimiento y control cercano del hardware.
- **Iniciativa B (Servidor de pedidos):** El servicio gestionará pedidos y datos de cooperativas desde servidores que pueden usar distintos sistemas operativos. MurgiTIC necesita una solución mantenible, con un ecosistema amplio para aplicaciones empresariales.
- **Iniciativa C (Análisis de datos):** El equipo analizará históricos de humedad, temperatura y riego para elaborar informes y ayudar a prever las necesidades de los cultivos. Se quiere explorar los datos y crear prototipos con rapidez.
### Resultado:
**Se pide :**
Para cada iniciativa:
1. Selecciona el lenguaje más adecuado entre **C, Java y Python**.
2. Completa la fila correspondiente con su **nivel de abstracción** y su **mecanismo de traducción**.
3. En la justificación, relaciona una característica adicional del lenguaje —por ejemplo, el sistema de tipos, el paradigma o sus ámbitos de uso— con las necesidades del caso.



| **Iniciativa**       | **Lenguaje elegido** | **Nivel de Abstracción** | **Mecanismo de Traducción** | **Justificacion basada en una característica**                                                                                                                                                       |
| -------------------- | -------------------- | ------------------------ | --------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| Firmware de sensores | C                    | Medio Nivel              | Compilado                   | Este lenguaje es capaz de acceder directamente a la memoria y controlar el hardware con mucha eficiencia.Por  lo tanto se alinearia de manera esencial en microcontroladores con recursos limitados. |
| Servidor de pedidos  | Java                 | Alto Nivel               | Mixto o Virtual             | La máquina virtual de Java permite ejecutar el bytecode en muchos sistemas operativos.Además Java dispone de muchas librerías                                                                        |
| Análisis de datos    | Python               | Alto Nivel               | Interpretado                | Destaca por una sintaxis sencilla  y sus bibliotecas de análisis de datos son de gran ayuda a la hora de explorar información y crear prototipos rápidamente.                                        |
## Justificación de cada elección : 

C — Firmware de sensores

He escogido **C** porque permite controlar directamente el hardware y aprovechar bien los recursos del microcontrolador. Al ser un lenguaje compilado, el código se transforma en código máquina antes de ejecutarse. Esto ayuda a que los sensores funcionen de manera rápida y eficiente.

Java — Servidor de pedidos

He elegido **Java** porque permite crear aplicaciones que pueden funcionar en distintos sistemas operativos gracias a la máquina virtual Java (JVM). También cuenta con muchas herramientas y bibliotecas que facilitan el desarrollo de programas y hacen que sea más sencillo mantenerlos con el tiempo.

Python — Análisis de datos

He escogido **Python** porque es un lenguaje fácil de entender y su sintaxis permite escribir código sin demasiadas complicaciones. Además, facilita el análisis de datos y la creación de programas en poco tiempo. Por eso, es una buena opción para estudiar la información de los cultivos y elaborar informes.