// Apple や Peachという具体的な型をEとして抽象的に扱い、結果として汎用的に使える Basketクラスが用意される
public class Basket<E> {
	  private E elem;

	  Basket(E e) {
	    elem = e;
	  }

	  void replace(E e) {
	    elem = e;
	  }

	  E get() {
	    return elem;
	  }
}

/*
※コンパイル後の Basketクラスは次のような状態になっている

 class Basket {
  private Apple elem;

  Basket(Apple e) {
    elem = e;
  }

  void replace(Apple e) {
    elem = e;
  }

  Apple get() {
    return elem;
  }
}
*/