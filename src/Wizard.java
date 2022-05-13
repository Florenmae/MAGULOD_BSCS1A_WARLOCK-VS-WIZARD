public class Wizard extends Character{
    public Wizard(String characterName, int level, int healthPoints, int manaPoints) {
        super(characterName, level, healthPoints, manaPoints);

    }
    //Wizard Skills method class
    //Wizard skill 1 with damage and mana reduction upon cast
    public void fireStorm(Character enemyCharacter, Character enemyName){
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " with Firestorm (Damage - 40)");
        int damagePoints = 40;
        damageTarget(enemyCharacter, damagePoints, enemyName);
    }

    public void earthSpike(Character enemyCharacter, Character enemyName){
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " with earthSprike(Damage - 50)");
        int damagePoints = 50;
        damageTarget(enemyCharacter, damagePoints, enemyName);
    }

    //Wizard Skill Health Points & Mana Points Increase
    public void recall(Character enemyCharacter){
            System.out.println(super.characterName + " used recover spell with 30 HP and 40 MP increase)");
            int increaseHP = 30;
            int increaseMP = 40;
            recover(enemyCharacter, increaseHP, increaseMP);

    }


}