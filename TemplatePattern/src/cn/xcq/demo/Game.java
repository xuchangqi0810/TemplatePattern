package cn.xcq.demo;
//定义游戏抽象类
public abstract class Game {

	abstract void initialize();
	abstract void startPlay();
	abstract void endPlay();
	
	//模板算法，不允许被子类修改
	public final void Play(){
		//初始化游戏
		initialize();
		
		//启动游戏
		startPlay();
		
		//结束游戏
		endPlay();
	}
}
