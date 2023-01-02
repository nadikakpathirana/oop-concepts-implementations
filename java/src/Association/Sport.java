package Association;

public class Sport {
    public String sportName;

    public Sport(String sportName) {
        this.sportName = sportName;
    }

    public void play(){
        System.out.println("Playing " + this.sportName);
    }
}
