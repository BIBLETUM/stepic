package inheritance;

public class CatFamily {
    protected int eyes;
    protected int legs;
    protected boolean canEatPerson;

    public CatFamily(int eyes, int legs, boolean canEatPerson) {
        this.eyes = eyes;
        this.legs = legs;
        this.canEatPerson = canEatPerson;
    }
    public void eat(){
        System.out.println("Кушаю");
    }

    public int getEyes() {
        return eyes;
    }

    public void setEyes(int eyes) {
        this.eyes = eyes;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public boolean isCanEatPerson() {
        return canEatPerson;
    }

    public void setCanEatPerson(boolean canEatPerson) {
        this.canEatPerson = canEatPerson;
    }
}
