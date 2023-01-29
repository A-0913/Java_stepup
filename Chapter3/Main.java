import java.util.ArrayList;
import java.util.List;
//LinkedListを生成する場合に記述
// import java.util.LinkedList;

public class Main {
	public static void main(String[] args) {
        // ArrayListを生成する場合
        List<String> list1 = new ArrayList<String>();

        // LinkedListを生成する場合に記述
        // List<Integer> list2 = new LinkedList<Integer>();

        // 要素を追加する
        list1.add("りんご");
        list1.add("みかん");

        // 位置を指定して要素を追加する
        list1.add(1, "バナナ");

        System.out.println(list1.get(0));
        System.out.println(list1.get(1));
        System.out.println(list1.contains("バナナ"));
        System.out.println(list1.size());

        list1.remove("バナナ");
        System.out.println(list1.contains("バナナ"));
        System.out.println(list1.size());
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

