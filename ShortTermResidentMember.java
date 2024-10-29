/**
 * This class represents a short-term resident member of a residential
 * community who can sign out entertainment items.
 * Inherits from the ResidentMember class.
 * 
 * @author Omar Habib ID:3742418
 */
public class ShortTermResidentMember extends ResidentMember {
    /**
     * the date of the residents departure
     */
    private String departureDate;

    /**
     * Constructor for ShortTermResidentMember objects.
     * 
     * @param name          The name of the member.
     * @param unitNum       The unit number of the member.
     * @param phoneNum      The phone number of the member.
     * @param departureDate The departure date of the member.
     */
    public ShortTermResidentMember(String name, int unitNum, String phoneNum, String departureDate) {
        super(name, unitNum, phoneNum);
        this.departureDate = departureDate;
    }

    /**
     * 
     * Getter for the departure date of the member.
     * 
     * @return The departure date of the member.
     */
    public String getDepartureDate() {
        return departureDate;
    }

    /**
     * 
     * Signs out an entertainment item if it was not donated
     * by a benefactor.
     * 
     * @param item The entertainment item to be signed out.
     * @return true if the item was signed out, false otherwise.
     */
    public boolean signOut(EntertainmentItem item) {
        if (!item.getBenefactorDonated()) {
            return super.signOut(item);
        }
        return false;
    }
}
