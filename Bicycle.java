package SDA;

public class Bicycle {

    // Classsa ta ma 3 pola

    public int cadence;
    public int gear;
    public int speed;

    // clasa ta ma jeden konstruktor
    public  Bicycle(int startCadebce, int startSpeed, int startGear)

    {
        gear = startGear;
        cadence = startCadebce;
        speed = startSpeed;


    }
    public void setCadence(int newValue)
    {
        cadence = newValue;
    }
    public void setGear(int newValue)
    {
        gear = newValue;
    }
    public void spplyBreak (int decrement)
    {
        speed -= decrement;

    }
    public void speedUp (int increment)
    {
        speed +=increment;
    }
}
