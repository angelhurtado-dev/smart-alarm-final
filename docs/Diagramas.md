## Diagrama de Casos de Uso

```mermaid
usecaseDiagram
    actor Usuario
    
    Usuario --> (Crear Alarma)
    Usuario --> (Activar/Desactivar Alarma)
    Usuario --> (Posponer Alarma)
    Usuario --> (Detener Alarma)
    Usuario --> (Activar Modo Vacaciones)
    
    (Detener Alarma) .> (Resolver Reto Matemático) : include

### 🧩 Paso 5: El Diagrama de Clases

Debajo de lo que acabas de pegar, deja un par de líneas en blanco y pega este otro bloque. Este es el "mapa" de tu código en Java. Muestra qué clases existen y cómo se conectan.

```markdown
## Diagrama de Clases UML

```mermaid
classDiagram
    class AlarmManager {
        -List~Alarm~ alarms
        -boolean vacationMode
        +addAlarm(Alarm a)
        +removeAlarm(Alarm a)
        +toggleVacationMode()
        +checkActiveAlarms()
    }

    class Alarm {
        -int hour
        -int minute
        -String category
        -boolean isActive
        +snooze()
        +stop()
    }

    class MathChallenge {
        -int number1
        -int number2
        +generateChallenge() String
        +verifyAnswer(int answer) boolean
    }

    AlarmManager "1" *-- "*" Alarm : gestiona
    Alarm "1" --> "1" MathChallenge : usa para detener

    ### 🧠 Paso 6: La Justificación (¡Muy importante para la nota!)

El profesor puso en mayúsculas que el diagrama debe estar **razonado**. Así que debajo del código que acabas de pegar, añade esta explicación para que vea que entiendes lo que has hecho:´´´

```markdown
### Justificación del Diseño Orientado a Objetos

He decidido estructurar la lógica en tres clases principales para cumplir con el principio de Responsabilidad Única (Single Responsibility Principle de SOLID):

1. **AlarmManager:** Es la clase controladora. Su responsabilidad es guardar la lista de alarmas y encender/apagar el "Modo Vacaciones". Al encapsular la lista de alarmas aquí (con visibilidad privada `-`), evitamos que otras partes del programa modifiquen la lista por accidente.
2. **Alarm:** Representa los datos individuales de una alarma (hora, minutos, categoría). Tiene los métodos básicos de `snooze()` y `stop()`. Sus atributos son privados para proteger la coherencia de la hora.
3. **MathChallenge:** He desacoplado la lógica del reto matemático en su propia clase. Si en el futuro queremos cambiar las matemáticas por un puzzle de palabras, la clase `Alarm` no sufrirá modificaciones.

**Relaciones:**
* Existe una relación de **Composición** entre `AlarmManager` y `Alarm` porque el gestor "contiene" múltiples alarmas.
* Existe una relación de **Asociación** entre `Alarm` y `MathChallenge` porque la alarma necesita interactuar con el reto para detenerse.´´´
