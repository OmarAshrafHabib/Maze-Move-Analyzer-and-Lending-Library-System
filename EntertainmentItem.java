/**
 * 
 * This class represents an entertainment item that can be borrowed by a
 * resident member.
 * 
 * It contains information about the item's description, price, and whether it
 * was donated by a benefactor.
 * 
 * @author Omar Habib ID:3742418
 */
public class EntertainmentItem {
    /**
     * the description of the item
     */
    private String discription;
    /**
     * the price of the item
     */
    private double itemPrice;
    /**
     * if it was donated
     */
    private boolean donated;

    /**
     * 
     * Creates a new entertainment item with the given description, price, and
     * donation status.
     * 
     * @param description a String representing the description of the item
     * @param itemPrice   a double representing the price of the item
     * @param donated     a boolean indicating whether the item was donated by a
     *                    benefactor
     */
    public EntertainmentItem(String discription, double itemPrice, boolean donated) {
        this.discription = discription;
        this.itemPrice = itemPrice;
        this.donated = donated;
    }

    /**
     * 
     * Returns the description of the item.
     * 
     * @return discription
     */
    public String getDescription() {
        return discription;
    }

    /**
     * 
     * Returns the price of the item.
     * 
     * @return itemPrice
     */
    public double getPrice() {
        return itemPrice;
    }

    /**
     * 
     * Returns a boolean indicating whether the item was donated by a benefactor.
     * 
     * @return donated
     */
    public boolean getBenefactorDonated() {
        return donated;
    }
}
