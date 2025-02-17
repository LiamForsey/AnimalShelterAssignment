package AnimalShelter;


abstract class ShelterAnimal {
    private final String name;
    private int order;


    public ShelterAnimal(String name) {
        this.name = name;
    }


    public void setOrder(int order) {
        this.order = order;
    }


    public int getOrder() {
        return order;
    }


    public String getName() {
        return name;
    }
}


class Dog extends ShelterAnimal {
    public Dog(String name) {
        super(name);
    }
}


class Cat extends ShelterAnimal {
    public Cat(String name) {
        super(name);
    }
}
