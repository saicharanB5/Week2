package dxc;

abstract class Payment1
{
	private int customerid;
	private String paymentid;
	private double serviceTaxPercentage;
	
	public Payment1(int customerid)
	{
		this.customerid=customerid;
	}

	public int getCustomerid() {
		return customerid;
	}

	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}

	public String getPaymentid() {
		
		return paymentid;
	}

	public void setPaymentid(String paymentid) {
		this.paymentid = paymentid;
	}

	public double getServiceTaxPercentage() {
		return serviceTaxPercentage;
	}

	public void setServiceTaxPercentage(double serviceTaxPercentage) {
		this.serviceTaxPercentage = serviceTaxPercentage;
	}
	public abstract double payBill(double amount);
}
class DebitCardPayment extends Payment1
{
	static int counter;
	private double discountPercentage;
	private double servicetax;
	private double total;
	
	static
	{
		counter=1000;
	}
	public DebitCardPayment(int customerid) {
		super(customerid);
		
		setPaymentid("D"+ ++counter);
	}

	@Override
	public double payBill(double amount) 
	{
		if(amount<=500)
		{
			this.servicetax=2.5;
		}
		else if(amount>500 && amount <=1000)
		{
			this.servicetax=4;
		}
		else if(amount>1000)
		{
			this.servicetax=5;
		}
		
		if(amount<=500)
		{
			this.discountPercentage=1;
		}
		else if(amount>500 && amount <=1000)
		{
			this.discountPercentage=2;
		}
		else if(amount>1000)
		{
			this.discountPercentage=3;
		}
		
		this.total=amount+(amount*this.servicetax*0.01)-(amount*this.discountPercentage*0.01);
		return this.total;
	}

	public double getDiscountPercentage() {
		return discountPercentage;
	}

	public void setDiscountPercentage(double discountPercentage) {
		this.discountPercentage = discountPercentage;
	}

	public double getServicetax() {
		return servicetax;
	}

	public void setServicetax(double servicetax) {
		this.servicetax = servicetax;
	}
	
	
	
}

class CreditcardPayment extends Payment1
{
	static int counter;
	private double servicetax;
	private double total;
	
	static
	{
		counter=1000;
	}
	public CreditcardPayment(int customerid) {
		super(customerid);
		setPaymentid("C"+ ++counter);
	}
@Override
	public double payBill(double amount) 
	{
		if(amount<=500)
		{
			this.servicetax=3;
		}
		else if(amount>500 && amount <=1000) {
			this.servicetax=5;
		}
		else if(amount>1000)
		{
			this.servicetax=6;
		}
		this.total=amount+(amount*this.servicetax*0.01);
		return total;
		}
		public double getTotal() {
			return total;
		}
		public void setTotal(double total) {
			this.total = total;
		}
		public double getServicetax() {
			return servicetax;
		}
		public void setServicetax(double servicetax) {
			this.servicetax = servicetax;
		}
		
		
}
public class Abstract_assig {

	public static void main(String[] args) 
	{
		DebitCardPayment debitCardPayment = new DebitCardPayment(101);
		 double billAmount=Math.round(debitCardPayment.payBill(500)*100)/100.0;
		System.out.println("Customer Id: " + debitCardPayment.getCustomerid());
		System.out.println("Payment Id: " + debitCardPayment.getPaymentid());
		System.out.println("Service tax percentage: " + 
		debitCardPayment.getServicetax());
		System.out.println("Discount percentage: " + 
		debitCardPayment.getDiscountPercentage());
		System.out.println("Total bill amount: " + billAmount);
		CreditcardPayment creditCardPayment = new CreditcardPayment(102);
		 billAmount=Math.round(creditCardPayment.payBill(1000)*100)/100.0;
		System.out.println("Customer Id: " + creditCardPayment.getCustomerid());
		System.out.println("Payment Id: " + creditCardPayment.getPaymentid());
		System.out.println("Service tax percentage: " + 
		creditCardPayment.getServicetax());
		System.out.println("Total bill amount: " + billAmount);
	}

}

