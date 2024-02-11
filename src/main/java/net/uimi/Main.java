package net.uimi;

public class Main {
    static Human emily = new Human("Emily", "Williams", 25);
    static Human daniel = new Human("Daniel", "Williams", 22);

    static Pet bessy = new Pet("cat", "Bessy");

    static Human jessy = new Human("Jessy", "Atkins", 19, 90, new String[][]{{"monday", "a walk"}, {"saturday", "dishes"}, {"friday", "cucumber war with neighbours"}});
    static Human david = new Human("David", "Atkins", 23, 97, new String[][]{{"wednesday", "a walk"}, {"sunday", "dishes"}, {"friday", "cucumber war with neighbours 2.0"}});
    static Human jimmy = new Human("Jimmy", "Atkins", 5, 80, new String[][]{{"wednesday", "homework"}, {"sunday", "a walk"}, {"friday", "cucumber war with neighbours 3.0"}});
    static Pet doggos = new Pet("dog", "Doggos", 4, 70, new String[]{"barking at cars", "begging for food"});

    static Family williamsFamily = new Family(emily, daniel);
    static Family atkinsFamily = new Family(jessy, david);

    public static void main(String[] args) {
        System.out.println("Williams family:");
        System.out.println(emily.toString());
        System.out.println(daniel.toString());

        System.out.println("Atkins family:");
        System.out.println(jessy.toString());
        System.out.println(david.toString());

        atkinsFamily.addChild(jimmy);
        atkinsFamily.setPet(doggos);

        System.out.println("Jimmy's methods:");;
        jimmy.setFamily(atkinsFamily);
        System.out.println(jimmy.describePet());
        System.out.println(jimmy.greetPet());
        System.out.println(jimmy.toString());
        System.out.println(doggos.toString());

    }
}
