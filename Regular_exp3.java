package dxc;

class Shipment{
	 public boolean checkProductNameValidity(String productName) {
	   String pattern = "^[a-zA-Z]+\\s[a-zA-Z]+\\s?[a-zA-Z]+$";
	   return productName.matches(pattern);
	 }
	 public boolean checkProductIdValidity(String productId) {
	   String pattern = "^[a-zA-Z0-9]{2,20}$";
	   return productId.matches(pattern);
	 }
	 public boolean checkTrackerIdValidity(String trackerId) {
	   String pattern = "^[A-Z]:[A-Z]{4}:[a-z]{3}:[0-9]{2}$";
	   return trackerId.matches(pattern);
	 }
	}

	class Regular_exp3 {
	 public static void main(String[] args) {
	   Shipment shipment = new Shipment();
	 
	   String productName = "Digital Camera";
	   System.out.println("The product name is " + 
	    (shipment.checkProductNameValidity(productName) ? "valid!" : "invalid!"));
	   String productId = "DC1911";
	   System.out.println("The product Id is " + 
	    (shipment.checkProductIdValidity(productId) ? "valid!" : "invalid!"));
	   String trackerId = "D:CMDC:cmd:23";
	   System.out.println("The tracker Id is " + 
	    (shipment.checkTrackerIdValidity(trackerId) ? "valid!" : "invalid!"));
	 }
	}
