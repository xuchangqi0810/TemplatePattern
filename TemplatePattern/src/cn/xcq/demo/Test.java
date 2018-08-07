package cn.xcq.demo;

public class Test {

	public static void main(String[] args) {
		Game game= new HeroicGame();
		game.Play();
		
		System.out.println("---------------------------");
		Game game2 = new ThekingGame();
		game2.Play();
	}
}
