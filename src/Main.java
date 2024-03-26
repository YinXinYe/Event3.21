public class Main {
    public static void main(String[] args) throws Exception {
        ConferenceEvent conferenceEvent = new ConferenceEvent("E001", "AI Conference", "Paris", "Peng Tian", 50, 2, 25, 40, 60);
        conferenceEvent.calculateEventCost();
        System.out.println(conferenceEvent.toString());

        MusicEvent musicConcertEvent = new MusicEvent("E001", "AI Conference", "Paris", "Peng Tian", 50, 2, 1000);
        musicConcertEvent.calculateEventCost();
        System.out.println(musicConcertEvent.toString());

        PastEvents pastEvent = new PastEvents("E001", "AI Conference", "Paris", "Peng Tian",50, 2); 
        pastEvent.setPaymentDetails("Pending", true);      
        System.out.println(pastEvent);
    
    }
}