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
