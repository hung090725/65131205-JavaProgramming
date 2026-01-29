/**
 * 
 */
package Lab1;
/*import là nhập vào  còn scanner dùng để đọc dữ liệu từ bàn phím*/
import java.util.Scanner;

// ĐỀ: Viết chương trình cho phép nhập họ và tên sinh viên, điểm trung bình từ bàn phím sau đó xuất ra màn hình.
/** 
 * 
 */
public class Bai1_DTB_65131205 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/// Bước 1: Tạo đối tượng Scanner để nhập dữ liệu từ bàn phím
		Scanner sc = new Scanner(System.in);
		/// Bước 2: Tạo đối tượng Scanner để nhập dữ liệu từ bàn phím
		System.out.print("Nhập Họ và tên sinh viên :");
		//Dùng để đọc cả một dòng văn bản (String) từ bàn phím.cả khoảng trắng xong xuống dòng nếu viết int trước lỗi 
		String hoTen = sc.nextLine();
		// Bước 3: Nhập điểm trung bình
		System.out.print("Nhập điểm trung bình :");
		double diemtb = sc.nextDouble();
		System.out.println("Họ Và tên:" + hoTen);
		System.out.printf("điểm Trung Bình : %.2f", diemtb);
		sc.close();
	
	}

}
