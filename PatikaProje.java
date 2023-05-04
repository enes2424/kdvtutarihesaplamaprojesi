import java.util.Scanner;

public class PatikaProje {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("KDV'siz Fiyat = ");
		double fiyat = input.nextDouble(), kdvOranı = (fiyat > 1000)? 0.08 : 0.18, kdvtutarı = fiyat * kdvOranı;
		System.out.println("KDV'li Fiyat = " + (fiyat + kdvtutarı));
		System.out.println("KDV tutarı = " + kdvtutarı);
	}

}
