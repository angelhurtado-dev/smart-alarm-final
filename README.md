# ⏰ Smart Alarm Logic (Despertador Inteligente)

## 📖 Descripción del proyecto
Este proyecto implementa la lógica interna (backend) de una aplicación de despertador inteligente desarrollada en Java. El sistema prescinde de interfaz gráfica para centrarse en un diseño de software sólido, orientado a objetos y con baja dependencia (bajo acoplamiento). Permite gestionar alarmas, aplicar funcionalidades avanzadas y controlar el flujo de ejecución.

## 🎯 Objetivos
* **Gestión eficiente:** Permitir al usuario crear, posponer y detener alarmas fácilmente.
* **Evitar distracciones:** Implementar un Modo Vacaciones centralizado para silenciar el sistema sin borrar datos.
* **Despertar activo:** Integrar un sistema de "Retos Matemáticos" que obliga al usuario a resolver un cálculo para detener la alarma.
* **Organización:** Clasificar alarmas mediante etiquetas/categorías.

## 🛠️ Tecnologías utilizadas
* **Lenguaje:** Java 21 (Lógica orientada a objetos)
* **Control de versiones:** Git y GitHub (GitFlow básico)
* **Documentación:** Markdown, Mermaid (Diagramas UML)
* **Entorno:** Visual Studio Code

## 🚀 Instalación y ejecución
Al carecer de interfaz gráfica o base de datos, el proyecto está diseñado para ejecutarse y probarse directamente desde la consola.

1. Clona este repositorio en tu máquina local:
   `git clone https://github.com/angelhurtado-dev/smart-alarm-final.git`
2. Abre el proyecto en tu IDE preferido (VS Code, IntelliJ, Eclipse).
3. Navega hasta el archivo `src/Main.java`.
4. Ejecuta el archivo (`Run`).
5. Observa la consola para ver la simulación de creación de alarmas, los intentos de resolver el reto matemático y la activación del modo vacaciones.