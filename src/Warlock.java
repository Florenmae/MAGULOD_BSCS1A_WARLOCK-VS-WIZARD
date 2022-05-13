public class Warlock extends Character{
    //Warlock constructor inherits character class
    public Warlock(String characterName, int level, int healthPoints, int manaPoints) {
        super(characterName, level, healthPoints, manaPoints);
    }

    //Warlock Skills method class
    //Warlock skill 1 with damage and mana reduction upon cast
    public void iceSpike(Character enemyCharacter, Character enemyName){
        System.out.println(super.characterName + " attacks " + enemyName.characterName + " with iceSpike (Damage - 30)");
        int damagePoints = 30;
        damageTarget(enemyCharacter, damagePoints, enemyName);
    }
    //Warlock skill 2 with damage and mana reduction upon cast
    public void iceCone(Character enemyCharacter, Character enemyName){
        System.out.println(super.characterName + " attacks " + enemyName.characterName + " with iceCone (Damage - 40)");
        int damagePoints = 40;
        damageTarget(enemyCharacter, damagePoints, enemyName);
    }
    //Warlock skill 3 with damage and mana reduction upon cast
    public void icejab(Character enemyCharacter, Character enemyName){
        System.out.println(super.characterName + " attacks " + enemyName.characterName + " with iceJab (Damage - 60)");
        int damagePoints = 60;
        damageTarget(enemyCharacter, damagePoints, enemyName);
    }


}