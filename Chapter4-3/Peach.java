import java.math.BigDecimal;

public class Peach extends Fruit {
// 継承（extends）の使い方:class サブクラス名 extends スーパークラス名{}

	Peach(String name, BigDecimal price) {
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

}