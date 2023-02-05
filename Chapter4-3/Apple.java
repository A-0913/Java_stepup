import java.math.BigDecimal;

public class Apple extends Fruit {

  Apple(String name, BigDecimal price) {
	    super(name, price);
	}

  @Override
  protected String getName() {
    return name;
  }

  @Override
  protected BigDecimal getPrice() {
    return price;
  }

  public static void main(String[] args){
	  Basket<Apple> appleBasket = new Basket<>(new Apple("ふじ", new BigDecimal(200)));
	  Basket<Peach> peachBasket = new Basket<>(new Peach("黄金桃", new BigDecimal(300)));

	  appleBasket.printTotalPrice(); // 「ふじの入った籠は合計300円です」と出力
	  peachBasket.printTotalPrice(); // 「黄金桃の入った籠は合計400円です」と出力
  }

}