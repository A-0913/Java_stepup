// staticな内部クラスの使い方

// 外部クラス
class OuterClass {
  // staticなフィールド
  private static String str = "OuterClassの変数";

  // staticな内部クラス
  static class InnerClass {
    public void innerSample() {
      System.out.println(str);
    }
  }
  // ※staticな内部クラスから外部クラスの非staticなメンバーにはアクセスできない
  // ※そのため外部クラスのメンバーにアクセスする場合は、外部クラスのメンバーもstaticで宣言する必要がある
  // →内部クラスをstaticクラスで宣言すると、完全に別のクラスとして扱われるため、エラーになる
}

public class Main2 {

  public static void main(String[] args) {
    // staticな内部クラスのインスタンスを生成
    // ※InnerClassを使用するために、外部クラスから内部クラスを呼び出しインスタンスを生成し、内部クラスのオブジェクトicに格納
    OuterClass.InnerClass ic = new OuterClass.InnerClass();
    ic.innerSample();
  }

}

// 内部クラスをstaticクラスで宣言する方法
// 1.外部クラス名.内部クラス名 内部クラスのオブジェクト名 = new 外部クラス名.内部クラス名();