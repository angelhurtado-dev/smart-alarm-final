import java.util.ArrayList;
import java.util.List;

public class AlarmManager {
    private List<Alarm> alarms;
    private boolean vacationMode; // Funcionalidad avanzada: Modo Vacaciones

    public AlarmManager() {
        this.alarms = new ArrayList<>();
        this.vacationMode = false;
    }

    public void addAlarm(Alarm alarm) {
        alarms.add(alarm);
        System.out.println("Alarma creada a las " + alarm.getHour() + ":" + alarm.getMinute() + " (" + alarm.getCategory() + ")");
    }

    public void toggleVacationMode() {
        this.vacationMode = !this.vacationMode;
        if(vacationMode) {
            System.out.println("Modo vacaciones ACTIVADO. Todas las alarmas se ignorarán.");
        } else {
            System.out.println("Modo vacaciones DESACTIVADO. Las alarmas vuelven a estar activas.");
        }
    }

    public void checkAlarms() {
        if (vacationMode) {
            System.out.println("El sistema está en modo vacaciones. No suena nada.");
            return;
        }
        System.out.println("Revisando alarmas activas...");
        for (Alarm a : alarms) {
            if (a.isActive()) {
                System.out.println("- Alarma activa a las " + a.getHour() + ":" + a.getMinute());
            }
        }
    }
}