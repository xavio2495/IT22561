import java.util.*;

class Ticket {
    protected String ticketId;
    protected String passengerName;
    protected String origin;
    protected String destination;
    protected double fare;

    public Ticket(String ticketId, String passengerName, String origin, String destination, double fare) {
        this.ticketId = ticketId;
        this.passengerName = passengerName;
        this.origin = origin;
        this.destination = destination;
        this.fare = fare;
    }

    public void displayTicketInfo() {
        System.out.println("Ticket ID: " + ticketId);
        System.out.println("Passenger Name: " + passengerName);
        System.out.println("Origin: " + origin);
        System.out.println("Destination: " + destination);
        System.out.println("Fare: " + fare);
    }
}

class ReservationDetails extends Ticket {
    protected String seatNumber;
    protected String coachType;
    protected Date travelDate;

    public ReservationDetails(String ticketId, String passengerName, String origin, String destination,
                              double fare, String seatNumber, String coachType, Date travelDate) {
        super(ticketId, passengerName, origin, destination, fare);
        this.seatNumber = seatNumber;
        this.coachType = coachType;
        this.travelDate = travelDate;
    }

    public void displayReservationDetails() {
        displayTicketInfo();
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Coach Type: " + coachType);
        System.out.println("Travel Date: " + travelDate);
    }
}

class OneWayTicket extends ReservationDetails {
    private boolean DateVailidity;

    public OneWayTicket(String ticketId, String passengerName, String origin, String destination,
                        double fare, String seatNumber, String coachType, Date travelDate,
                        boolean isValidForSelectedDateOnly) {
        super(ticketId, passengerName, origin, destination, fare, seatNumber, coachType, travelDate);
        this.DateVailidity = isValidForSelectedDateOnly;
    }

    public void displayOneWayTicketInfo() {
        displayReservationDetails();
        System.out.println("Valid Only for Selected Date: " + (DateVailidity ? "Yes" : "No"));
    }
}

class RoundTripTicket extends ReservationDetails {
    private String returnDate;

    public RoundTripTicket(String ticketId, String passengerName, String origin, String destination,
                           double fare, String seatNumber, String coachType, Date travelDate,
                           String returnDate) {
        super(ticketId, passengerName, origin, destination, fare, seatNumber, coachType, travelDate);
        this.returnDate = returnDate;
    }

    public void displayRoundTripTicketInfo() {
        displayReservationDetails();
        System.out.println("Return Date: " + returnDate);
    }
}

public class Main_short {
    public static void main(String[] args) {
        Date now = new Date();
        Scanner s=new Scanner(System.in);
        
        System.out.print("Enter ticket id: ");
        String ticketId = s.next();
        System.out.print("Enter passenger name: ");
        String passengerName = s.next();
        System.out.print("Enter origin station: ");
        String origin = s.next();
        System.out.print("Enter destination station: ");
        String destination = s.next();
        System.out.print("Enter fare: ");
        double fare = s.nextFloat();
        System.out.print("Enter seat number: ");
        String seatNumber = s.next();
        System.out.print("Enter coach type: ");
        String coachType = s.next();
        System.out.print("Enter return date (YYYY-MM-DD): ");
        String returnDate = s.next();
        System.out.println("Enter Choice 1.Oneway 2.Roundtrip");
        int choice=s.nextInt();
        
        switch(choice)
        {
            case 1 -> {
                OneWayTicket one = new OneWayTicket(ticketId, passengerName, origin, destination, fare, seatNumber, coachType, now, true);
                System.out.println("===== One Way Ticket Details =====");
                one.displayOneWayTicketInfo();
            }

        case 2 -> {
            RoundTripTicket round = new RoundTripTicket(ticketId, passengerName, origin, destination, fare, seatNumber, coachType, now, returnDate);
            System.out.println("===== Round Trip Ticket Details =====");
            round.displayRoundTripTicketInfo();
            }
        
        default -> System.out.println("===== Invalid Choice =====");
        }
        s.close();
    }
}
