public class Main2 {

  // 1.フルーツを定義するEnumを宣言する
  public enum Fruit {
    Orange,
    Apple,
    Cherry;
  }

  // 2.フルーツの美味しい食べ方を紹介するメソッドを作成する
  public static void howToEat(Fruit fruit) {
    switch(fruit) {
      case Orange:
        System.out.println("ジュースにするとおいしいよ");
        break;
      case Apple:
        System.out.println("アップルパイはいかが？");
        break;
      case Cherry:
        System.out.println("そのままがおいしいよ");
        break;
    }
  }

  // 3.メインメソッドで引数にOrangeを選択する
  public static void main(String[] args) {
    howToEat(Fruit.Orange);
  }
}