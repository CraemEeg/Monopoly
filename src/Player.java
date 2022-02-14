import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;



public class Player {
    int money;
    HashMap<String, Space> properties = new HashMap<String, Space>();
    int position;
    Boolean inJail = false;


    Player(){
        //Starting money for a player
        this.money = 2500;
        this.position = 0;
    }

    void takeTurn(){
        int value = this.rollDice();
        if(inJail == false){
            position = position + value;
        }
    }

    //have a seperate rollDice function for rolls in prison and on the board
    int rollDice(){
        int value;
        Random ran = new Random();
        value = ran.nextInt(1,6);
        return value;
    }

    void addProperty(Property property){
        properties.put(property.getName(), property);
    }

    void loseMoney( int amountOwed){
        money = money - amountOwed;
    }

    void addMoney(int addMoney){
        money = money + addMoney;
    }


}
