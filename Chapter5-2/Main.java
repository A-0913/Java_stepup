// コレクションフレームワーク
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
  public static void main(String[] args) {
	    List<Integer> list = new ArrayList<Integer>();
	    // 数値のリスト ArrayListを生成する
	    // List<データ型名> オブジェクト名 = new ArrayList<データ型名>();
	    // 宣言時に<〜>で囲むことで型を指定できる機能を「ジェネリクス」と呼ぶ
	    list.add(5);
	    list.add(3);
	    list.add(100);
	    list.add(40);
	    list.add(2);

	    Comparator<Integer> comparator = new Comparator<Integer>() {
	      @Override
	      public int compare(Integer o1, Integer o2) {
	     // 2つのint値を数値的に比較するメソッド。返される値は、次から返される値と同じになる。
	        return Integer.valueOf(o1).compareTo(Integer.valueOf(o2));
	        // 【戻り値】o1 == o2の場合は値0、o1 < o2の場合は0より小さい値、o1> o2の場合は0より大きい値
	      }
	    };

	    Collections.sort(list, comparator);
	    // Collections.sort(リスト ,コンパレータ);
	    // 第2パラメータとしてコンパレータを指定することでコンパレータが示す順序に従って、指定されたリストをソートする

	    System.out.println(list);
  }
}

/*

【Comparatorクラスとは】
  java.utilパッケージに存在するクラスでリストなどコレクションをソートする際にソートの定義を行うインターフェース

【Comparatorクラスの使い方】

  Comparator<T> 変数 = new Comparator<T>() {
    @Override
    public int compare(T o1, T o2) {
      return 戻り値;
    }
  };

  →compareメソッドの引数には比較対象の最初のオブジェクトと２番目のオブジェクトを設定し、戻り値には数値を返す
  →最初の引数が2番目の引数より小さい場合は負の整数、両方が等しい場合は0、最初の引数が2番目の引数より大きい場合は正の整数を戻す

*/