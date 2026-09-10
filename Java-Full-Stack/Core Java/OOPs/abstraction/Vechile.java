package abstraction;

abstract public class Vechile {
    abstract  void star();
}

class car extends Vechile{

    @Override
    void star() {
        System.out.println("car start with key");
    }
}

class Bike extends Vechile{
    @Override
    void star() {
        System.out.println("bike start with self");
    }
}