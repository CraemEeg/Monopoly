

public class Utility extends Space{



    Utility(String  name, int position, int price){
        super(name,position, true);
    }

    int rentOwedIf1UtilityIsOwed(int roll){
        int owed;
        return owed = roll*4;

    }

     int rentOwedIf2UtilityIsOwed(int roll){
        int owed;
        return owed = roll*10;

    }

}
