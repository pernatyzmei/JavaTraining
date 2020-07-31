/**
 * Created by yuchugunova on 31.07.2020.
 */
public class Dog {
    private String name, color;
    private int age;

    public Dog(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public int getAge() {
        return age;
    }
    public String toString(){
        return ("Name: "+name + ", Age: " + age + ", Color: " + color);   //перегрузка стандартного метода для sout вывода HashMap
    }
}
