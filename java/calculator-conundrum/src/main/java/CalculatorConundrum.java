class CalculatorConundrum {
    private static final String NULL_OPERATION_ERROR = "Operation cannot be null";
    private static final String EMPTY_OPERATION_ERROR = "Operation cannot be empty";
    private static final String ILLEGAL_OPERATION_ERROR = "Operation '%s' does not exist";
    private static final String DIVISION_BY_ZERO_ERROR = "Division by zero is not allowed";

    public String calculate(int operand1, int operand2, String operation) {
        if (operation == null) {
            throw new IllegalArgumentException(NULL_OPERATION_ERROR);
        }

        if (operation.isEmpty()) {
            throw new IllegalArgumentException(EMPTY_OPERATION_ERROR);
        }

        return switch (operation) {
            case "+" -> formatResult(operand1, operand2, "+", additiveOperation(operand1, operand2));
            case "*" -> formatResult(operand1, operand2, "*", multiplicativeOperation(operand1, operand2));
            case "/" -> formatResult(operand1, operand2, "/", divisiveOperation(operand1, operand2));
            default -> throw new IllegalOperationException(String.format(ILLEGAL_OPERATION_ERROR, operation));
        };
    }

    private int additiveOperation(int operand1, int operand2) {
        return operand1 + operand2;
    }

    private int multiplicativeOperation(int operand1, int operand2) {
        return operand1 * operand2;
    }

    private int divisiveOperation(int operand1, int operand2) {
        try {
            return operand1 / operand2;
        } catch(ArithmeticException e) {
            throw new IllegalOperationException(DIVISION_BY_ZERO_ERROR, e);
        }
    }

    private String formatResult(int operand1, int operand2, String operation, int result) {
        return String.format("%d %s %d = %d", operand1, operation, operand2, result);
    }
}
