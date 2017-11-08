package sample.model;


public class TownHallModel {

    public enum TypeTown {
         myTown , playerTowns , allianceTowns , garrisonTowns
    }
    public int id;
    public int actionPoint;
    public int townLevel;
    public int wallLevel;
    public TypeTown type;

    public String name;
    public String title;


    public void setTownLevel(int level) {
        this.townLevel = level;
        if(type == TypeTown.garrisonTowns || type == TypeTown.playerTowns) {
            this.actionPoint = (int)(level/3) + 1 ;
        }
        this.actionPoint = (int)(level/3) + 3 ;
    }
}
