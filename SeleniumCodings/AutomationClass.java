package week3.weedayassignment;

public class AutomationClass extends MultipleLanguage {

	public void java() {
		System.out.println("I am Learning Java");

	}

	@Override
	public void Ruby() {
		System.out.println("I am Learning Ruby");
	}

	public void Selenium() {
		System.out.println("I am Learning Selenium");
		
	}
	public static void main(String[] args) {
		AutomationClass al = new AutomationClass();
		al.java();
		al.Python();
		al.Ruby();
		al.Selenium();
	}

	

}
