package christmasGifts;

import sweet.Sweet;
import sweets.Candy;
import sweets.Cookie;
import sweets.Jellybean;
import sweets.Marshmallow;

import java.util.ArrayList;

public class ChristmasGifts {
    public static void main(String[] args) {
        ArrayList<Sweet> gift = new ArrayList<Sweet>();
        gift.add(new Candy("Bon",4.5,200.3,"square"));
        gift.add(new Jellybean("Tasty",4,200,"apple"));
        gift.add(new Marshmallow("Bonimi",4,300.2,"pink"));
        gift.add(new Cookie("Yummy",10.5,400.4,true));
        countOverallWeightAndPrice(gift);
        System.out.println("Information about each sweets:");
        showInformationAboutSweets(gift);
    }

    public static void countOverallWeightAndPrice(ArrayList<Sweet> sweets){
        double overallWeight = 0;
        double overallPrice = 0;
        for(Sweet s : sweets){
            overallWeight += s.getWeight();
            overallPrice +=s.getPrice();
        }
        System.out.println("Overall gift's weight is " + overallWeight);
        System.out.println("Overall gift's price is " + overallPrice);
    }
    public static void showInformationAboutSweets(ArrayList<Sweet> sweets){
        for(Sweet s : sweets){
            System.out.println(s.toString());
            }

        }
    }

