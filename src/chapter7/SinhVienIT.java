package chapter7;

public class SinhVienIT extends SinhVien {
	private double scoreJava;
	private double scoreHTML;

	public SinhVienIT(double scoreJava, double scoreHTML) {
		super();
		this.scoreJava = scoreJava;
		this.scoreHTML = scoreHTML;
	}

	@Override
	double getDiem() {
		// TODO Auto-generated method stub
		return (this.scoreJava * 2 + this.scoreHTML) / 3;
	}
}
