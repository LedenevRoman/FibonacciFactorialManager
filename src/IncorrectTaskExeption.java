public class IncorrectTaskExeption extends RuntimeException{

    public IncorrectTaskExeption() {
    }

    public IncorrectTaskExeption(String message) {
        super(message);
    }
}