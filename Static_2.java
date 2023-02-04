package dxc;

public class Static_2 {
	
	private static int counter;
	private String registrationId;
	private String name;
	private long contactNumber;
	private String city;
	
	static
	{
		counter=10000;
	}
	
	Static_2(String name,long contactNumber,String city)
	{
		this.name=name;
		this.contactNumber=contactNumber;
		this.city=city;
		this.registrationId="D"+ ++counter;
	}
	
	
	public static int getCounter() {
		return counter;
	}

	public static void setCounter(int counter) {
		Static_2.counter = counter;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	

	public String getRegistrationId() {
		return registrationId;
	}


	public void setRegistrationId(String registrationId) {
		this.registrationId = registrationId;
	}


	public static void main(String[] args) 
	{
		Static_2 p1=new Static_2("Franklin",7656784323L, "Texas");
		Static_2 p2=new Static_2("Merina",7890423112L, "New York");
		Static_2[] participants = { p1, p2 };
		for(Static_2 p : participants)
		{
			System.out.println("Hi"+p.getName()+"! Your registration id is "+p.getRegistrationId());
		}
		
	}

}