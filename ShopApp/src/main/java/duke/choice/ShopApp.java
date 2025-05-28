package duke.choice;

public class ShopApp {
    public static void main(String[] args) {
        double tax = 0.2, total = 0.0;

        System.out.println("Welcome to Duke Choice Shop");
        Customer c1 = new Customer();
        c1.setName("Pinky");
        c1.setSize("S");
        System.out.println("Customer is " + c1.getName());

        Clothing item1 = new Clothing();
        Clothing item2 = new Clothing();

        Clothing[] items = {item1, item2, new Clothing(), new Clothing()};

        item1.setDescription("Blue Jacket");
        item1.setPrice(20.9);
        item1.setSize("M");

        item2.setDescription("Orange T-Shirt");
        item2.setPrice(10.5);
        item2.setSize("S");

        items[2].setDescription("Green Scarf");
        items[2].setPrice(5.0);
        items[2].setSize("S");

        items[3].setDescription("Blue T-Shirt");
        items[3].setPrice(10.5);
        items[3].setSize("S");

//        total = (item1.price + (item2.price * 2)) * (1 + tax);

        int measurement = 3;

        switch (measurement) {
            case 1, 2, 3 :
                c1.setSize("S");
                break;
            case 4,5,6:
                c1.setSize("M");
                break;
            case 7,8,9:
                c1.setSize("L");
                break;
            default:
                c1.setSize("X");
        }

        for(Clothing item : items) {
            if (c1.getSize().equals(item.getSize())) {
                total = total + item.getPrice();
                System.out.println("Item " + item.getDescription() + " , " + item.getPrice() + " , "+ item.getSize());
                total = total + total * tax;
                if (total > 15)
                    break;
            }
        }
        System.out.println("Total is " + total);
    }
}