# Ejercicios integradores — Lenguaje de Marcas (Semanas 2-7)

**Curso:** 1º DAM · Lenguaje de Marcas  
**Temario cubierto:** Texto semántico, listas, enlaces, imágenes y multimedia, tablas, HTML semántico y formularios básicos.

Estos ejercicios asumen que ya dominas **todo** el contenido de las semanas 2 a 7. No son ejercicios de una sola etiqueta: obligan a combinar varios conceptos a la vez.

---

## Ejercicios de integración media-alta

### 1. Página de perfil de personaje histórico (biografía avanzada)

Crea el archivo `biografia-completa.html` de un personaje real (histórico, científico, deportista, artista…).

**Requisitos:**

- Estructura semántica completa: `header` + `nav` + `main` + `aside` + `footer`.
- Jerarquía de encabezados correcta (`h1` → varios `h2` → al menos un `h3`).
- Al menos una cita larga con `blockquote` + `cite` y una cita corta con `q`.
- Uso correcto de `strong`, `em` e `i` (para el título de una obra).
- Una abreviatura con `abbr` y su atributo `title`.
- Lista de definición (`dl`) con al menos 4 términos relacionados con su época o campo.
- Imagen con `figure` / `figcaption` y un `alt` de calidad.
- Enlaces internos con anclas a las secciones principales.
- En el `aside`: lista de “datos curiosos” y un enlace externo que abra en pestaña nueva con `rel="noopener"`.

---

### 2. Ficha de producto e-commerce semántica

Crea el archivo `producto-premium.html`.

**Requisitos:**

- Todo el contenido principal dentro de un `article`.
- Nombre del producto en un `header` interno.
- Descripción con párrafos, `mark` en una frase clave y `small` para la nota legal.
- Precio anterior con `del` y precio actual con `ins` (usa `&nbsp;` entre la cantidad y el símbolo €).
- Tabla de características técnicas (mínimo 5 filas) con `caption`, `thead`, `tbody` y `scope`.
- Galería de 3 imágenes (cada una dentro de su propio `figure`).
- Formulario de “Añadir al carrito” con:
  - Cantidad (`type="number"`).
  - Talla (radio buttons).
  - Checkbox de “Acepto las condiciones”.
  - Todo correctamente etiquetado con `label` + `fieldset` / `legend`.

---

### 3. Receta completa con índice y multimedia

Crea el archivo `receta-multimedia.html`.

**Requisitos:**

- Índice con anclas al principio de la página (“Ir a ingredientes”, “Ir a preparación”, etc.).
- Lista de ingredientes (`ul`) y pasos de preparación (`ol` con al menos 7 pasos).
- Una lista anidada dentro de los ingredientes (ejemplo: “Especias” → sublista).
- Imagen principal con `figure` y al menos una imagen secundaria.
- Elemento `audio` con dos formatos distintos + mensaje de fallback.
- Elemento `video` con `poster`, `controls` y al menos una fuente.
- Tabla nutricional básica (calorías, proteínas, etc.) con `tfoot` que muestre totales.
- Estructura semántica completa (`header`, `nav`, `main`, `footer`…).

---

### 4. Página de FAQ + formulario de contacto

Crea el archivo `soporte.html`.

**Requisitos:**

- Sección de preguntas frecuentes usando `dl` / `dt` / `dd` (mínimo 6 preguntas).
- Enlaces de ancla desde un menú superior a cada pregunta.
- Formulario de contacto completo:
  - Nombre.
  - Email (`required`).
  - Asunto.
  - Mensaje.
  - Checkbox de privacidad.
- Todo el formulario agrupado en al menos dos `fieldset`.
- Pie de página con entidades HTML (`&copy;`, `&nbsp;`, etc.).

---

### 5. Comparativa de planes + formulario de alta

Crea el archivo `planes.html`.

**Requisitos:**

- Tabla comparativa de 4 planes (Gratis, Básico, Pro, Enterprise) frente a 6 características.
- Uso de `colspan` y `rowspan` al menos una vez cada uno.
- Fila destacada que abarque todas las columnas (“Todos los planes incluyen actualizaciones gratuitas”).
- Debajo de la tabla, un formulario de inscripción al plan elegido:
  - Radio buttons para elegir el plan.
  - Datos personales.
  - Aceptación de condiciones.
- Estructura semántica: `header`, `main` con dos `section`, `aside` con “¿Por qué elegirnos?”.

---

## Ejercicios de proyecto completo (varios archivos)

### 6. Mini-sitio de un club deportivo (3-4 páginas)

Crea una carpeta `club/` con los siguientes archivos:

| Archivo | Contenido |
|---------|-----------|
| `index.html` | Página de inicio semántica con navegación a las demás páginas, imagen destacada y lista de próximas actividades. |
| `equipo.html` | Lista de jugadores + tabla de estadísticas (usa `scope`, `caption` y al menos un `rowspan`). |
| `inscripcion.html` | Formulario completo de inscripción (datos personales, categoría con radio, días preferidos con checkbox, aceptación de normas). |
| `galeria.html` | Galería de mínimo 6 fotos con `figure` / `figcaption` y buenos `alt`. |

**Requisitos globales:**
- Todas las páginas deben compartir la misma estructura de `header` / `nav` / `footer`.
- Usar rutas relativas entre páginas.

---

### 7. Blog personal semántico (2 páginas)

Crea los archivos `blog.html` y `entrada.html`.

**`blog.html`:**
- Listado de entradas.
- Cada entrada es un `article` con título, extracto, fecha en un `footer` interno y enlace “Leer más”.

**`entrada.html`:**
- Una entrada completa con:
  - Jerarquía de encabezados correcta.
  - Citas (`blockquote` y/o `q`).
  - Énfasis semántico correcto (`strong` / `em` / `i`).
  - Imagen con pie de foto.
  - Lista de etiquetas (`ul`).
  - Formulario de comentarios básico (nombre, email, comentario, checkbox).
- Incluye un `aside` con “Entradas relacionadas” y un menú de categorías.

---

### 8. Página de un restaurante con menú y reserva

Crea `restaurante.html` (todo en una sola página con anclas) o divídelo en dos archivos.

**Requisitos:**

- Menú de comida con listas anidadas (categorías → platos).
- Tabla de precios o de menú del día.
- Galería de platos.
- Formulario de reserva (fecha, hora, número de comensales, alergias, checkbox de confirmación).
- Uso correcto de entidades HTML y de `small` para notas legales.
- Estructura semántica completa.

---

## Ejercicios de rigor técnico / detección de errores

### 9. Auditoría y reescritura semántica

Se te da un HTML construido solo con `div` y `span` (“div soup”). Debes:

1. Reescribirlo completamente con las etiquetas semánticas correctas.
2. Corregir la jerarquía de encabezados.
3. Asociar correctamente todos los `label`.
4. Añadir `scope` a las tablas.
5. Mejorar los textos `alt`.
6. Convertir el énfasis visual en semántico donde corresponda.

*(Puedes inventar el HTML sucio o pedir que se te facilite uno).*

---

### 10. Página “todo en uno” de referencia

Crea el archivo `referencia.html` que contenga **en una sola página** ejemplos correctos y comentados de:

- Todos los niveles de encabezado usados jerárquicamente.
- Ejemplo de `strong` / `em` frente a `b` / `i`.
- Todos los elementos de texto en línea vistos (`del`, `ins`, `sub`, `sup`, `abbr`, `mark`, `small`).
- Una lista de cada tipo (`ul`, `ol` con atributos, `dl`) + una lista anidada.
- Tabla completa con `caption`, `thead`, `tbody`, `tfoot`, `scope`, `colspan` y `rowspan`.
- Imagen + `figure`, audio y vídeo.
- Formulario completo con todos los tipos de `input` vistos, `fieldset` y `required`.
- Estructura semántica completa.

Este ejercicio sirve como tu “chuleta viva”.

---

### 11. Formulario de alta a un evento con validación visual

Crea el archivo `evento.html` con un formulario largo y bien estructurado:

- Datos personales (nombre, apellidos, email `required`, teléfono).
- Edad (`type="number"` con `min` y `max`).
- Preferencias (radio buttons + varios checkbox).
- Comentarios.
- Aceptación de condiciones (`required`).

**Requisitos adicionales:**
- Al menos tres `fieldset` distintos.
- Asociación correcta `label` / `for` / `id` en todos los campos.
- Una tabla resumen de precios del evento colocada en un `aside`.

---

### 12. Página de portfolio de estudiante

Crea el archivo `portfolio.html` que muestre tus propios trabajos del curso.

**Requisitos:**

- Cada proyecto es un `article` con título, descripción, captura (o imagen de prueba) y enlace.
- Tabla de tecnologías usadas.
- Formulario de contacto.
- Navegación con anclas a las secciones “Proyectos”, “Sobre mí” y “Contacto”.
- Uso correcto de entidades HTML en el footer.

---

## Retos finales (nivel alto)

### 13. Sitio multipágina de una tienda ficticia

Crea un sitio con **mínimo 5 páginas** interconectadas:

- `index.html`
- `productos.html`
- `producto-detalle.html`
- Página de carrito o formulario de pedido
- `contacto.html` o `faq.html`

**Debe demostrar dominio total de:**
- Rutas relativas.
- Anclas.
- Tablas accesibles.
- Formularios bien etiquetados.
- Multimedia.
- HTML semántico consistente en todas las páginas.

---

### 14. Reescritura de una página real

Elige una página sencilla de internet (por ejemplo la home de un instituto, un blog pequeño o una ficha de producto) y reescríbela desde cero aplicando **todas** las buenas prácticas de las semanas 2-7:

- Semántica correcta.
- Accesibilidad de tablas y formularios.
- Textos `alt` de calidad.
- Énfasis semántico (no solo visual).
- Estructura de encabezados coherente.

---

### 15. Ejercicio de “errores escondidos”

1. Crea voluntariamente una página con **8-10 errores** semánticos, de accesibilidad o de buenas prácticas (encabezados saltados, `main` duplicado, labels mal asociados, tablas sin `scope`, `alt` genéricos, énfasis solo visual, etc.).
2. Crea la versión corregida en otro archivo.
3. Explica en comentarios HTML por qué cada cambio es necesario.

---

## Notas finales

- Usa siempre rutas relativas para los recursos internos.
- Prioriza siempre el significado semántico sobre el aspecto visual.
- Todos los formularios deben tener `label` correctamente asociados.
- Las tablas deben ser accesibles (`scope`, `caption` cuando corresponda).
- Los textos alternativos de las imágenes deben ser descriptivos y útiles.

¡Ánimo con los ejercicios!