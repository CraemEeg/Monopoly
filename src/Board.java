import java.util.LinkedList;

public class Board {
    LinkedList board = new LinkedList();

Board(){
    Space go = new Space( "go", 1,false);
    Property theOldCreek= new Property ("The Old Creek",2,60,"Brown", 2,10,30,90,160,250);
    PotLuck potLuck3= new Property ("The Old Creek",3,60,"Brown", 2,10,30,90,160,250);
    Property gangstersParadise= new Property ("Gangster Paradise",4,60,"Brown", 4,20,60,180,320,450);
    Tax tax5 = new Property ("The Old Creek",5,60,"Brown", 2,10,30,90,160,250);
    Station brightonStation= new Station ("Brighton Station",6);
    Property theAngelsDelight= new Property ("The Angels Delight",7,100,"Blue", 6,30,90,270,400,550);
    Opportunity Opportunity8= new Property ("The Old Creek",8,60,"Brown", 2,10,30,90,160,250);
    Property potterAvenue= new Property ("Potter Avenue",9,100,"Blue", 6,30,90,270,400,550);
    Property grangerDrive= new Property ("Granger Drive",10,120,"Blue", 8,40,100,300,450,600);
    Space jail = new Space ("Jail",11,false);
    Property skywalkerDrive= new Property ("Skywalker Drive",12,140,"Purple",10 ,50,150,450,625,750);
    Utility teslaPowerCo= new Utility ("Tesla Power Co",13,150);
    Property wookieHole= new Property ("Wookie Hole",14,140,"Purple", 10,50,150,450,625,750);
    Property reyLane= new Property ("The Old Creek",15,60,"Purple", 2,10,30,90,160,250);
    Station hoveStation= new Station ("The Old Creek",16,60,"Brown");
    Property bishopDrive= new Property ("bishopDrive",17,60,"Brown", 2,10,30,90,160,250);
    PotLuck potLuck18= new Property ("The Old Creek",18,60,"Brown", 2,10,30,90,160,250);
    Property dunhamStreet= new Property ("Dunham Street",19,60,"Brown", 2,10,30,90,160,250);
    Property broylesStreet= new Property ("Broyles Street",20,60,"Brown", 2,10,30,90,160,250);
    FreeParking freeParking= new Property ("The Old Creek",21,60,"Brown", 2,10,30,90,160,250);
    Property yueFelSquare= new Property ("The Old Creek",22,60,"Brown", 2,10,30,90,160,250);
     Opportunity opportunity23= new Property ("The Old Creek",23,60,"Brown", 2,10,30,90,160,250);
    Property mulanRouge= new Property ("The Old Creek",24,60,"Brown", 2,10,30,90,160,250);
    Property hanXinGardens= new Property ("The Old Creek",25,60,"Brown", 2,10,30,90,160,250);
    Station falmerStation= new Property ("The Old Creek",26,60,"Brown", 2,10,30,90,160,250);
    Property shatnerClose= new Property ("The Old Creek",27,60,"Brown", 2,10,30,90,160,250);
    Property picardAvenue= new Property ("The Old Creek",28,60,"Brown", 2,10,30,90,160,250);
    Property edisonWater= new Property ("The Old Creek",29,60,"Brown", 2,10,30,90,160,250);
    Property crusherCreek= new Property ("The Old Creek",30,60,"Brown", 2,10,30,90,160,250);
    Space goToJail= new Space ("The Old Creek",31,false);
    Property siratMews= new Property ("The Old Creek",32,60,"Brown", 2,10,30,90,160,250);
    Property ghengisCresent= new Property ("The Old Creek",33,60,"Brown", 2,10,30,90,160,250);
    PotLuck potLuck34= new Property ("The Old Creek",34,60,"Brown", 2,10,30,90,160,250);
    Property ibisCLose= new Property ("The Old Creek",35,60,"Brown", 2,10,30,90,160,250);
    Property portsladeStation= new Property ("The Old Creek",36,60,"Brown", 2,10,30,90,160,250);
    Opportunity opportunity37= new Property ("The Old Creek",37,60,"Brown", 2,10,30,90,160,250);
    Property jamesWebbWay= new Property ("The Old Creek",38,60,"Brown", 2,10,30,90,160,250);
    Tax superTax = new Property ("The Old Creek",39,60,"Brown", 2,10,30,90,160,250);
    Property turingHeights = new Property ("The Old Creek",40,60,"Brown", 2,10,30,90,160,250);
  }

}
