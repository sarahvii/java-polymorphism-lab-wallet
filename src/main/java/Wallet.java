import java.lang.reflect.Array;
import java.util.ArrayList;

public class Wallet{

    public String owner;
    private ArrayList<IChargeable> items;

    public Wallet(String owner) {
        this.owner = owner;
        this.items = new ArrayList<IChargeable>();
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
}
