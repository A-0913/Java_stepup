import java.util.HashMap;
import java.util.Map;
// TreeMapを生成する場合に記述
// import java.util.TreeMap;

public class Main2 {
	public static void main(String[] args) {

    // HashMapを生成する場合
    // Map<キーのデータ型, 値のデータ型> マップ名 = new HashMap<>();
    Map<Integer, String> map1 = new HashMap<Integer, String>();

    // TreeMapを生成する場合に記述
    // Map<キーのデータ型, 値のデータ型> マップ名 = new HashMap<>();
    // Map<String, String> map2 = new TreeMap<String, String>();

    // キー0に「ぶどう」を追加する
    map1.put(0, "ぶどう");
    // キー3に「もも」を追加する
    map1.put(3, "もも");

    // 登録済みのキーで追加すると上書きされる
    map1.put(0, "マスカット");

    // キー0に位置する要素を取得する
    System.out.println(map1.get(0));
    // 出力結果:マスカット

    // 1に位置する要素を取得する
    System.out.println(map1.get(1));
    // 出力結果:null

    // キーの存在チェック
    System.out.println(map1.containsKey(0));
    // 出力結果:true

    // 値の存在チェック (falseを返す)
    System.out.println(map1.containsValue("ぶどう"));
    // 出力結果:false

    // コレクションの要素数の合計を取得する
    System.out.println(map1.size());
    // 出力結果:2

    // キーを削除する
    map1.remove(0);
    map1.remove(1); // 何もしない

    // キーと値を指定して要素を削除する
    map1.remove(3, "もも");
    map1.remove(3, "なし"); // 何もしない

    // 要素(=バナナ)がリストに含まれるか確認する
    System.out.println(map1.containsValue("もも"));
    // 出力結果:false

    // コレクションの要素数の合計を取得する
    System.out.println(map1.size());
    // 出力結果:0
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

