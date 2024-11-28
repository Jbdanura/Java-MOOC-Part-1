/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jotabe
 */
import java.util.ArrayList;

public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> suitcases;

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.suitcases = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase) {
        if (totalWeight() + suitcase.totalWeight() <= maxWeight) {
            suitcases.add(suitcase);
        }
    }

    public void printItems() {
        for (Suitcase suitcase : suitcases) {
            suitcase.printItems();
        }
    }

    private int totalWeight() {
        return suitcases.stream().mapToInt(Suitcase::totalWeight).sum();
    }

    @Override
    public String toString() {
        int suitcaseCount = suitcases.size();
        String suitcaseWord = suitcaseCount == 1 ? "suitcase" : "suitcases";
        return suitcaseCount + " " + suitcaseWord + " (" + totalWeight() + " kg)";
    }
}
