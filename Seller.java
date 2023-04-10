package fg;

public class Seller {
private String name;
private double rating;
private int Numberofproducts;

//---------------------------------------------------------------
//Constructor -- initializes name, rating, number of products
//---------------------------------------------------------------

public Seller(String Name,double rate, int Number) {
name = Name;
rating = rate;
Numberofproducts= Number;

}
//--------------------------------
//Decrements products number by the given parameter
//--------------------------------
public int removeProduct(int num) {
Numberofproducts = Numberofproducts -num;
return Numberofproducts;
}
// --------------------------------
// Increases product number by the given parameter
// --------------------------------
public int addProduct(int num) {
	Numberofproducts = Numberofproducts + num;
	return Numberofproducts;
}
// --------------------------------------------------------------------
// Returns a string containing the name, number of products.
// --------------------------------------------------------------------
public String toString() { 
    return "Seller " + name + " has " + Numberofproducts + " products and the seller rating is "+ rating;
}
// --------------------------------------------------
// Change the rating of the seller by the given parameter
// --------------------------------------------------
public double changeRating(double Rating) {
	rating = rating+Rating;
	return rating;
}
}