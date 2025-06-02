package duke.choice;

import io.helidon.webserver.Routing;
import io.helidon.webserver.ServerConfiguration;
import io.helidon.webserver.WebServer;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ShopApp {
    public static Logger logger = Logger.getLogger(ShopApp.class.getName());

    public static void main(String[] args) {

        System.out.println("Welcome to Duke Choice Shop");
        Customer c1 = new Customer("Pinky",3);

//        System.out.println("Minimum price: " + TAX_RATE);

        Clothing item1 = new Clothing("Blue Jacket",20.9,"M");
        Clothing item2 = new Clothing("Orange T-Shirt",10.5,"S");

        Clothing[] items = {item1, item2,
                new Clothing("Green Scarf",5.0,"S"),
                new Clothing("Blue T-Shirt",10.5,"S")
        };

        c1.addItems(items);

        try {
            ItemList list = new ItemList(items);
            Routing routing = Routing.builder()
                    .get("/items", list)
                    .build();

            ServerConfiguration config = ServerConfiguration.builder()
                    .bindAddress(InetAddress.getLocalHost())
                    .port(8888).build();

            WebServer ws = WebServer.create(config, routing);
            ws.start();
        } catch (UnknownHostException ex) {
            logger.log(Level.INFO, ex.getMessage(), ex);
        }

//        System.out.println("Customer is " + c1.getName() + "," + c1.getSize() + "," + c1.getTotalClothingCost());
//        for(Clothing item : c1.getItems()) {
//            System.out.println("Item output " + item);
//        }

        int average = 0;
        int count = 0;

        for(Clothing item : c1.getItems()) {
            if(item.getSize().equals("L")) {
                count++;
                average += (int) item.getPrice();
            }
        }

        try {
            average = (count == 0) ? 0 : (average / count);
            average = average / count;
//            System.out.println("Average price: " + average + ", Count: " + count);
        } catch (ArithmeticException e) {
//            System.out.println("Don't divide by zero");
        }

        Arrays.sort(c1.getItems());
//        for(Clothing item : c1.getItems()) {
//            System.out.println("Item output " + item);
//        }
    }
}