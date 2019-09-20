package basicjava;

import java.sql.SQLOutput;

public class BasicStuff {
    public static void main(String[] args) {
        double age0 = 19;
        double age1 = 22;
        System.out.println("We are " + age0 + " and " + age1);
        //int SumofAges = age0 + age1;
        System.out.println("The sum of our ages is " + (age0 + age1));
        System.out.println("6/3");
        System.out.println("6/4");
        System.out.println( Integer.MAX_VALUE);
        System.out.println( Integer.MIN_VALUE);
        System.out.println( Integer.MIN_VALUE - 1);

        //Hours converted to weeks and days
        int hours = 1600;
        int day1 = hours/24;
        int week = day1/ 7;
        System.out.println("There are " + week + " weeks or " + day1 + " days in "+ hours + " hours.");

        //Volume and Surface Area of a cone
        double h = 9;
        double r = 2;
        double A = (Math.PI * r*r) + (Math.PI * r * Math.sqrt(r*r + h*h));
        double V = (1.0/3.0)* Math.PI *r*r*h;
        System.out.println("The Volume and Surface Area of a cone with radius " + r + " and a height of " + h + " are "
                + V +  " and " + A + " respectively.");
    }


}




//if (livingNeighborsCount ==2)
//                        color = new Color(150.0f, livingNeighborsCount/maxNeighbors, 238.0f);
//                        g2.setPaint(color);
//                    if (livingNeighborsCount == 3)
//                        color = new Color(255.0f, livingNeighborsCount/maxNeighbors, 242.0f);
//                        g2.setPaint(color);
//                    else
//                        color = new Color(0.0f, livingNeighborsCount/maxNeighbors, 0.0f);
//                       g2.setPaint(color);