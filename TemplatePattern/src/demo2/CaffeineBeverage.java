package demo2;

public abstract class CaffeineBeverage {
	//��ˮ
	public void boilWater(){
		System.out.println("��ˮ");
	}
	//����
	public void brew(){
		System.out.println("����");
	}
	abstract void pourInCup();//������
	abstract void addCondiments();//�ӵ���
	
	
	public final void play()
	{
		boilWater();
		brew();
		pourInCup();
		addCondiments();
	}
	
	
	

}
