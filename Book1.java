package dxc;

public class Book1 {
 
 private int  quantity;
 private double price;
 private String name;
 Author author;
 
 Book1(String name,Author author,double price,int quantity)
 {
  this.name=name;
  this.author=author;
  this.price=price;
  this.quantity=quantity;
 }
 
 public void showdetails()
 {
  System.out.println("Showing Book details :");
  System.out.println("Book name :"+name);
  System.out.println("Book price :"+price);
  System.out.println("Book quantity :"+quantity);
  
  System.out.println();
  System.out.println("Showing Author details");
  System.out.println("Author name :"+author.getName());
  System.out.println("Author email :"+author.getEmailid());
  System.out.println("Author gender :"+author.getGender());
 }

 public int getQuantity() {
  return quantity;
 }


 public void setQuantity(int quantity) {
  this.quantity = quantity;
 }


 public double getPrice() {
  return price;
 }


 public void setPrice(double price) {
  this.price = price;
 }


 public String getName() {
  return name;
 }


 public void setName(String name) {
  this.name = name;
 }


 public Author getAuthor() {
  return author;
 }


 public void setAuthor(Author author) {
  this.author = author;
 }


 public static void main(String[] args) 
 {
  Author a1=new Author("A1","A1@gmail.com",'M');
  Book1 b1=new Book1("Book 1",a1,100,2);
  b1.showdetails();

 }

}