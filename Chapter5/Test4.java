public class Test4 {
	public static void main(String[] args) {

		new Color2() {
			@Override
			public void write5() {
				System.out.println("青");
			}
		}.write5(); //青

		Color2 c1 = new Color2() {
			@Override
			public void write5() {
				System.out.println("青");
			}
		};
		c1.write5(); //青

	}
}

/*
 【無名クラスとは】:名前を持たない（＝クラス定義しない）クラスの作り方
                    あるインターフェイスを実装するときに、あえて名前を付けてクラスファイルにするまでもない場合に使用する。
                    １回限りの処理を行う時に使用する。

 【無名クラスの見分け方】:クラス名またはインターフェース名の後ろに波括弧( { } )が付いているかどうか。
                          ※普通のクラスでは、後ろに波括弧( { } )がない。
                          ※波括弧の中にメソッドの処理を記述する。

 【基本構文】
 		new クラス名 or インターフェース名() {
 		  メソッドの処理
		}.メソッド名();

    もしくは、

		変数の型 変数 = new クラス名 or インターフェース名() {
		  メソッドの処理
		};
		変数.メソッド名();
*/