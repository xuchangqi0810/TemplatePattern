package cn.xcq.demo;
//实现Game接口
public class ThekingGame extends Game{

	@Override
	void initialize() {
		// TODO Auto-generated method stub
		System.out.println("王者荣耀加载中");
	}

	@Override
	void startPlay() {
		// TODO Auto-generated method stub
		System.out.println("王者荣耀已启动");
	}

	@Override
	void endPlay() {
		// TODO Auto-generated method stub
		System.out.println("王者荣耀已停止");
	}

}
