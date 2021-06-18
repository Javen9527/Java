/** java 基础
1. 一个java源文件中，只能有一个public类，可以有多个非public类；
2. 一个Java源文件中，public类名需要和源文件名相同；
3. javac 编译 .java 文件至.class文件；
4. java 执行时候只需要类名（文件名）不需要后缀；

5. java包：将类分类打包管理 package
6. java import

7. java的对象和数组变量类型都是 引用
8. java常量：final

9. 类中的变量有三种：
   static修饰的变量（类只有一份）
   实例变量：方法之外的变量（可以有访问修饰符）
   局部变量：方法之内、块内的变量（必须初始化才能使用）

10. java修饰符有两种：访问修饰符 + 非访问修饰符
    访问修饰符：default private public protected
    非访问修饰符：static final abstract synchronized transient volatile

11. instanceof运算符

12. java内置类型有包装类：装箱和拆箱
*/

/** java 面向对象 - 继承
1. extends继承：使用自类继承类
   Java不支持多继承，但是支持多重继承
   java所有的类都是继承自java.lang.Object

2. implements继承：使用自类继承接口
   支持多继承

3. super 和 this: super指向父类，this指向自己 

4. final修饰类时，表示该类不能被继承；修饰方法时，表示该方法不能被子类重写

5. 子类继承父类时，不会继承构造函数，只会显式（super + 参数）和隐式调用（无参构造）
*/

/** java 面向对象 - 多态
1. 多态的条件：继承 + 重写 + 父类引用指向子类对象

2. java的多态和c++多态的区别：c++中通过virtual（虚函数）来区别想要子类重写的方法和普通方法
   而java中默认都是想要子类重写的方法，通过final来区别不想要子类重写的方法

3. 抽象类

*/

/** 接口 - interface
1. 接口：接口不是类，是一些列需要类去实现的抽象方法；
2. 接口没有构造方法，不能有成员变量，除了static和final变量，支持多实现
3. 接口和抽象类也是不同的
*/

/** 枚举

*/

/** 包：包名即路径，类名即源文件名
https://www.runoob.com/java/java-package.html
*/


public class myFirstClass{
    public myFirstClass(String name){
        System.out.println("name = " + name);
    }

    public static void main(String[] args){
        myFirstClass myfc = new myFirstClass("Javen");

        if("javen" instanceof String)
            System.out.println("yes");

        Character c = new Character('a');
        if(Character.isLetter(c))
            System.out.println("is letter");

    }
}
