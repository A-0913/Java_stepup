public class Main {

  public static void main(String[] args) {
    // 列挙型もほかのクラスと同じように、変数に代入して使うことができる
    Fruit fruit_type = Fruit.Orange;

    System.out.println(fruit_type);
  }

  // Enumの定義
  // アクセス修飾子 enum 列挙名 {列挙子1, 列挙子2, ・・・};
  protected enum Fruit {
    Orange, Apple, Melon
  };

}

// Enum(列挙型)とは：複数の定数をひとつにまとめておくことができる型のこと
// Enumで定義する定数のことを列挙子と呼ぶ
