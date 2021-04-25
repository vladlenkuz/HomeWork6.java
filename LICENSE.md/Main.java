package HomeWork6;

public class HomeWork {

    public static void main(String[] args) {
        Animal dog1 = new Dog("Тузик");
        Animal cat1 = new Cat("Барсик");


        dog1.sweem(180);
        dog1.run(450);

        cat1.sweem(5);
        cat1.run(190);

        counter();

        Animal cat2 = new Cat("Маруся");
        cat2.run(250);
        cat2.sweem(5);

        counter();
    }
    public static void counter(){
        System.out.println("Кошек: " + Cat.countCat);
        System.out.println("Собак: " + Dog.countDog);
        System.out.println("Животных: " + Animal.countAnimal);
    }
}
