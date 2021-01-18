public class Fibonacci {
    public int[] getSequenceWhile(int numberOfFibonacciNumbers) {
        if (numberOfFibonacciNumbers >= 0) {
            int[] sequence = new int[numberOfFibonacciNumbers];
            if (numberOfFibonacciNumbers > 1) {
                sequence[1] = 1;
            }
            int i = 2;
            while (i < numberOfFibonacciNumbers) {
                sequence[i] = sequence[i - 1] + sequence[i - 2];
                i++;
            }
            return sequence;
        } else {
            throw new IncorrectNumberExeption();
        }
    }
    public int[] getSequenceDoWhile(int numberOfFibonacciNumbers) {
        if (numberOfFibonacciNumbers >= 0) {
            int[] sequence = new int[numberOfFibonacciNumbers];
            if (numberOfFibonacciNumbers > 1) {
                sequence[1] = 1;
                int i = 2;
                do {
                    sequence[i] = sequence[i - 1] + sequence[i - 2];
                    i++;
                } while (i < numberOfFibonacciNumbers);
                return sequence;
            }
            return sequence;
        } else {
            throw new IncorrectNumberExeption();
        }
    }
    public int[] getSequenceFor(int numberOfFibonacciNumbers) {
        if (numberOfFibonacciNumbers >= 0) {
            int[] sequence = new int[numberOfFibonacciNumbers];
            if (numberOfFibonacciNumbers > 1) {
                sequence[1] = 1;
            }
            for (int i = 2; i < numberOfFibonacciNumbers; i++) {
                sequence[i] = sequence[i - 1] + sequence[i - 2];
            }
            return sequence;
        } else {
            throw new IncorrectNumberExeption();
        }
    }
}
