/**
 * 
 */
package Lab1;

import java.util.Scanner;

/**
 * 
 */
/*Bai3_TheTich: Viết chương trình nhập từ bàn phím cạnh của một khối lập phương. Tính và xuất thể tích của khối chữ nhật*/
public class Bai3_TheTich {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// Bước 2: Nhập cạnh của khối lập phương
		System.out.print("Nhập cạnh của khối lập phương");
		double canh = sc.nextDouble();
		// Bước 3: Tính thể tích
        // Công thức: Thể tích = cạnh³ = cạnh × cạnh × cạnh
        double theTich = Math.pow(canh, 3);
        
        // Bước 4: Tính diện tích toàn phần (khối lập phương có 6 mặt)
        // Công thức: Diện tích toàn phần = 6 × cạnh²
        double dienTichTP = 6 * canh * canh;
        double dienTichTPC2 =6 * Math.pow(canh, 2);
        System.out.printf("Cạnh của khối lập phương : %.2f\n",canh);
        System.out.printf("Thể tích: %.2f\n", theTich);
        System.out.printf("Diện tích toàn phần: %.2f\n", dienTichTP);
        System.out.printf("Diện tích toàn phần cách 2 : %.2f\n",dienTichTPC2);
		
	}

}
