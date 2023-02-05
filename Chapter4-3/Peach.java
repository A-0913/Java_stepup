import java.math.BigDecimal;

public class Peach extends Fruit {
// 継承（extends）の使い方:class サブクラス名 extends スーパークラス名{}

	Peach(String name, BigDecimal price) {
		// superを用いてスーパークラス(Fruitクラス)のコンストラクタを呼び出し
    super(name, price);
	}

  @Override
  // Fruitクラスの抽象メソッドgetNameをオーバーライト
  protected String getName() {
    return name;
  }

  @Override
  // Fruitクラスの抽象メソッドgetPriceをオーバーライト
  protected BigDecimal getPrice() {
    return price;
  }

}