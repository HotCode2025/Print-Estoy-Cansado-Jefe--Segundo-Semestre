// Proyecto Integrador 2° Semestre - Requisitos

// Opción 1: Migrar tu proyecto original a Java
// Opción 2: Crear un nuevo proyecto en Java

/* El proyecto debe cumplir con: */
- Ejecución funcional y completa
- Posibilidad de añadir mejoras
- Subido en la organización de GitHub

/* Requisitos Técnicos: */
- Menú interactivo
- Programación Orientada a Objetos (POO)
- Bucles
- Condicionales

// Proyecto creado por Print ("Estoy Cansado Jefe")

# 🎮 Proyecto Final - Segundo Semestre

¡Bienvenido al repositorio de mi *Proyecto Final del Segundo Semestre*!
Este proyecto consiste en una *aplicación de consola* para gestionar y ejecutar un *cuestionario interactivo*.

## 📖 Descripción del Proyecto

La aplicación permite al usuario responder a *preguntas de opción múltiple*, mostrando su progreso y puntuación final al terminar.

*Flujo del programa:*

1. El sistema carga todas las preguntas disponibles.
2. Se muestran las preguntas con sus opciones.
3. El usuario selecciona su respuesta.
4. Al finalizar, se muestra la puntuación total.

Este proyecto refuerza conceptos de *Programación Orientada a Objetos (POO)* y buenas prácticas en Java.

## 💻 Tecnologías Utilizadas

* *Java*: Lenguaje principal del proyecto.
* *POO (Programación Orientada a Objetos)*: Paradigma usado para organizar el código de manera modular y limpia.

## 🗂 Estructura del Proyecto

El proyecto está organizado de manera clara y modular:


src/main/java
│
├── entidades
│   └── Pregunta.java          # Modelo de una pregunta (texto, opciones y respuesta correcta)
│
├── servicios
│   └── PreguntaServicio.java  # Lógica del cuestionario: creación de preguntas, validación y cálculo de puntuación
│
└── org.example
    └── Main.java              # Punto de entrada de la aplicación


## 🛠 Bitácora de Desarrollo

### 📅 Día 1 (22/10/2025)

* Creación de la estructura inicial del repositorio y del proyecto Java.
* Definición de los paquetes: entidades, servicios y org.example.
* Implementación de *Pregunta.java* con atributos:

  * id (int)
  * texto (String)
  * opciones (List<String>)
  * indiceCorrecto (int)
* Creación de *constructor, getters y setters*.
* Creación de placeholders: PreguntaServicio.java y Main.java.

### 📅 Día 2 (23/10/2025)

* Redacción y creación de las preguntas del cuestionario, definiendo el texto, las opciones de respuesta y la opción correcta para cada una.
* Implementación de las preguntas en Java, integrándolas en el proyecto como instancias de la clase Pregunta.

## 🚀 Cómo Ejecutar el Proyecto

1. Clona el repositorio:

   bash
   git clone <URL_DEL_REPOSITORIO>
   
2. Abre el proyecto en tu IDE favorito (IntelliJ, Eclipse, VS Code, etc.).
3. Ejecuta la clase Main.java.
4. ¡Responde el cuestionario y descubre tu puntuación final!

## 🌟 Características Destacadas

* Preguntas de *opción múltiple*.
* *Validación de respuestas* en tiempo real.
* *Puntuación final* al terminar el cuestionario.
* Código modular y organizado siguiendo *POO*.