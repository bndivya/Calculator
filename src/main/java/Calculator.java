public class Calculator {
    public int operate(int num1, int num2, String operator) {
        int result = 0;

        switch (operator) {
            case "add": {
                result = num1 + num2;
            }
        }
        return result;
    }
}
