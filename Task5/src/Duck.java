/**
 * Created by yuchugunova on 31.07.2020.
 */
public class Duck {
    private String name, sex;
    public int age;

    public Duck(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String toString(){
        return ("Name: "+name + ", Age: " + age + ", Sex: " + sex);   //перегрузка стандартного метода для sout вывода HashMap
    }
}
