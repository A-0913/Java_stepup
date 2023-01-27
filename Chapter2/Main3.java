public class Main3 {

  // 1.フルーツを定義するEnumを宣言する
  public enum Fruit {
    Orange,
    Apple,
    Cherry;
  }

  // 2.フルーツの美味しい食べ方を紹介するメソッドを作成する
  public static void howToEat(Fruit fruit) {
    // Enumはクラスインスタンスのような振る舞いをするが、==を使って比較できる※
    if (fruit == Fruit.Orange) {
        System.out.println("ジュースにするとおいしいよ");
    } else if (fruit == Fruit.Apple) {
        System.out.println("アップルパイはいかが？");
    } else if (fruit == Fruit.Cherry) {
        System.out.println("そのままがおいしいよ");
    }
  }

  // ※Enumはクラスインスタンスと同じ扱いができるためequals()メソッドを使った比較も可能
  // ただし変数"fruit"がnullの場合、「NullPointerException」がスローされるため注意が必要
  // if (fruit.equals(Fruit.Orange))

  // 3.メインメソッドで引数にAppleを選択する
  public static void main(String[] args) {
    howToEat(Fruit.Apple);
  }
}