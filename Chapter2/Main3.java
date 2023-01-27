public class Main3 {

  // 1.フルーツを定義するEnumを宣言する
  public enum Fruit {
    Orange,
    Apple,
    Cherry;
  }

  // 2.フルーツの美味しい食べ方を紹介するメソッドを作成する
  public static void howToEat(Fruit fruit) {
    if (fruit == Fruit.Orange) {
        System.out.println("ジュースにするとおいしいよ");
    } else if (fruit == Fruit.Apple) {
        System.out.println("アップルパイはいかが？");
    } else if (fruit == Fruit.Cherry) {
        System.out.println("そのままがおいしいよ");
    }
  }

  // 3.メインメソッドで引数にAppleを選択する
  public static void main(String[] args) {
    howToEat(Fruit.Apple);
  }
}