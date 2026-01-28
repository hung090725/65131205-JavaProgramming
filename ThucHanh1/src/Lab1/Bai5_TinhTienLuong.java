/**
 * 
 */
package Lab1;
import java.util.Scanner;
/**
 * 
 */
/*Bài 1: Tính tiền lương
Viết chương trình tính lương nhân viên:
Nhập số giờ làm và lương theo giờ
Tính tổng lương
Nếu làm trên 40 giờ, những giờ vượt tính 1.5 lần*/
public class Bai5_TinhTienLuong {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập Số Giờ Làm : ");
		double soGio = sc.nextDouble();
		System.out.print("nhập Lương Theo Giờ :");
		double luongGio = sc.nextDouble();
		double tongLuong = 0;
		if(soGio <=40) {
			tongLuong = (soGio * luongGio);
		}
		else {
			double luongBinhThuong = 40 * luongGio;
			double gioVuot = soGio - 40;
			double luongVuot = gioVuot * luongGio * 1.5;
			tongLuong = luongBinhThuong + luongVuot;
		}
		System.out.printf("Số giờ làm: %.0f giờ\n", soGio);
        System.out.printf("Lương theo giờ: %.0f VND\n", luongGio);
        System.out.printf("Tổng lương: %,.0f VND\n", tongLuong);
        /* , (Dấu phẩy):  "Hãy tự động thêm dấu phân cách hàng nghìn vào cho tôi".
         * nhập Lương Theo Giờ :50000
Số giờ làm: 45 giờ
Lương theo giờ: 50000 VND
Tổng lương: 2.375.000 VND*/
		

	}

}
