package HomeWork6;

public class Cat extends Animal implements AnimalAction{

    public  Cat (String name){
        super(name);
        countCat++;
    }


    @Override
    public void run(int a) {
        lOng = a;
        if (this.lOng > 200){
            System.out.println("Кошка не может пробежать столько метров" + this.lOng);
        } else {
            System.out.println("Кошка пробежала " + this.lOng);
        }

    }

    @Override
    public void sweem(int b) {
        lOng = b;
        System.out.println("Кошка не умеет плавать!!");
    }


}
