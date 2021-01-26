public class NumberTest {
	public static void main(String[] args) {
		System.out.println("Checking Number...");
		
		for (int i = 1; i < 11; i++) {
			if (i%2 == 0) {
				System.out.println(i+", Even");
			} else {
				System.out.println(i+", Odd");
			}
		}
	}
}