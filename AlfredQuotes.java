import java.util.Date;
public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    



    // public String guestGreeting(String name) {
    public String guestGreeting(String name, String dayPeriod) {
        return String.format("Good %s, %s.", dayPeriod, name);
    }
    //     return "place holder for guest greeting return string";
    // }
    




    // public String dateAnnouncement() {
    public String dateAnnouncement() {
        return String.format("It is currently %s", new Date());
    }
    //     return "place holder for date announcement return string";
    // }
    





    // public String respondBeforeAlexis(String conversation) {
    public String respondBeforeAlexis(String phrase) {

        if(phrase.indexOf("Alexis") > -1) {
            return "Alexis! Play some low-fi beats.";
        }

        if (phrase.indexOf("Alfred") > -1) {
            return "I can't find my yo-yo. Maybe Alfred will know where it is.";
        }

        return "Maybe that's what Batman is about. Not winning. But failing..";
    }
    //     return "for snarky response return string";
    // }
    

}