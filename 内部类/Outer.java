package 内部类;

public class Outer {
    private int index = 100;                      //外部类成员

    class Inner{
        private int index=50;                     //内部类成员
        void print(){
            int index=30;                         //内部类局部变量
            System.out.println(index);            //输出内部类局部变量
            System.out.println(this.index);       //输出内部类成员变量
            System.out.println(Outer.this.index); //输出外部类成员变量

        }
    }
    void print(){
        Inner inner=new Inner();                   //创建内部类对象
        inner.print();                             //调用内部类方法

        }
        Inner getInner(){
        return new Inner();                        //创建匿名内部类对象
        }

    }

