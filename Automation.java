package week3.day2;

public class Automation extends MultipleLanguage implements Language, TestTool{

	@Override
	public void python() {
		// TODO Auto-generated method stub
		System.out.println("Overridden");
	}

	public void selenium() 
	{
		System.out.println("This is Selenium method");
	}

	public void java() {
		// TODO Auto-generated method stub
		System.out.println("This is Java method");
	}
	public static void main(String[] args) {
		Automation a = new Automation();
		a.python();
		a.selenium();
		a.java();
	}

}
