package chapter7;

public class Video45 {
	public static void main(String[] args) {
		SinhVien it1 = new SinhVienIT(10, 9);
		System.out.println("it1.getDiem = " + it1.getDiem());
		SinhVien ck1 = new SinhVienCoKhi(10, 9);
		System.out.println("ck1.getDiem = " + ck1.getDiem());
	}
}
