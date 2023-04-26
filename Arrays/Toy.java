import org.ietf.jgss.Oid;

public class Toy{
    int CustId;
    String brand;
    String name;
    double prize;
    String size;
    String color;
    String material;
    int discount;
    String location;
    String month;
    
    @Override
    public String toString() {
      return "Toy [CustId=" + CustId + ", brand=" + brand + ", name=" + name + ", prize=" + prize + ", size=" + size
          + ", color=" + color + ", material=" + material + ", discount=" + discount + ", location=" + location
          + ", month=" + month + "]";
    }
    public Toy(int custId, String brand, String name, double prize, String size, String color, String material,
        int discount, String location, String month) {
      this.CustId = custId;
      this.brand = brand;
      this.name = name;
      this.prize = prize;
      this.size = size;
      this.color = color;
      this.material = material;
      this.discount = discount;
      this.location = location;
      this.month=month;

    }
    public void displayAll(){
      System.out.println("Customer ID: "+CustId+"   "+"Product Brand: "+brand+"   "+" Product Name: "+name+" "+"Product Prize: "+prize+"   "+"Product Size: "+size+"  "+"Product Color : "+color+"  "+"Product  Material : "+material+"  "+"Product Discount : "+discount+"   "+"Product Location : "+location);
    }
   
    public void display(){
      System.out.println("Customer ID: "+CustId);
      System.out.println("Product Brand: "+brand);
      System.out.println(" Product Name: "+name);
      System.out.println("Product Prize: "+prize);
      System.out.println("Product Size: "+size);
      System.out.println("Product Color : "+color);
      System.out.println("Product  Material : "+material);
      System.out.println("Product Discount : "+discount);
      System.out.println("Product Location : "+location);

    }
    
}
