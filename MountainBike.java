package SDA;

public class MountainBike extends Bicycle{
    // Clasa ta ma jedno pole
    public int seatHeight;
    // Clas ta ma jeden konstruktor
    public MountainBike(int startHeight,
                        int startCadence,
                        int startSpeed,
                        int startGear) {
        super(startCadence, startSpeed, startGear);
        seatHeight = startHeight;
    }

    // Clasa ta ma dodaną jedną metodę
    public void setHeight(int newValue) {
        seatHeight = newValue;
    }
}
