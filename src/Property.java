public class Property extends Space {

    int price;
    int costWith0Houses;
    int costWith1Houses;
    int costWith2Houses;
    int costWith3Houses;
    int costWith4Houses;
    int costWithHotel;
    String group;
    Player owner = null;


    Property(String  name, int position, int price, String group, int costWith0Houses, int costWith1Houses, int costWith2Houses, int costWith3Houses,int costWith4Houses, int costWithHotel) {
        super(name,position,true);
        this.price = price;
        this.group = group;
        this.costWith0Houses = costWith0Houses;
        this.costWith1Houses = costWith1Houses;
        this.costWith2Houses = costWith2Houses;
        this.costWith3Houses = costWith3Houses;
        this.costWith4Houses = costWith4Houses;
        this.costWithHotel = costWithHotel;
    }


// If a player lands on a property it checks to see who owns it
    Player checkProperty(Player personLandingOnProperty){
        if(owner == null){
            return null;}
        else {return owner;}
    }

    void purchaseProperty(Player newOwner){
        if (owner == null){
            this.owner = newOwner;
        }

    }


    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public Player getOwner() {
        return owner;
    }

    public int getCostWith0Houses() {
        return costWith0Houses;
    }

    public int getCostWith1Houses() {
        return costWith1Houses;
    }

    public int getCostWith2Houses() {
        return costWith2Houses;
    }

    public int getCostWith3Houses() {
        return costWith3Houses;
    }

    public int getCostWith4Houses() {
        return costWith4Houses;
    }

    public int getCostWithHotel() {
        return costWithHotel;
    }






}
