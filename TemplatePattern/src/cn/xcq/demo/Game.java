package cn.xcq.demo;
//������Ϸ������
public abstract class Game {

	abstract void initialize();
	abstract void startPlay();
	abstract void endPlay();
	
	//ģ���㷨�������������޸�
	public final void Play(){
		//��ʼ����Ϸ
		initialize();
		
		//������Ϸ
		startPlay();
		
		//������Ϸ
		endPlay();
	}
}
