package MyPackage;

public class Ball {
    private String BallName;
    private String Farbe;
    private String Erscheinungsjahr;

    public String getBallName()
    {
        return BallName;
    }

    public void setBallName(String ballName)
    {
        this.BallName=ballName;
    }

    public String getFarbe()
    {
        return Farbe;
    }

    public void setFarbe(String farbe)
    {
        this.Farbe=farbe;
    }

    public String getErscheinungsjahr()
    {
        return Erscheinungsjahr;
    }

    public void setErscheinungsjahr(String erscheinungsjahr)
    {
        this.Erscheinungsjahr=erscheinungsjahr;
    }

}
