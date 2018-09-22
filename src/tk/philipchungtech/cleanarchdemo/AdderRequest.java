package tk.philipchungtech.cleanarchdemo;

public class AdderRequest {
	private final int _num1;
	private final int _num2;

	public AdderRequest(int num1, int num2) {
		_num1 = num1;
		_num2 = num2;
	}

	public int getNum1() {
		return _num1;
	}

	public int getNum2() {
		return _num2;
	}
}
