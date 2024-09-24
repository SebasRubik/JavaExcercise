# Java Task Manager Application

## Descripción

Este proyecto es una aplicación de consola desarrollada en Java para la gestión de tareas. Permite a los usuarios agregar, marcar como completadas, ordenar por prioridad y guardar tareas en archivos.
## Características

- **Gestión de tareas**: Los usuarios pueden agregar nuevas tareas con un título, descripción y nivel de prioridad.
- **Ordenar tareas por prioridad**: Las tareas se pueden ordenar en niveles de prioridad: `LOW`, `MID` y `HIGH`.
- **Marcar tareas como completadas**: Los usuarios pueden marcar las tareas como completadas, eliminándolas de la lista.
- **Guardar y cargar tareas desde un archivo**: La aplicación permite guardar el estado actual de las tareas en un archivo y cargar tareas guardadas anteriormente.
- **Fusión de ramas**: El proyecto utiliza las ramas `main` y `master`, permitiendo fusionar cambios entre ellas según el flujo de trabajo del proyecto.

## Estructura del Proyecto

- **Main.java**: Archivo principal que contiene el flujo de la aplicación y el menú interactivo para el usuario.
- **TasksManager.java**: Clase que gestiona las tareas, ofreciendo métodos para agregar, eliminar, ordenar y mostrar tareas.
- **Task.java**: Clase que representa una tarea individual con un título, descripción y nivel de prioridad.
- **Priority.java**: Enum que define los niveles de prioridad (`LOW`, `MID`, `HIGH`).

## Uso del Programa

Al iniciar la aplicación, se presenta un menú con las siguientes opciones:

1. **Load Tasks**: Cargar las tareas guardadas desde un archivo.
2. **Write Tasks**: Guardar las tareas actuales en un archivo.
3. **Show Tasks (in priority order)**: Mostrar las tareas en orden de prioridad.
4. **Add new task**: Agregar una nueva tarea con un título, descripción y prioridad.
5. **Mark task as completed**: Marcar una tarea como completada eliminándola de la lista.
6. **Salir**: Terminar la ejecución de la aplicación.

