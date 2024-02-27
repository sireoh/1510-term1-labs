package p;

public class BaseballPlayer {
    private String name;
    private String position;
    private int numAtBats;
    private int numSingles;
    private int numDoubles;
    private int numTriples;
    private int numHomeRuns;
    private double battingAverage;
    
    public BaseballPlayer(String newName, String newPosition) {
        name = newName;
        position = newPosition;
        numAtBats = 0;
        numSingles = 0;
        numDoubles = 0;
        numTriples = 0;
        numHomeRuns = 0;
        battingAverage = 0.0;
    }
    
    public static void main(String[] args) {
        BaseballPlayer bp = new BaseballPlayer("Vincent Fung", "Pitcher");
        System.out.println("The name of the player is: "+ bp.name
                + "\nand their position is: " + bp.position);
    }
}
