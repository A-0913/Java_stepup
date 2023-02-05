import java.math.BigDecimal;

public class Apple extends Fruit {
// 継承（extends）の使い方:class サブクラス名 extends スーパークラス名{}

  Apple(String name, BigDecimal price) {
	  super(name, price);
	}

  @Override
  // 抽象メソッドgetNameをオーバーライト
  protected String getName() {
    return name;
  }

  @Override
  // 抽象メソッドgetPriceをオーバーライト
  protected BigDecimal getPrice() {
    return price;
  }

  public static void main(String[] args){
	  Basket<Apple> appleBasket = new Basket<>(new Apple("ふじ", new BigDecimal(200)));
	  Basket<Peach> peachBasket = new Basket<>(new Peach("黄金桃", new BigDecimal(300)));

	  appleBasket.printTotalPrice();
	  // 出力結果:「ふじの入った籠は合計300円です」と出力

	  peachBasket.printTotalPrice();
	  // 出力結果:「黄金桃の入った籠は合計400円です」と出力
  }

}