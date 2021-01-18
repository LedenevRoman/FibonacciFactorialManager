public class AlgoritmManager {
    public int[] getResult(int taskNumber, int cycleNumber, int number) {
        if (taskNumber > 0 && taskNumber < 3) {
            if (taskNumber == 1) {
                return getFibonacciSequence(cycleNumber, number);
            } else {
                return getFactorial(cycleNumber, number);
            }
        } else {
                throw new IncorrectTaskExeption();
        }
    }
    public int[] getFibonacciSequence(int cycleNumber, int number) {
        if (cycleNumber > 0 && cycleNumber < 4) {
            Fibonacci sequence = new Fibonacci();
            if (cycleNumber == 1) {
                return sequence.getSequenceWhile(number);
            } else if (cycleNumber == 2) {
                return sequence.getSequenceDoWhile(number);
            } else {
                return sequence.getSequenceFor(number);
            }
        } else {
                throw new IncorrectCycleExeption();
        }
    }
    public int[] getFactorial(int cycleNumber, int number) {
        if (cycleNumber > 0 && cycleNumber < 4) {
            int[] array = new int[1];
            Factorial factorial = new Factorial();
            if (cycleNumber == 1) {
                array[0] = factorial.getResultWhile(number);
            } else if (cycleNumber == 2) {
                array[0] = factorial.getResultDoWhile(number);
            } else {
                array[0] = factorial.getResultFor(number);
            }
            return array;
        } else {
            throw new IncorrectCycleExeption();
        }
    }
}
