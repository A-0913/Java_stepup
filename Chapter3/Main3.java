import java.util.HashSet;
// LinkedHashSetを生成する場合に記述
// import java.util.LinkedHashSet;
import java.util.Set;

public class Main3 {
	public static void main(String[] args) {

    // HashSetを生成する場合
    // set(インデックス番号,置き換えたい値) = new HashSet<String>();
    Set<String> set1 = new HashSet<String>();

    // LinkedHashSetを生成する場合に記述
    // set(インデックス番号,置き換えたい値) = new LinkedHashSet<Integer>();
    // Set<Integer> set2 = new LinkedHashSet<Integer>();

    //「スイカ」を追加する
    set1.add("スイカ");
    // 「メロン」を追加する
    set1.add("メロン");

    // Setには位置(インデックス)やキーなどの要素を特定する考え方がない
    // 要素を取り出したいときは繰り返し処理を用いる

    // 要素に「スイカ」が含まれているか確認する
    System.out.println(set1.contains("スイカ"));
    // 出力結果:true

    // 値の存在チェック (falseを返す)
    System.out.println(set1.contains("なし"));
    // 出力結果:false

    // コレクションの要素数の合計を取得する
    System.out.println(set1.size());
    // 出力結果:2

    // 要素「スイカ」を削除する
    set1.remove("スイカ");
    set1.remove("なし"); // 何もしない

    // 要素に「スイカ」が含まれているか確認する
    System.out.println(set1.contains("スイカ"));
    // 出力結果:false

    // コレクションの要素数の合計を取得する
    System.out.println(set1.size());
    // 出力結果:1
	}
}

// コレクションとは？
// たくさんの要素をひとつのユニットに集めた単なるオブジェクトのこと
// 入れ物を表すコンテナと呼ばれることもある
// コレクションは集められたデータを保存し、検索し、処理し、問い合わせに応える

// Javaではコレクションを扱うためにコレクション（Collection）・インターフェースが定義されている
// コレクションの特徴ごとにサブインターフェースが定義されている
// 《サブインターフェースの特徴》
// List:重複した要素を保持することができるコレクション
//      配列との違いは、オブジェクト生成時に要素数の指定は必要がなく、要素を追加・削除するたびにサイズが増減する。
// Set：重複のない要素を管理するコレクション
//      重複した要素を保持することができず、要素の順番も保証されない。
// Map: 「キー」と「値」の組み合わせで要素を管理するコレクション
//      1つの「キー」に対して、1つの「値」が存在するため、「キー」は重複して保持することができない。
//     「値」は、重複して保持することができる。追加した要素の順番は保証されない。

