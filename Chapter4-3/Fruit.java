import java.math.BigDecimal;

abstract class Fruit {

  String name;
  BigDecimal price;

  Fruit(String name, BigDecimal price) {
    this.name = name;
    this.price = price;
  }

  abstract protected String getName();
  // 抽象メソッド
  abstract protected BigDecimal getPrice();
  // 抽象メソッド


  /* 《//抽象メソッドとアクセス修飾子》

  　・抽象メソッドの場合、abstractでの修飾が必要。
  　　抽象メソッドはオーバーライドされる前提のメソッドなので、アクセス修飾子はprivate以外を設定できる

  　・アクセス修飾子 protected:同一パッケージのクラスとサブクラスがアクセス可能
  */

}