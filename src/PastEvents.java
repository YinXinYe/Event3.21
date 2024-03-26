public class PastEvents{
    
    public static final double pastEventCost = 10000.00;
    public static final double tax = 0.3; 

    private String eventID;
    private String eventName;
    private String eventLocation;
    private int totalParticipants;
    private int totalEventDays;
    private String paymentStatus;
    private boolean requiresExtension;
    private String paymentDetails;
    

    public PastEvents(String eventID, String eventName, String eventLocation, String pointOfContact,int totalParticipants, int totalEventDays) {
        this.eventID = eventID;
        this.eventName = eventName;
        this.eventLocation = eventLocation;
        this.totalParticipants = totalParticipants;
        this.totalEventDays = totalEventDays;
    }



    public String getPaymentStatus() {
        return paymentStatus;
    }

    public boolean getRequiresExtension() {
        return requiresExtension;
    }

    public String getPaymentDetails() {
        return paymentDetails;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public void setRequiresExtension(boolean requiresExtension) {
        this.requiresExtension = requiresExtension;
    }

    public void setPaymentDetails(String paymentStatus, boolean requiresExtension) {
        this.paymentDetails = "The event cost was " + pastEventCost + " and the payment is " + paymentStatus + 
        "\n" + "The Customer requires extension?:" + requiresExtension;
    }

    
    private void calculateCost() {
        double cost = 1000 + (1000 * tax);
    }

    @Override
    public String toString() {
        return "\n" + 
         "They past event details: " + "\n" +  
         "Event ID: " + eventID + "\n"  + 
         "Event Name: " + eventName + "\n" + 
         "Event Location: " + eventLocation + "\n" + 
         "Total Participants: " + totalParticipants + "\n" +
        "The payment details are as follows: " + "\n" + 
        paymentDetails;
    }
}

