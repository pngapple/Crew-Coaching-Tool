package ErgStuff;
public class ErgPiece {
    private Time split;
    private int distance;
    private Time time;

    public ErgPiece(Time split, int distance, Time time) {
        this.split = split;
        this.distance = distance;
        this.time = time;
    }

    @Override 
    public String toString() {
        return "Split: " + split + "\nDistance: " + distance + "\nTime: " + time;
    }
}
