public class Space {

    String name;
    int position;
    boolean canBeBought;

    Space(String name, int position, boolean canBeBought){
        this.name = name;
        this.position = position;
        this.canBeBought = canBeBought;
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    public boolean isCanBeBought() {
        return canBeBought;
    }
}
