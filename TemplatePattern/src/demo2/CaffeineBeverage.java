package demo2;

public abstract class CaffeineBeverage {
	//烧水
	public void boilWater(){
		System.out.println("烧水");
	}
	//冲泡
	public void brew(){
		System.out.println("冲泡");
	}
	abstract void pourInCup();//倒饮料
	abstract void addCondiments();//加调料
	
	
	public final void play()
	{
		boilWater();
		brew();
		pourInCup();
		addCondiments();
	}
	
	
	

}
