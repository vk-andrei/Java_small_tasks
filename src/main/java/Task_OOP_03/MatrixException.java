package Task_OOP_03;

public class MatrixException extends Exception {
    private final String warningText;

    MatrixException(String warningText) {
        this.warningText = warningText;
    }

    public String getWarningText() {
        return this.warningText;
    }

}
