import java.util.ArrayList;

public class Suitcase {
    private int maxWeight;
    private ArrayList<Item> items;

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        if (totalWeight() + item.getWeight() <= maxWeight) {
            items.add(item);
        }
    }

    public void printItems() {
        for (Item item : items) {
            System.out.println(item);
        }
    }

    public int totalWeight() {
        return items.stream().mapToInt(Item::getWeight).sum();
    }

    public Item heaviestItem() {
        if (items.isEmpty()) {
            return null;
        }

        Item heaviest = items.get(0);
        for (Item item : items) {
            if (item.getWeight() > heaviest.getWeight()) {
                heaviest = item;
            }
        }
        return heaviest;
    }

    @Override
    public String toString() {
        int itemCount = items.size();
        String itemWord = itemCount == 1 ? "item" : "items";
        return (itemCount == 0 ? "no" : itemCount) + " " + itemWord + " (" + totalWeight() + " kg)";
    }
}
