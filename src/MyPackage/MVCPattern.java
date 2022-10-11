package MyPackage;

public class MVCPattern {
    public static void main(String[] args) {
        Ball model= retriveBallFromData();
        BallView view = new BallView();
        BallController controller=new BallController(model,view);
        controller.updateView();

        controller.setBallName("Jabulani");
        controller.setBallErscheinungsjahr("2010");
        controller.setBallFarbe("Lila");
        System.out.println(" ");
        System.out.println("Post-Update");
        System.out.println(" ");
        controller.updateView();
    }

    private static Ball retriveBallFromData()
    {
        Ball ball = new Ball();
        ball.setBallName("Brazuca");
        ball.setFarbe("Blau");
        ball.setErscheinungsjahr("2014");
        return ball;
    }
}
