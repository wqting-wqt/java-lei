package 类集合.类与对象;

public class Employeetest {
    public static void main(String[] args){
        Employee e=new Employee("小明",10,2000);
        System.out.println("姓名："+e.name);
        System.out.println("年龄：" +e.age);
        e.sayhello();
        System.out.println(e.computeSalary(10,50.0));

    }
}
