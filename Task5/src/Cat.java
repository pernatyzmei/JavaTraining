/**
 * Created by yuchugunova on 31.07.2020.
 */
public class Cat {
    private String name, color;
    private int age;


    public Cat(String name, String color, int age) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public int getAge() {
        return age;
    }


    public String toString(){
        return ("Name: "+name + ", Age: " + age + ", Color: " + color);   //перегрузка стандартного метода для sout вывода HashMap
    }

}
