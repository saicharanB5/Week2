package dxc;

interface Testable
{
	public boolean testCompatability();
}

class Mobile
{
	private String name;
	private String brand;
	private String osName;
	private String osVersion;
	
	public Mobile(String name, String brand, String osName, String osVersion) {
		super();
		this.name = name;
		this.brand = brand;
		this.osName = osName;
		this.osVersion = osVersion;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getOsName() {
		return osName;
	}

	public void setOsName(String osName) {
		this.osName = osName;
	}

	public String getOsVersion() {
		return osVersion;
	}

	public void setOsVersion(String osVersion) {
		this.osVersion = osVersion;
	}
	
}

class SmartPhone extends Mobile implements Testable
{
	private String networkGeneration;

	public SmartPhone(String name, String brand, String osName, String osVersion,String networkGeneration) {
		super(name, brand, osName, osVersion);
		this.networkGeneration=networkGeneration;
	}

	public String getNetworkGeneration() {
		return networkGeneration;
	}

	public void setNetworkGeneration(String networkGeneration) {
		this.networkGeneration = networkGeneration;
	}

	@Override
	public boolean testCompatability() 
	{
		if(getOsName().equalsIgnoreCase("Saturn"))
		{
			if(networkGeneration.equalsIgnoreCase("3G"))
			{
				if(getOsVersion().equalsIgnoreCase("1.1") || getOsVersion().equalsIgnoreCase("1.2") || getOsVersion().equalsIgnoreCase("1.3"))
				{
					return true;
				}
				else
					return false;
			}
			else if(networkGeneration.equalsIgnoreCase("4G"))
			{
				if(getOsVersion().equalsIgnoreCase("1.2") || getOsVersion().equalsIgnoreCase("1.3"))
				{
					return true;
				}
				else
					return false;
			}
			else if(networkGeneration.equalsIgnoreCase("5G"))
			{
				if(getOsVersion().equalsIgnoreCase("1.3"))
				{
					return true;
				}
				else
					return false;
			}
		}
		else if(getOsName().equalsIgnoreCase("Gara"))
		{
			if(networkGeneration.equalsIgnoreCase("3G"))
			{
				if(getOsVersion().equalsIgnoreCase("EXRT.1") || getOsVersion().equalsIgnoreCase("EXRT.2") || getOsVersion().equalsIgnoreCase("EXRU.1"))
				{
					return true;
				}
				else
					return false;
			}
			else if(networkGeneration.equalsIgnoreCase("4G"))
			{
				if(getOsVersion().equalsIgnoreCase("EXRT.2") || getOsVersion().equalsIgnoreCase("EXRU.1"))
				{
					return true;
				}
				else
					return false;
			}
			else if(networkGeneration.equalsIgnoreCase("5G"))
			{
				if(getOsVersion().equalsIgnoreCase("EXRU.1"))
				{
					return true;
				}
				else
					return false;
			}
			else
				return false;
		}
		else
		{
			return false;
		}
		return false;
	}
	
	
}

public interface Interface_Assig 
{
	public static void main(String args[]){
		SmartPhone smartPhone = new SmartPhone("KrillinM20", "Nebula", "Saturn", "1.3", 
		"5G");
		if(smartPhone.testCompatability())
		 System.out.println("The mobile OS is compatible with the network generation!");
		else
		 System.out.println("The mobile OS is not compatible with the networkgeneration!"); 


}
}
