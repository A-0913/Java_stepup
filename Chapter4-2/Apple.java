public class Apple {
	  private String name;

	  Apple(String name) {
	    this.name = name;
	  }

	  String getName() {
	    return name;
	  }

	  public static void main(String[] args) throws Exception {

	    // 宣言時に<〜>で囲むことで型を指定
		  Basket<Apple> appleBasket = new Basket<>(new Apple("ふじ"));
		  System.out.println(appleBasket.get().getName());
		  // 出力結果：ふじ

		  appleBasket.replace(new Apple("紅玉"));
		  System.out.println(appleBasket.get().getName());
		  // 出力結果：紅玉

      // replaceの引数に Peachクラスのインスタンスを渡そうとするとコンパイルエラーとなる
		  appleBasket.replace(new Peach("黄金桃"));
	  }
}