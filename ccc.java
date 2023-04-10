package fg;

import java.util.Scanner;
public class OnlineShopping {
public static void main(String[] args)
{
	int numberOfSellers =3,i=0,a=0, sellerProductCount=0,c=0;
	String sellerName;
	double rating =0;
    System.out.println("Enter the number of sellers: ");
    Scanner keyboard = new Scanner(System.in) ;
    numberOfSellers = keyboard.nextInt();
    keyboard.nextLine();
    Seller[] sellers = new Seller[numberOfSellers];
    while(a<numberOfSellers) {
    	System.out.println("Seller name: ");
    	sellerName = keyboard.nextLine();
    	System.out.println("Seller rating: ");
    	rating = keyboard.nextDouble();
    	System.out.println("Number of products by seller: ");
    	sellerProductCount = keyboard.nextInt();
    	keyboard.nextLine();
        sellers[a] = new Seller(sellerName,rating,sellerProductCount);
    	a++;
    }
    while(i<numberOfSellers) {
    	System.out.println(sellers[i].toString());
    	i++;
    }
    System.out.println("Current number of products: "+ sellers[0].removeProduct(50));
    System.out.println("Current number of products: "+ sellers[2].addProduct(100));
    sellers[1].changeRating(-0.6);
    sellers[2].changeRating(0.5);
    while(c<numberOfSellers) {
    	System.out.println(sellers[c].toString());
    	c++;
    }
//enter a sellerNumber1 name Silonn with a rating of 8,4 and a product count of 1123
 //enter a sellerNumber2 name FRIGIDAIRE Store with a rating of 9,5 and a product count of 852
//enter a sellerNumber3 name AGLUCKY Store with a rating of 7 and a product count of 632
//remove 50 products from The Silonn
//print The Silonn's current number of products

 //add 100 products to The AGLUCKY
 //print The AGLUCKY's current number of products

//Decrease The FRIGIDAIRE rating by 0.6
//Increase The AGLUCKY rating by 0.5

//print summary for all sellers by toString
}
}