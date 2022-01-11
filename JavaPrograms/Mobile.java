package week1.day1;

public class Mobile {

	String mobileName = "Apple";
	int mobileWeight = 12;
	double mobileCost = 20000;
	boolean isFullyCharged=true;

	public void makeCall() {
		System.out.println("Call Connected");
	}

	public void sendMessage() {
		System.out.println("Sending Message");

	}

	public static void main(String[] args) {
		Mobile mob = new Mobile();
		mob.makeCall();
		mob.sendMessage();

		System.out.println("*****************");
		System.out.println(mob.mobileName);
		System.out.println(mob.mobileWeight);
		System.out.println(mob.isFullyCharged);
		System.out.println(mob.mobileCost);
	}

}
