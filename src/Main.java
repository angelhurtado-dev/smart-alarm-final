public class Main {
    public static void main(String[] args) {
        System.out.println("--- INICIANDO SMART ALARM ---");

        AlarmManager manager = new AlarmManager();

        // 1. Crear alarmas con categorías
        Alarm workAlarm = new Alarm(7, 0, "Trabajo");
        Alarm pillAlarm = new Alarm(14, 30, "Medicina");
        
        manager.addAlarm(workAlarm);
        manager.addAlarm(pillAlarm);

        // 2. Revisar alarmas
        manager.checkAlarms();

        // 3. Probar reto matemático para apagar alarma de trabajo
        System.out.println("\n--- SUENA ALARMA DE TRABAJO ---");
        String question = workAlarm.attemptStop();
        System.out.println("Para apagar, responde: " + question);
        
        // Simulamos que el usuario falla
        workAlarm.confirmStop(99); 
        
        // 4. Probar el Modo Vacaciones
        System.out.println("\n--- LLEGA EL VERANO ---");
        manager.toggleVacationMode();
        manager.checkAlarms(); // No debería mostrar alarmas activas
    }
}