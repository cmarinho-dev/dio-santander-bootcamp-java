package ExerciciosDiversos.Calculator;

import java.util.stream.LongStream;

public enum Operation {
    SUM("+", n -> LongStream.of(n).reduce(0, Long::sum)),
    SUBTRACTION("-", n -> LongStream.of(n).reduce(0, (n1, n2) -> n1 - n2));

    private final String signal;
    private final Calc operationCallback;

    Operation(String signal, Calc operationCallback) {
        this.signal = signal;
        this.operationCallback = operationCallback;
    }

    public String getSignal() { return signal; }
    public Calc getOperationCallback() { return operationCallback; }

}
