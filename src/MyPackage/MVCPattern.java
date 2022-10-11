package MyPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

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

//        Ball arr[]={};
//        ArrayList<Ball> arrayList = new ArrayList<Ball>(Arrays.asList(arr));
//        arrayList.add(model);
//
        System.out.println("");
//        System.out.println(arrayList);
        Ball arr[];
        arr=new Ball[10];
        arr[0]=model;
        System.out.println(arr[0].getBallName());


        //adaug intr-un array de mingi
        Ball ball= new Ball();
        ball.setFarbe("rot");
        ball.setErscheinungsjahr("20202");
        ball.setBallName("Minge");
        Ball mingi[]=new Ball[100];
        //mingi[0]=ball;
        for(int i=0; i<mingi.length;i++)
        {
            mingi[i]=ball;
        }

        Scanner scanner= new Scanner(System.in);
        System.out.println("1: Adding an element");
        System.out.println("2: Deleting an element");

        int num= scanner.nextInt();
        switch (num)
        {
            case 1:
                //functie pentru adaugare
                break;
            case 2:
                //functie pentru stergere
                break;
        }
        scanner.close();
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
