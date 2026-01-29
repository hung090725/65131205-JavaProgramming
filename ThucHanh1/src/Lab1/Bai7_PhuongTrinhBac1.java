/**
 * 
 */
package Lab1;
import java.util.Scanner;

/**
 * 
 */
/*Giải phương trình bậc 1
Giải phương trình: ax + b = 0

Nhập a, b
Tính và in nghiệm x
Chuẩn bị cho Bài 3: Nhập Xuất Dữ Liệu
Sử dụng Scanner để nhập dữ liệu từ bàn phím
Định dạng đầu ra với printf()
Xử lý ngoại lệ cơ bản khi nhập liệu
Bài tập thực hành với các dạng nhập xuất khác nhau*/

public class Bai7_PhuongTrinhBac1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Bước 1: Tạo Scanner để nhập dữ liệu
        Scanner scanner = new Scanner(System.in);
        
        // Bước 2: Nhập hệ số a và b
        System.out.print("Nhập hệ số a (ax + b = 0): ");
        double a = scanner.nextDouble();
        
        System.out.print("Nhập hệ số b: ");
        double b = scanner.nextDouble();
        
        // Bước 3: Giải phương trình
        double x;
        
        if (a == 0) {
            // Nếu a = 0: không phải phương trình bậc 1
            if (b == 0) {
                
                System.out.println("Phương trình: 0x + 0 = 0");
                System.out.println("Phương trình có vô số nghiệm");
                
            } else {
                
                System.out.printf("Phương trình: 0x + %.0f = 0\n", b);
                System.out.println("Phương trình vô nghiệm");

            }
        } else {
            // Nếu a ≠ 0: tính nghiệm
            x = -b / a;
            
            System.out.printf("Phương trình: %.0fx + %.0f = 0\n", a, b);
            System.out.printf("Nghiệm: x = %.0f\n", x);
            scanner.close();
		
        }

	}
}
