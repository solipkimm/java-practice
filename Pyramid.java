
public class Pyramid {

	public static void main(String[] args) {
		int row = 8;
		
		// row
		for (int i = 1; i <= row; i++) {
			// column-space
			for (int j = row; j > i; j--) {
				System.out.print("    ");
			}
			// column-number
			for (int k = 1; k <= 2*(i-1)+1; k++) {
				int num;
				
				if (k > i) {
					num = (int)Math.pow(2, 2*i-(k+1));
				} else {
					num = (int)Math.pow(2, k-1);
				}
				System.out.printf("%4d", num);
			}
			System.out.println();
		}
		
	}
}
