/**
 * 
 */
package Lab1;
import java.util.Scanner;

/**
 * 
 */
public class Bai8_TienDienbacThang {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Bước 1: Tạo Scanner để nhập dữ liệu
        Scanner scanner = new Scanner(System.in);
        
        // Bước 2: Nhập số kWh tiêu thụ
        System.out.print("Nhập số kWh tiêu thụ: ");
        double kWh = scanner.nextDouble();
        
        // Bước 3: Tính tiền điện theo bậc thang
        // Bậc 1: 0 - 50 kWh  → 1,500 VND/kWh
        // Bậc 2: 51 - 100 kWh → 1,600 VND/kWh
        // Bậc 3: 101 - 200 kWh → 1,800 VND/kWh
        // Bậc 4: > 200 kWh    → 2,000 VND/kWh
        double tienDien = 0;
        
        if (kWh <= 50) {
        	tienDien = kWh *  1500;
		} else if (kWh <= 100) {
			tienDien = 50 * 1500 + (kWh - 50) * 1600;
		} else if (kWh <= 200) {
			tienDien = 50 * 1500 + 50 * 1600 + (kWh - 100) * 1800;
		}
        else {
			tienDien = 50 * 1500 + 50 * 1600 + 100 * 1800 + (kWh - 200) * 2000;
		}
        
        
        // Bước 4: Xuất kết quả
        
        System.out.printf("Số kWh tiêu thụ: %,.0f kWh\n", kWh);
        System.out.printf("Tiền điện phải trả: %,.0f VND\n", tienDien);
        scanner.close();   
	}

}
