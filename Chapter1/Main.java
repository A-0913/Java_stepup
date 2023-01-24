// 内部クラスの使い方

// 外部クラス
class OuterClass {
  private String str = "OuterClassの変数";

  // 内部クラス
  class InnerClass {
    public void innerSample() {
      System.out.println(str);
    }
  }
}

public class Main {

  public static void main(String[] args) {
    // 外部クラスのインスタンスの生成
    // ※内部クラスのインスタンスを生成するには、まず外部クラスのインスタンスを生成する
    OuterClass oc = new OuterClass();
    // 外部クラスのオブジェクトから内部クラスのインスタンスを生成
    // ※外部クラスのオブジェクトocから内部クラスのインスタンスを生成し、内部クラスのオブジェクトicに格納する
    OuterClass.InnerClass ic = oc.new InnerClass();
    ic.innerSample();
  }

}

// 内部クラスのインスタンスを生成する方法
// 1.外部クラス名 外部クラスのオブジェクト名 = new 外部クラス名();
// 2.外部クラス名.内部クラス名 内部クラスのオブジェクト名 = 外部クラスのオブジェクト名.new 内部クラス名();