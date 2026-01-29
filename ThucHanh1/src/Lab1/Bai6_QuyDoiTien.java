/**
 * 
 */
package Lab1;
import java.util.Scanner;
/**
 * 
 */
/*Quy đổi tiền tệ
Viết chương trình quy đổi:
USD sang VND (1 USD = 23,500 VND)
EUR sang VND (1 EUR = 27,000 VND)*/
public class Bai6_QuyDoiTien {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double tylGiaUSD = 26000;  // 1 USD = 23,500 VND
        double tylGiaEUR = 31000;  // 1 EUR = 27,000 VND
        
		System.out.print("Nhập Số Tiền USD :");
		double USD = sc.nextDouble();
		System.out.print("Nhập Số Tiền EUR :");
		double EUR = sc.nextDouble();
		
		double usdSangVND = USD * tylGiaUSD;
		double eurSangVND = EUR * tylGiaEUR;
		
		System.out.printf(" Đổi USD Sang VND : %,.0f USD = %,.0f VND \n ",USD,usdSangVND);
		System.out.printf("Đổi EUR Sang VND : %,.0f EUR = %,.0f VND \n",EUR,eurSangVND);
		sc.close();
	}

}
