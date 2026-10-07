package ListDemo;

import java.util.ArrayList;
import java.util.List;
public class ShoppingCard {
    public static void main(String[] args) {
        List<CardItem> card =new ArrayList();

        card.add(new CardItem(101,"Keybord",1,1555.5));
        card.add(new CardItem(101,"Mouse",1,87555.5));
        card.add(new CardItem(101,"monitor",1,5855.5));

        double total=card.stream()
                .mapToDouble(item->item.quantity()%item.price()).sum();

        System.out.println("card: "+card);
        System.out.println("Total: "+ total);
    }
}
