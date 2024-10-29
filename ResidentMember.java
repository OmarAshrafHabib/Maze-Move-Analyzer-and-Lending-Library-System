/**
 * This class represents a resident member of an entertainment complex
 * 
 * @author Omar Habib ID:3742418
 */
public class ResidentMember {
    /**
     * the member's name
     */
    private String name;
    /**
     * the unit number
     */
    private int unitNum;
    /**
     * the phone number
     */
    private String phoneNum;
    /**
     * their membership number
     */
    private int membershipNumber;
    /**
     * the starting point of the membership number which is 500000
     */
    private int offset;
    /**
     * a counter for the memberships
     */
    private static int counter = 0;
    /**
     * an array of entertainment items signed out by the member
     */
    private EntertainmentItem[] entertainmentItems;
    /**
     * the number of entertainment items signed out by the member
     */
    private int entertainmentItemsCount;

    /**
     * Creates a new resident member with the given name, unit number, and phone
     * number.
     * Sets the member's unique membership number using a static counter and an
     * offset value. Initializes the member's list of signed out items as an array
     * of size 7.
     * 
     * @param name     a String representing the member's name
     * 
     * @param unitNum  an int representing the member's unit number
     * 
     * @param phoneNum a String representing the member's phone number
     */
    public ResidentMember(String name, int unitNum, String phoneNum) {
        this.name = name;
        this.unitNum = unitNum;
        this.phoneNum = phoneNum;

        offset = 500000;
        membershipNumber = offset + counter;
        counter++;

        entertainmentItems = new EntertainmentItem[7];
        entertainmentItemsCount = 0;
    }

    /**
     * Returns the member's name.
     * 
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the member's unit number.
     * 
     * @return unitNum
     */
    public int getUnitNumber() {
        return unitNum;
    }

    /**
     * Returns the member's phone number.
     * 
     * @return phoneNum
     */
    public String getPhoneNumber() {
        return phoneNum;
    }

    /**
     * Returns the member's unique membership number.
     * 
     * @return membershipNumber
     */
    public int getMembershipNumber() {
        return membershipNumber;
    }

    /**
     * Returns the array of entertainment items signed out by the member.
     * 
     * @return entertainmentItems
     */
    public EntertainmentItem[] getEntertainmentItems() {
        return entertainmentItems;
    }

    /**
     * Sets the member's phone number to the given value.
     * 
     * @param phoneNum a String representing the member's new phone number
     */
    public void setPhoneNumber(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    /**
     * 
     * Returns an array of currently signed out entertainment items.
     * The length of the array is equal to the number of signed out items.
     * 
     * @return an array of currently signed out entertainment items
     */
    public EntertainmentItem[] getSignedOutItems() {
        EntertainmentItem[] item = new EntertainmentItem[entertainmentItemsCount];
        for (int i = 0; i < item.length; i++) {
            item[i] = entertainmentItems[i];
        }
        return item;
    }

    /**
     * 
     * Signs out an entertainment item for the resident member.
     * 
     * @param item the entertainment item to be signed out
     * @return true if the item is successfully signed out, false otherwise
     */
    public boolean signOut(EntertainmentItem item) {
        boolean success = false;
        if (entertainmentItemsCount < entertainmentItems.length) {
            entertainmentItems[entertainmentItemsCount] = item;
            entertainmentItemsCount++;
            success = true;
        } else {
            success = false;

        }
        return success;
    }

    /**
     * 
     * Returns an item that was previously signed out.
     * 
     * @param item The item to be returned
     * @return true if the item was successfully returned, false otherwise
     */
    public boolean returnItem(EntertainmentItem item) {
        boolean success = false;
        for (int i = 0; i < entertainmentItemsCount && !success; i++) {
            if (entertainmentItems[i] == item) {
                for (int j = i; j < entertainmentItemsCount - 1; j++) {
                    entertainmentItems[j] = entertainmentItems[j + 1];
                }
                entertainmentItemsCount--;
                entertainmentItems[entertainmentItemsCount] = null;
                success = true;
                return success;

            }
        }
        return success;
    }
}
