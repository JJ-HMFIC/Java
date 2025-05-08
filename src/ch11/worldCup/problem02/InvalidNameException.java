package ch11.worldCup.problem02;

public class InvalidNameException extends Exception{
    private String message;
    public InvalidNameException(String message) {
        this.message = message;
    }
}
