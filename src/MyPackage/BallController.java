package MyPackage;

public class BallController {
    private Ball model;
    private BallView view;

    public BallController(Ball model, BallView view)
    {
        this.model=model;
        this.view=view;

    }

    public void setBallName(String name)
    {
        model.setBallName(name);
    }

    public String getBallName()
    {
        return model.getBallName();
    }

    public void setBallFarbe(String farbe)
    {
        model.setFarbe(farbe);
    }

    public String getBallFarbe()
    {
        return model.getFarbe();
    }

    public void setBallErscheinungsjahr(String erscheinungsjahr)
    {
        model.setErscheinungsjahr(erscheinungsjahr);
    }

    public String getBallErscheinungsjahr()
    {
        return model.getErscheinungsjahr();
    }

    public void updateView() {
        view.printBallDetails(model.getBallName(), model.getFarbe(), model.getErscheinungsjahr());
    }
}
