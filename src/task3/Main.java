package task3;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Cat cat2 =  foo(cat);
        cat.setName("Вася");
        cat2.setName("Гриша");
        System.out.println(cat2.getName());
        System.out.println(cat.getName());

    }

    public static Cat foo(Cat cat2) {
        Cat m = null;
        try {
            m = (Cat)cat2.clone();
        } catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
return m;
    }
}