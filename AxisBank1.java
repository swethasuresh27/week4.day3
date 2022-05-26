package week4.day3;

public class AxisBank1 extends BankInfo{

	public void deposit() {
		System.out.println("override deposit");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        AxisBank1 obj = new AxisBank1();
        obj.saving();
        obj.fixed();
        obj.deposit();
	}
}