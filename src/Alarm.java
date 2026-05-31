public class Alarm {
    private int hour;
    private int minute;
    private String category; // Funcionalidad avanzada: Categorías
    private boolean isActive;
    private MathChallenge challenge;

    // Constructor
    public Alarm(int hour, int minute, String category) {
        this.hour = hour;
        this.minute = minute;
        this.category = category;
        this.isActive = true;
        this.challenge = new MathChallenge();
    }

    public void snooze() {
        System.out.println("Alarma de la categoría [" + category + "] pospuesta 5 minutos.");
    }

    // Usamos el reto matemático para detenerla
    public String attemptStop() {
        return challenge.generateChallenge();
    }

    public boolean confirmStop(int answer) {
        if (challenge.verifyAnswer(answer)) {
            this.isActive = false;
            System.out.println("¡Respuesta correcta! Alarma detenida.");
            return true;
        } else {
            System.out.println("Respuesta incorrecta. La alarma sigue sonando.");
            return false;
        }
    }

    // Getters
    public int getHour() { return hour; }
    public int getMinute() { return minute; }
    public String getCategory() { return category; }
    public boolean isActive() { return isActive; }
}