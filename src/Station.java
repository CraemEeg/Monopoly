public class Station extends Space{

    int price;
    String name;
    int position;


    Station(String name, int position){
        super(name,position, true);

        this.price = 200;
    }
}
