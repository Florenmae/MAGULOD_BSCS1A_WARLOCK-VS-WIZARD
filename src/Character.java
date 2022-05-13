public class Character {
    public String characterName;
    public int level = 1;
    public int healthPoints = 100;
    public int manaPoints = 200;
    /**
     * Create two Constructors
     * 1 - Non Parameterized Constructor
     * 2 - Parameterized Constructor Initializing healthPoints, level, CharacterName and mana
     */
    Character(){
        System.out.println("null");
    }
    //* 2 - Parameterized Constructor Initializing healthPoints, level, CharacterName and mana
    public Character(String characterName, int level, int healthPoints, int manaPoints) {
        this.characterName = characterName;
        this.level = level;
        this.healthPoints = healthPoints;
        this.manaPoints = manaPoints;
    }

    /**
     * Create a Method that displays the Name of the Character
     * e.g. "Character Initialized : Gandalf"
     */

    public void displayName() {
        System.out.println("Character Initialized : " + characterName);
    }

    /**
     * Create a method to Damage Target Character
     */
    public void damageTarget(Character enemyCharacter, int damagePoints, Character enemyName ) {
        /*
          Deduct health points from enemy character
         */
        enemyCharacter.healthPoints -= damagePoints;
        System.out.println("Enemy Character HP Left = " + enemyCharacter.healthPoints);

        enemyCharacter.manaPoints -= 50;
        System.out.println("Enemy Character MP Left = " + enemyCharacter.manaPoints + "\n");

        /*
          Prompt Character is defeated if HP falls below 0
          e.g. Character Shaman defeated.
         */
            if (enemyCharacter.healthPoints <= 0) {
                System.out.println("Character " + enemyCharacter.characterName + " has 0 HP");
                System.out.println("Character " + enemyCharacter.characterName + " suffered DEFEAT!!\n");
                System.out.println("Character " + enemyName.characterName + " WON!!");
                System.out.println("Character " + enemyName.characterName + " Leveled Up!!");
                System.out.println("Character " + enemyName.characterName + " Level increased by 10 levels\n");
                enemyName.level +=10; //adding level

            }
        }

        //Create a method to make the character level up if he wins
    public void leveup(Character enemyName){
        enemyName.level += 10;
        System.out.println(enemyName.characterName+ " Level Up");

    }

    //method on displaying current character details
    public void displaydetails(){
        System.out.println("Wizard : " + characterName);
        System.out.println("HealthPoints : " + healthPoints);
        System.out.println("Mana Points : " + manaPoints);
        System.out.println("Level : " + level);
        System.out.print("\n");


    }
    //Create a method to make the Character recover its HP and MP
    //no MP cost
    public void recover(Character enemyCharacter, int increaseHP, int increaseMP){
        enemyCharacter.healthPoints += increaseHP;
        enemyCharacter.manaPoints += increaseMP;
        System.out.println("Character " + enemyCharacter.characterName + " HP Left = " + enemyCharacter.healthPoints);
        System.out.println("Character " + enemyCharacter.characterName + " MP Left = " + enemyCharacter.manaPoints + "\n");

    }

}