/**
 * 
 */
package Lab1;
import java.io.*;
import java.util.Scanner;
/**
 * 
 */
/*java.io.* → Nhập tất cả lớp dùng để ghi/đọc file

Bao gồm: FileWriter, BufferedWriter, FileReader, BufferedReader, File...

java.util.Scanner → Nhập lớp để nhập dữ liệu từ bàn phím

java.time.LocalDate → Nhập lớp lấy ngày hôm nay

java.time.format.DateTimeFormatter → Nhập lớp để định dạng ngày (28/01/2026)*/
public class Bai9_NhatKyCaNhan {

	/**
	 * @param args
	 */
	static final String FILE_NAME = "nhatky.txt";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nNHẬT KÝ CÁ NHÂN");
            System.out.println("1. Ghi nhật ký");
            System.out.println("2. Đọc nhật ký");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");

            int choice;
            try {
                choice = Integer.parseInt(sc.nextLine()); // dùng nextLine để tránh lỗi xuống dòng
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số hợp lệ!");
                continue;
            }

            if (choice == 1) {
                ghiNhatKy(sc);
            } else if (choice == 2) {
                docNhatKy();
            } else if (choice == 0) {
                System.out.println("hẹn hôm sau");
                break;
            } else {
                System.out.println("Lựa chọn không hợp lệ!");
            }
        }

        sc.close();
    }
    /*// import java.time.*;      //  Nếu muốn thêm ngày (không bắt buộc)
Tại sao cần java.io.*?
FileWriter → Tạo file và ghi dữ liệu
BufferedWriter → Ghi nhanh hơn (buffer)
FileReader → Đọc file
BufferedReader → Đọc nhanh hơn (buffer)
File → Kiểm tra file có tồn tại không*/
    // Hàm ghi nhật ký (append vào cuối file)
    static void ghiNhatKy(Scanner sc) {
        System.out.println("Nhập nội dung nhật ký (gõ 'END' để kết thúc):");

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME, true))) {
            while (true) {
                String line = sc.nextLine();
                if (line.equalsIgnoreCase("END")) break;
                bw.write(line); 
                bw.newLine();
            }
            bw.write("-----"); // ngăn cách các lần ghi
            bw.newLine();
            System.out.println("Đã lưu nhật ký vào file: " + FILE_NAME);
        } catch (IOException e) {
            System.out.println("Lỗi ghi file: " + e.getMessage());
        }
    }

    // Hàm đọc nhật ký từ file
    static void docNhatKy() {
        File f = new File(FILE_NAME);

        // Nếu chưa có file thì báo
        if (!f.exists()) {
            System.out.println("Chưa có nhật ký nào. File chưa tồn tại!");
            return;
        }

        System.out.println("\n--- NỘI DUNG NHẬT KÝ ---");
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Lỗi đọc file: " + e.getMessage());
        }
    }
	

}
