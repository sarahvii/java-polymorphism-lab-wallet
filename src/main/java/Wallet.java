import java.lang.reflect.Array;
import java.util.ArrayList;

public class Wallet{

    public String owner;
    private ArrayList<IChargeable> items;
    private IChargeable selectedCard;

    public Wallet(String owner) {
        this.owner = owner;
        this.items = new ArrayList<IChargeable>();
        this.selectedCard = null;
    }

    public String getOwner() {
        return this.owner;
    }

    public int getNumberOfItems() {
        return this.items.size();
    }

    public void addItem(IChargeable item) {
        this.items.add(item);
    }

    public IChargeable getSelectedCard() {
        return selectedCard;
    }

    public void setSelectedCard(IChargeable item) {
        if (items.contains(item)) {
            this.selectedCard = item;
        }
    }

    public void payWithSelectedCard(double purchaseAmount) {
        if (this.selectedCard == null) {
            System.out.println("No card selected");
            return;
        }
        this.selectedCard.charge(purchaseAmount);
     }
}
