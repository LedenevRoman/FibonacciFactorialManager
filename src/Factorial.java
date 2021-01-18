public class Factorial {
    public int getResultWhile(int number) {
        if (number >= 0) {
            int i = 1;
            int result = 1;
            while (i <= number) {
                result = result * i;
                i++;
            }
            return result;
        } else {
            throw new IncorrectNumberExeption();
        }

    }
    public int getResultDoWhile(int number) {
        if (number >= 0) {
            int i = 1;
            int result = 1;
            do {
                result = result * i;
                i++;
            } while (i <= number);
            return result;
        } else {
            throw new IncorrectNumberExeption();
        }
    }
    public int getResultFor(int number) {
        if (number >= 0) {
            int result = 1;
            for (int i = 1; i <= number; i++) {
                result = result * i;
            }
            return result;
        } else {
            throw new IncorrectNumberExeption();
        }
    }
}
