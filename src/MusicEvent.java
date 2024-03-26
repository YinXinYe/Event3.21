public class MusicEvent {
    
    private boolean merchandiseRequired;
    private double merchandiseCost;
    private double musicConcertEventCost;
    private String eventID;
    private String eventName;
    private String eventLocation;
    private int totalParticipants;
    private int totalEventDays;
    private CalculateEventCostClass calculateEventCostObject;

  
    public MusicEvent(String eventID, String eventName, String eventLocation, String pointOfContact, int totalParticipants, int totalEventDays, double merchandiseCost) {
        
        this.merchandiseCost = merchandiseCost;
        this.eventID = eventID;
        this.eventName = eventName;
        this.eventLocation = eventLocation;
        this.totalParticipants = totalParticipants;
        this.totalEventDays = totalEventDays;
        
        this.calculateEventCostObject = new CalculateEventCostClass();

    }


    public boolean isMerchandiseRequired() {
        return merchandiseRequired;
    }

    public void setMerchandiseRequired(boolean merchandiseRequired) {
        this.merchandiseRequired = merchandiseRequired;
    }

    public double getmerchandiseCost() {
        return merchandiseCost;
    }

    public void setmerchandiseCost(double merchandiseCost) {
        this.merchandiseCost = merchandiseCost;
    }

    public double getMusicConcertEventCost() {
        return musicConcertEventCost;
    }

    public void setMusicConcertEventCost(double musicConcertEventCost) {
        this.musicConcertEventCost = musicConcertEventCost;
    }

    
    public void calculateEventCost() {
         musicConcertEventCost = calculateEventCostObject.calculateEventCost() + (merchandiseCost  *  totalParticipants * totalEventDays);
    }

  
    @Override
    public String toString() {
        return  "\n" + 
                "MusicConcert Event details: " + "\n" +
                "Event ID: " + eventID + "\n" +
                "Event Name: " + eventName + "\n" +
                "Event Location: " + eventLocation + "\n" +    
                "Total Participants: " + totalParticipants + "\n" +
                "Total MusicConcert Cost: " + musicConcertEventCost;
    }
}