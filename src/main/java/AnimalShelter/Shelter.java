package AnimalShelter;


import java.util.LinkedList;


class Shelter {
    private final LinkedList<Dog> dogs;
    private final LinkedList<Cat> cats;
    private int order;


    public Shelter() {
        dogs = new LinkedList<>();
        cats = new LinkedList<>();
        order = 0;
    }


    public void enqueue(ShelterAnimal animal) {
        animal.setOrder(order++);
        if (animal instanceof Dog) {
            dogs.add((Dog) animal);
        } else if (animal instanceof Cat) {
            cats.add((Cat) animal);
        }
    }


    public ShelterAnimal dequeueAny() {
        if (dogs.isEmpty() && cats.isEmpty()) {


            return null;
        } else if (dogs.isEmpty()) {
            return dequeueCat();
        } else if (cats.isEmpty()) {
            return dequeueDog();
        } else {


            if (dogs.peek().getOrder() < cats.peek().getOrder()) {
                return dequeueDog();
            } else {
                return dequeueCat();
            }
        }
    }



    public Dog dequeueDog() {
        return dogs.isEmpty() ? null : dogs.poll();
    }


    public Cat dequeueCat() {
        return cats.isEmpty() ? null : cats.poll();
    }
}

