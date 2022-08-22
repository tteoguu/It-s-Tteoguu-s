public class Character {
    int strength;
    int agility;
    int intelligence;
    String name;

    public void sayMyName() {
        System.out.println("Hello my name is " + name);
    }
    public void sayMyStrength() {
        System.out.println("My Strength is " + strength);
    }
    public void sayMyAgility() {
        System.out.println("My Agility is " + agility);
    }
    public void sayMyIntelligence() {
        System.out.println("My Intelligence is " + intelligence + "\n");
    }

}