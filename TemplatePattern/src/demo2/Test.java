package demo2;

public class Test {

	public static void main(String[] args) {
		
		CaffeineBeverage c1=new Coffee();
		c1.play();
		
		System.out.println("------------------------");
		
		CaffeineBeverage c2=new Tea();
		c2.play();
	}
}
