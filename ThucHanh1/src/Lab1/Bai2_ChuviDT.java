/**
 * 
 */
package Lab1;
import java.util.Scanner;

/**
 * 
 */
/*Bai2_ChuviDT:  Viết chương trình nhập từ bàn phím 2 cạnh của hình chữ nhật. Tính và xuất chu vi, diện tích và cạnh nhỏ của hình chữ nhật.*/
public class Bai2_ChuviDT {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Bước 1: Tạo Scanner
        Scanner sc = new Scanner(System.in);
        // Bước 2: Nhập chiều dài
        System.out.print("Nhập chiều dài hình chữ nhật :");
        double chieuDai = sc.nextDouble();
     // Bước 3: Nhập chiều rộng
        System.out.print("Nhập Chiều rộng hình chữ nhật :");
        double chieuRong = sc.nextDouble();
     // Công thức: Chu vi = 2 × (chiều dài + chiều rộng)
        double chuVi = 2 * (chieuDai + chieuRong);
     // Bước 5: Tính diện tích
        // Công thức: Diện tích = chiều dài × chiều rộng
        double dienTich = chieuDai * chieuRong;
     // Bước 6: Tìm cạnh nhỏ nhất
        // Math.min() tìm giá trị nhỏ nhất giữa 2 số
        double canhNho = Math.min(chieuDai, chieuRong);
        
        System.out.printf("chiều dài : %.2f\n",chieuDai);
        System.out.printf("chiều rộng : %.2f\n",chieuRong);
        System.out.printf("chu vi : %.2f\n",chuVi);
        System.out.printf("diện tích : %.2f\n",dienTich);
        System.out.printf("cạnh nhỏ : %.2f\n",canhNho);
        
        sc.close();
	}

}
