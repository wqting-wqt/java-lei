package 类集合.类与对象;

public class Person {
    public String name;
    public int age;
      Person(){
    }
    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
    public void sayhello(){
          System.out.println("hello everyone");
    }
}
