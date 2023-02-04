package dxc;

class CabServiceProvider {
 
 private String cabServiceName;
 private int totalcabs;
 Driver driver;
 
 public CabServiceProvider(String cabServiceName, int totalcabs) 
 {
  this.cabServiceName = cabServiceName;
  this.totalcabs = totalcabs;
 }
 
 public String getCabServiceName() {
  return cabServiceName;
 }

 public void setCabServiceName(String cabServiceName) {
  this.cabServiceName = cabServiceName;
 }

 public int getTotalcabs() {
  return totalcabs;
 }

 public void setTotalcabs(int totalcabs) {
  this.totalcabs = totalcabs;
 }

 public Driver getDriver() {
  return driver;
 }

 public void setDriver(Driver driver) {
  this.driver = driver;
 }

 public double CalculateRewardPrice(Driver driver)
 {
  double bonus=0;
  
  if(cabServiceName=="Halo")
  {
     if (driver.getAverageRating() >= 4.5 && driver.getAverageRating() <= 5)
             {
               bonus = 10 * driver.getAverageRating();
             }
             else if (driver.getAverageRating() >= 4 && driver.getAverageRating() < 4.5)
             {
               bonus = 5 * driver.getAverageRating();
             }
  }
  else if(cabServiceName=="Aber")
  {
   if (driver.getAverageRating() >= 4.5 && driver.getAverageRating() <= 5)
            {
                bonus = 8 * driver.getAverageRating();
            } 
            else if (driver.getAverageRating() >= 4 && driver.getAverageRating() < 4.5) 
            {
                bonus = 3 * driver.getAverageRating();
            }
  }
  return Math.round(bonus);
 }
}

public class Cab_service {

 public static void main(String[] args) 
 {
  CabServiceProvider c1=new CabServiceProvider("Halo",50);
  
  Driver D1 = new Driver("Luke", 4.8f);
        Driver D2 = new Driver("Mark", 4.2f);
        Driver D3 = new Driver("David", 3.9f);
        
        Driver[] D={D1,D2,D3};
        
        for(Driver d:D)
        {
           System.out.println("Driver Name: " + d.getDriverName());
              double bonus = c1.CalculateRewardPrice(d);

              if (bonus > 0){
                  System.out.println("Bonus: $" + bonus);
              }else {
                  System.out.println("Sorry! bonus is not available");
        }
 }

}
}