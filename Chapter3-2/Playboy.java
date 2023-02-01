// Characterインターフェイスを継承してPlayboyクラスを定義
public class Playboy implements Character {
	// インターフェースのメソッドを「Playboy」用オーバーライド
	public int attack() {
		System.out.println("遊び人は、ただ遊んでいるだけだった！");
		return 0;
	}
}
