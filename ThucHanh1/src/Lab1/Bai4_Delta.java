/**
 * 
 */
package Lab1;

import java.util.Scanner;

/**
 * 
 */
/*Bai4_Delta: Viết chương trình nhập các hệ số của phương trình bậc 2. Tính delta và xuất căn delta ra màn hình.*/
public class Bai4_Delta {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		// Bước 2: Nhập hệ số a
        System.out.print("Nhập hệ số a (ax² + bx + c = 0): ");
        double a = scanner.nextDouble();
     // Bước 3: Nhập hệ số b
        System.out.print("Nhập hệ số b: ");
        double b = scanner.nextDouble();
        
        // Bước 4: Nhập hệ số c
        System.out.print("Nhập hệ số c: ");
        double c = scanner.nextDouble();
     // Bước 5: Tính delta
        // Công thức: Δ = b² - 4ac
        double delta = b * b - 4 * a * c;
        
        // Bước 6: Tính căn delta (nếu delta >= 0 mới có căn)
        double canDelta = 0;
        if (delta >= 0) {
            // Math.sqrt() tính căn bậc 2
            canDelta = Math.sqrt(delta);
        }
        System.out.printf("Phương trình: %.2fx² + %.2fx + %.2f = 0\n", a, b, c);
        System.out.printf("Delta (Δ): %.2f\n", delta);
        
        // Kiểm tra: nếu delta >= 0 thì in căn delta, không thì in thông báo
        if (delta >= 0) {
            System.out.printf("Căn Delta (√Δ): %.2f\n", canDelta);
        } else {
            System.out.println("Căn Delta: không tồn tại (vì Δ < 0)");
        }
        scanner.close();

	}

}
