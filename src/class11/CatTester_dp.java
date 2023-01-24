package class11;

public class CatTester_dp {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.eat();
        cat1.name="lego";
        cat1.breed="Van Cat";
        cat1.age=2;
        cat1.colors="Greay";
        cat1.attidtude=false;


        Cat cat2= new Cat();
        cat2.name="loki";
        cat2.breed="Domestic";
        cat2.colors="White";
        cat2.speak();

        System.out.println(cat1.name);
    }
}
