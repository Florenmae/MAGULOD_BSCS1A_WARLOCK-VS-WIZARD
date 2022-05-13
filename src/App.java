public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Wizards and Warlocks\n");
        /**
         * Create a Wizard Class which Inherits the Properties of Character Class.
         * eg. Wizard.java
         *
         *
         * Create a Warlock Class which Inherits the Properties of Character Class.
         * eg. Warlock.java
         *
         * Each of the above mentioned Classes should have the following:
         * 1 - 2 Damage Spells(you are free to name it)
         * - each method/spell should invoke the damageTarget method from Character
         * and has its corresponding mana cost and damage points
         * 2 - 1 Recover spell(you are free to name it) that will increase both HP and Mana Points
         *
         */

        /**
         * Create a Sequence of each Character Created Casting Spells until
         * one of the Characters Created gets defeated.
         *
         * The sequence should contain the following:
         * 1 - Damaging the Opposing Character.
         * 2 - Both Characters will Damage each other.
         * 3 - At least one of the Characters should cast a "recover" spell that adds HP and MP of the caster.
         * 4 - "Recover spell" has no Mana Point Cost
         * 5 - Either the Warlock/Wizard should be defeated at the end of the Sequence.
         * 6 - The winner will have their level increased by 10 (Create a Method In Character.java that increases level)
         * 7 - Display the Details of each Character at each "phase/turn" to see the current status of the Characters
         *      - Create a method to display details for better readability
         */

        //Create a Wizard Class which Inherits the Properties of Character Class.
        //Create a Warlock Class which Inherits the Properties of Character Class.
        //Wizard and Warlock object class inheriting Character Class
        Wizard Merlin = new Wizard("Merlin", 1, 100, 200);
        Warlock Saruman = new Warlock("Saruman", 1, 100, 200);

        //displaying current character details
        //Display the Details of each Character at each "phase/turn" to see the current status of the Characters
        //Create a method to display details for better readability
        Merlin.displayName();
        Merlin.displaydetails();
        Saruman.displayName();
        Saruman.displaydetails();

        System.out.println("You are playing Warlock VS Wizard!! \nLet The Game Begin!\n");
        System.out.println("Round 1 of Warlock VS Wizard\n");

        //Create a Sequence of each Character Created Casting Spells until
        //one of the Characters Created gets defeated.
        //The sequence should contain the following:
        //* 1 - Damaging the Opposing Character.
        //* 2 - Both Characters will Damage each other.
        Merlin.earthSpike(Saruman, Merlin);
        Saruman.iceSpike(Merlin, Saruman);

        System.out.print("\n");

        Merlin.displayName();
        Merlin.displaydetails();
        Saruman.displayName();
        Saruman.displaydetails();

        System.out.println("Round 2 of Warlock VS Wizard\n");
        Merlin.fireStorm(Saruman, Merlin);
        Saruman.iceCone(Merlin, Saruman);

        Merlin.displayName();
        Merlin.displaydetails();
        Saruman.displayName();
        Saruman.displaydetails();

        System.out.println("Round 3 of Warlock VS Wizard\n");
        //Round 3
        //*3 At least one of the Characters should cast a "recover" spell that adds HP and MP of the caster.
        //* 4 - "Recover spell" has no Mana Point Cost
        Merlin.recall(Merlin);
        Saruman.icejab(Merlin, Saruman);

        Merlin.displayName();
        Merlin.displaydetails();
        Saruman.displayName();
        Saruman.displaydetails();


    }

}