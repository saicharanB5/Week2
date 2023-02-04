package dxc;
public class static_1 
{
	private static int counter;
	private String billId;
	private String paymentMode;
	
	static
	{
		counter=9000;
	}
	public static_1(String paymentMode)
	{
		this.billId="B"+ ++counter;
		this.paymentMode=paymentMode;
	}
	public String getBillId() {
		return billId;
	}
	public void setBillId(String billId) {
		this.billId = billId;
	}
	public String getPaymentMode() {
		return paymentMode;
	}
	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}
	

public static void main(String[] args)
	{
		static_1 bill1= new static_1("Debit card");
		static_1 bill2= new static_1("Paypal");
		
		static_1[] bills= {bill1,bill2};
		for(static_1 bill:bills)
		{
			System.out.println("Bill Details");
			 System.out.println("Bill Id: " + bill.getBillId());
			 System.out.println("Payment method: " + bill.getPaymentMode());
			 System.out.println();
		}
	}
}