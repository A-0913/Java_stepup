import java.util.function.Function;

public class Main {
	public static void main(String[] args) {

		Function <Integer,String> make1 = a -> a + "です";

		String b = make1.apply(2);
		System.out.println(b); //2です
	}
}