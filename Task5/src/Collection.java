import java.util.*;


/**
 * Created by yuchugunova on 31.07.2020.
 */
public class Collection {
    public static void main(String[] args) {

        HashMap<String, List> animals = new HashMap<>();


        List<Cat> cat = new ArrayList();
        List<Dog> dog = new ArrayList();
        List<Duck> duck = new ArrayList();

        cat.add(new Cat("Behemoth", "Black", 5));
        cat.add(new Cat("Tom", "Grey", 7));
        cat.add(new Cat("Garfield", "Ginger", 2));


        dog.add(new Dog("Lassy", "White", 13));
        dog.add(new Dog("Lady", "Brown", 2));
        dog.add(new Dog("Jake", "Yellow", 6));

        duck.add(new Duck("Huey", "male", 1));
        duck.add(new Duck("Dewey", "male", 2));
        duck.add(new Duck("Louie", "male", 3));

        animals.put("cats", cat);
        animals.put("dogs", dog);
        animals.put("ducks", duck);

        printCreat(animals);
        System.out.println("\n");


        cat.removeIf(x -> x.getAge() > 2);
        dog.removeIf(x -> x.getAge() > 2);
        duck.removeIf(x -> x.getAge() > 2);


        printCreat(animals);

    }


    public static void printCreat(HashMap<String, List> animals) {
        for (Map.Entry<String, List> entry : animals.entrySet()) {  //вывод значений HashMap
            System.out.println(entry.getKey());
            for (Object i : entry.getValue()) {
                System.out.println("\t " + i);

            }

        }
    }
}