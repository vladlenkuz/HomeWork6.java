package HomeWork6;

public class Dog extends Animal implements AnimalAction  {

    public Dog (String name){
        super(name);
        countDog++;
    }

    @Override
    public void run(int a) {
        lOng = a;
        if (this.lOng > 500){
            System.out.println("Собака не может пробежать " + this.lOng + " метров." );
        } else {
            System.out.println("Собака пробежала " + this.lOng);
        }
    }

    @Override
    public void sweem(int b) {
        lOng = b;
        if (this.lOng > 10){
            System.out.println("Собака не может проплыть "+ this.lOng + " метров.");
        } else {
            System.out.println("Собака проплыла "  + this.lOng + " метров.");
        }

    }
}
