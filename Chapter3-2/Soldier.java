// Characterインターフェイスを継承してSoldierクラスを定義
public class Soldier implements Character {
	// インターフェースのメソッドを「Soldier」用にオーバーライド
	public int attack() {
		System.out.println("戦士の会心の一撃！");
		return 100;
	}
}
