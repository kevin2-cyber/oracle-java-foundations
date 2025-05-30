package duke.choice;

public class Customer {
   private String name;
   private String size;
   private Clothing[] items;

    public Customer(String name, int measurement) {
        this.name = name;
        setSize(measurement);
    }

    public void addItems(Clothing[] newItems) {
       items = newItems;
   }

   public Clothing[] getItems() {
       return items;
   }

   public double getTotalClothingCost()  {
       double total = 0;
       for (Clothing item : items) {
           total = total + item.getPrice();
       }
       return total;
   }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setSize(int measurement) {
        switch (measurement) {
            case 1, 2, 3 :
                setSize("S");
                break;
            case 4,5,6:
                setSize("M");
                break;
            case 7,8,9:
                setSize("L");
                break;
            default:
                setSize("X");
        }
    }
}
