package TeamStuff;

import java.util.ArrayList;

import Exceptions.RowerNotFoundException;

public class TeamData {
    private ArrayList<Rower> roster;

    /* Constructors */
    public TeamData() {
        roster = new ArrayList<Rower>();
    }
    public TeamData(ArrayList<Rower> roster) {
        this.roster = roster;
    }
    
    /* Functionality */
    public boolean onRoster(Rower rower) {
        for (Rower r : roster) {
            if (rower.getName().equals(r.getName())) {
                return true;
            }
        }
        return false;
    }

    public boolean addRower(Rower rower) {
        if (this.onRoster(rower)) {
            return false;
        } else {
            roster.add(rower);
            return true;
        }
    }

    public boolean removeRower(Rower rower) {
        if (this.onRoster(rower)) {
            return false;
        } else {
            roster.remove(rower);
            return true;
        }
    }

    public Rower findRowerByName(String name) throws RowerNotFoundException {
        for (Rower r : roster) {
            if (r.getName().equals(name)) {
                return r;
            }
        } 
        throw new RowerNotFoundException();
    }

    /* Getters and Setters */
    public ArrayList<Rower> getRoster() {
        return roster;
    }
    public void setRoster(ArrayList<Rower> roster) {
        this.roster = roster;
    }
}
