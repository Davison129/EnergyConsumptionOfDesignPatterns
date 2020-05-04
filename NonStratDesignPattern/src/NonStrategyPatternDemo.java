public class NonStrategyPatternDemo {
	public static void main(String[] args) {
		System.out.println("10 + 5 = " + operationAdd(10, 5));

		System.out.println("10 - 5 = " + operationSubtract(10, 5));

		System.out.println("10 * 5 = " + operationMultiply(10, 5));
	}
	public static int operationAdd(int num1, int num2) {
		return num1 + num2;
	}
	public static int operationSubtract(int num1, int num2) {
		return num1 - num2;
	}
	public static int operationMultiply(int num1, int num2) {
		return num1 * num2;
	}
}