package chapter7;

public class SinhVienCoKhi extends SinhVien {
	private double scoreCNC;
	private double scorePLC;

	public SinhVienCoKhi(double scoreCNC, double scorePLC) {
		super();
		this.scoreCNC = scoreCNC;
		this.scorePLC = scorePLC;
	}

	@Override
	double getDiem() {
		// TODO Auto-generated method stub
		return (this.scoreCNC + this.scorePLC) / 2;
	}

}
