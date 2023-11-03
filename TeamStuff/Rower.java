package TeamStuff;
import java.util.ArrayList;

import ErgStuff.ErgPiece;

public class Rower {
    private String name;
    private ArrayList<ErgPiece> ergPieces;
    private int weight;

    /* Constructors */
    public Rower(String name) {
        this.name = name;
    }

    public Rower(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    /* Functionality */
    public void addPiece(ErgPiece piece) {
        ergPieces.add(piece);
    }

    public void removePiece(ErgPiece piece) {
        ergPieces.remove(piece);
    }


    /* Getters and Setters */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<ErgPiece> getErgPieces() {
        return ergPieces;
    }

    public void setErgPieces(ArrayList<ErgPiece> ergPieces) {
        this.ergPieces = ergPieces;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}