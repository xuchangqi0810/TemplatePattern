package cn.xcq.demo;
//实现Game接口
public class HeroicGame extends Game{

	@Override
	void initialize() {
		// TODO Auto-generated method stub
		System.out.println("英雄联盟加载中");
	}

	@Override
	void startPlay() {
		// TODO Auto-generated method stub
		System.out.println("英雄联盟已启动");
	}

	@Override
	void endPlay() {
		// TODO Auto-generated method stub
		System.out.println("英雄联盟已停止");
	}

}
