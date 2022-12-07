public class Animal {

    String animalName;

    public Animal(String animalName) {
        this.animalName = animalName;
    }

    public void animalSound() {
        System.out.println("Rooooar");


    }

    public void animalSound(String intensity) {
        if (intensity.equals("high")) {
            System.out.println("Roarrrrrrrr");
        } else if (intensity.equals("low")) {
            System.out.println("Roar");
        } else {
            System.out.println("Cannot reproduce it properly");


        }


    }


}
