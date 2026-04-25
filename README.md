# PetroStack-Casanare
Nombre: Juan David Duarte Tupanteve
Codigo: 1116662418
Asignatura: Algoritmos 2
Fecha: 24-04-2026
Descripcion del proyecto:
Este proyecto consiste en el desarrollo de una aplicación en Java que simula la gestión de eventos de inspección en pozos petroleros de la empresa PetroStack Casanare S.A.S.
El sistema permite registrar eventos como fugas, mantenimientos, lecturas de presión y cierres de turno, los cuales son almacenados en una estructura de datos tipo pila.
La aplicación permite interactuar mediante consola para agregar, consultar, retirar y listar eventos, siguiendo la lógica operativa de la empresa donde el evento más reciente es el más importante.

Justificacion del uso de pila:
Se utilizó una estructura de datos tipo pila (Stack) debido a que el problema requiere manejar los eventos bajo el principio LIFO (Last In, First Out).
Esto significa que el último evento registrado es el primero en ser atendido, lo cual tiene sentido en el contexto de inspecciones petroleras, donde los eventos más recientes suelen ser más críticos o relevantes.
Además, la pila permite implementar fácilmente funcionalidades como la consulta del último evento (peek), eliminación del último evento (pop) y registro de nuevos eventos (push), manteniendo un orden lógico y eficiente en la gestión de la información.
