package animal;

public class AnimalWorld {

    void getAnimalVoice(Animal animal) {
        animal.voice();
    }

    public static void main(String[] args) {
        AnimalWorld animalWorld = new AnimalWorld();
        animalWorld.getAnimalVoice(new Cat());
        animalWorld.getAnimalVoice(new Dog());
        animalWorld.getAnimalVoice(new Goat());
    }

}
