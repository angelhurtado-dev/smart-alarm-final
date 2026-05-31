import java.util.Random;

public class MathChallenge {
    private int number1;
    private int number2;
    private int expectedAnswer;

    public String generateChallenge() {
        Random rand = new Random();
        this.number1 = rand.nextInt(20) + 1; // Número entre 1 y 20
        this.number2 = rand.nextInt(20) + 1;
        this.expectedAnswer = number1 + number2;
        return "¿Cuánto es " + number1 + " + " + number2 + "?";
    }

    public boolean verifyAnswer(int userAnswer) {
        return userAnswer == this.expectedAnswer;
    }
}