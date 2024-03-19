package 内部类;

public class test {
    public static void main(String[] args){
        Outer outer=new Outer();              //创建外部类对象
        outer.print();
        Outer.Inner inner= outer.getInner();  //创建内部类对象
        inner.print();
    }
}
