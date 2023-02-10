import java.util.function.Function;
// java.util.functionパッケージのFunctionインターフェースをimport

public class Main {
	public static void main(String[] args) {

		Function <Integer,String> make1 = a -> a + "です";
		// Functionインターフェースを使用したラムダ式
		/* Function <Integer,String>の
		   Integerは、Function<T,R>のTでメソッドの引数の型
		   Stringは、Function<T,R>のRでメソッドの戻り値の型 */
		String b = make1.apply(2);
		// applyメソッドでIntegerの引数がありStringの値を返す
		System.out.println(b);
		// 出力結果:2です
	}
}

// 関数型インターフェース:実装すべき抽象メソッドが1つしかないインターフェースのこと
// メソッドが1つの関数型インターフェースにおいては、インターフェースを特定すればメソッドも必ず特定される