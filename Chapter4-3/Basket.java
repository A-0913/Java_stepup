import java.math.BigDecimal;

class Basket<E extends Fruit> {
// <E extends Fruit>:境界型パラメータ:適用される型を継承したクラスで使用されている型に制限している
// 継承（extends）の使い方:class サブクラス名 extends スーパークラス名{}

// Eには、Apple型かPeach型が代入される
// Apple や Peachという具体的な型を Eとして抽象的に扱い、結果として汎用的に使えるBasketクラスである

  private E elem;
  private final BigDecimal PRICE = new BigDecimal(100);

  Basket(E e) {
    elem = e;
  }

  void replace(E e) {
    elem = e;
  }

  E get() {
    return elem;
  }

  void printName() {
    System.out.println("籠の中身は" + elem.getName() + "です");
    // EはFruitのサブクラスなので、getNameが使えると保証されている
  }

  void printTotalPrice() {
    BigDecimal totalPrice = PRICE.add(elem.getPrice());
    System.out.println(elem.getName() + "の入った籠は合計" + totalPrice + "円です");
	}

}
