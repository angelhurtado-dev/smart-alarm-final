### Caso de Uso 1: Crear Alarma

* **Nombre:** Crear Alarma
* **Objetivo:** Permitir al usuario configurar una nueva alarma en el sistema.
* **Actor principal:** Usuario
* **Precondiciones:** El sistema del despertador debe estar instanciado y funcionando.
* **Flujo principal:**
  1. El usuario solicita al sistema crear una nueva alarma.
  2. El sistema pide la hora, los minutos y la etiqueta.
  3. El usuario introduce los datos.
  4. El sistema valida que la hora (0-23) y minutos (0-59) sean formatos correctos.
  5. El sistema guarda la alarma en la lista general y la marca como "Activa".
* **Flujos alternativos:**
  * *4a.* Si la hora o minutos son inválidos, el sistema lanza una advertencia y rechaza la creación.
* **Postcondiciones:** La nueva alarma queda registrada en el Gestor de Alarmas.
* **Reglas de negocio:** No se pueden guardar dos alarmas que suenen exactamente a la misma hora para los mismos días (se debe evitar la duplicidad).