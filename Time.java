public class Time {
    private int hours;
    private int minutes;
    private double seconds;

    /* Constructors */
    public Time() {
        hours = 0;
        minutes = 0;
        seconds = 0;
    }

    public Time(double seconds) {
        hours = 0;
        this.minutes = 0;
        this.seconds = seconds;
    }

    public Time(int minutes, double seconds) {
        hours = 0;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public Time(int hours, int minutes, double seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    /* Getters and Setters */
    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public double getSeconds() {
        return seconds;
    }

    public void setSeconds(double seconds) {
        this.seconds = seconds;
    }

    /* Overriden Methods */
    @Override
    public String toString() {
        if (hours == 0) {
            if (minutes == 0) {
                return "" + seconds;
            }
            return minutes + ":" + seconds;
        }
        return hours + ":" + minutes + ":" + seconds;
    }
}