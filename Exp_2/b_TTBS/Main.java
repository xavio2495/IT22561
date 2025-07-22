import java.util.Scanner;

//Class Ticket with basic ticket information
class Ticket {
    protected String ticketId;
    protected String passengerName;
    protected String origin;
    protected String destination;
    protected double fare;
    
    // Constructor
    public Ticket(String ticketId, String passengerName, String origin, String destination, double fare) {
        this.ticketId = ticketId;
        this.passengerName = passengerName;
        this.origin = origin;
        this.destination = destination;
        this.fare = fare;
    }
    
    // Method to display ticket information
    public void displayTicketInfo() {
        System.out.println("==================== TICKET INFORMATION ====================");
        System.out.println("Ticket ID: " + ticketId);
        System.out.println("Passenger Name: " + passengerName);
        System.out.println("Origin: " + origin);
        System.out.println("Destination: " + destination);
        System.out.println("Fare: $" + fare);
    }
}

// Derived class ReservationDetails
class ReservationDetails extends Ticket {
    protected String seatNumber;
    protected String coachType;
    protected String travelDate;
    
    // Constructor
    public ReservationDetails(String ticketId, String passengerName, String origin, 
                            String destination, double fare, String seatNumber, 
                            String coachType, String travelDate) {
        super(ticketId, passengerName, origin, destination, fare);
        this.seatNumber = seatNumber;
        this.coachType = coachType;
        this.travelDate = travelDate;
    }
    
    // Method to display reservation details
    public void displayReservationDetails() {
        displayTicketInfo();
        System.out.println("================== RESERVATION DETAILS ==================");
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Coach Type: " + coachType);
        System.out.println("Travel Date: " + travelDate);
    }
}
class OneWayTicket extends ReservationDetails {
    private boolean validForSelectedDateOnly;
    
    // Constructor
    public OneWayTicket(String ticketId, String passengerName, String origin, 
                       String destination, double fare, String seatNumber, 
                       String coachType, String travelDate, boolean validForSelectedDateOnly) {
        super(ticketId, passengerName, origin, destination, fare, seatNumber, coachType, travelDate);
        this.validForSelectedDateOnly = validForSelectedDateOnly;
    }
    
    // Method to display one-way ticket information
    public void displayOneWayTicketInfo() {
        displayReservationDetails();
        System.out.println("================== ONE-WAY TICKET INFO ==================");
        System.out.println("Ticket Type: One-Way");
        System.out.println("Valid for selected date only: " + (validForSelectedDateOnly ? "Yes" : "No"));
        System.out.println("========================================================");
    }
}

// Subclass RoundTripTicket
class RoundTripTicket extends ReservationDetails {
    private String returnDate;
    
    // Constructor
    public RoundTripTicket(String ticketId, String passengerName, String origin, 
                          String destination, double fare, String seatNumber, 
                          String coachType, String travelDate, String returnDate) {
        super(ticketId, passengerName, origin, destination, fare, seatNumber, coachType, travelDate);
        this.returnDate = returnDate;
    }
    
    // Method to display round-trip ticket information
    public void displayRoundTripTicketInfo() {
        displayReservationDetails();
        System.out.println("================= ROUND-TRIP TICKET INFO =================");
        System.out.println("Ticket Type: Round-Trip");
        System.out.println("Return Date: " + returnDate);
        System.out.println("========================================================");
    }
}

// Main class to demonstrate the Train Ticket Booking System
public class Main {
    
    // Method to generate ticket ID
    private static String generateTicketId() {
        return "TK" + String.format("%03d", (int)(Math.random() * 1000));
    }
    
    // Method to calculate fare based on distance and class
    private static double calculateFare(String origin, String destination, String coachType) {
        // Simple fare calculation based on route and class
        double baseFare = 50.0;
        
        // Distance multiplier (simplified)
        double distance = Math.abs(origin.hashCode() - destination.hashCode()) % 10 + 1;
        
        // Class multiplier
        double classMultiplier = 1.0;
        switch (coachType.toLowerCase()) {
            case "economy" -> classMultiplier = 1.0;
            case "business" -> classMultiplier = 1.5;
            case "first class" -> classMultiplier = 2.0;
        }
        
        return baseFare * distance * classMultiplier;
    }
    
    // Method to generate seat number
    private static String generateSeatNumber(String coachType) {
        char section = (char)('A' + (int)(Math.random() * 4));
        int number = (int)(Math.random() * 50) + 1;
        return section + String.valueOf(number);
    }
    
    // Method to get user input for ticket booking
    private static void bookTicket(Scanner scanner) {
        System.out.println("\n" + "=".repeat(50));
        System.out.println("          TRAIN TICKET BOOKING");
        System.out.println("=".repeat(50));
        
        // Get passenger details
        System.out.print("Enter passenger name: ");
        String passengerName = scanner.nextLine();
        
        System.out.print("Enter origin station: ");
        String origin = scanner.nextLine();
        
        System.out.print("Enter destination station: ");
        String destination = scanner.nextLine();
        
        // Get coach type
        System.out.println("\nAvailable coach types:");
        System.out.println("1. Economy");
        System.out.println("2. Business");
        System.out.println("3. First Class");
        System.out.print("Select coach type (1-3): ");
        int coachChoice = scanner.nextInt();
        scanner.nextLine(); // consume newline
        
        String coachType = "";
        switch (coachChoice) {
            case 1 -> coachType = "Economy";
            case 2 -> coachType = "Business";
            case 3 -> coachType = "First Class";
            default -> {
                coachType = "Economy";
                System.out.println("Invalid choice. Defaulting to Economy.");
            }
        }
        
        // Get travel date
        System.out.print("Enter travel date (YYYY-MM-DD): ");
        String travelDate = scanner.nextLine();
        
        // Get ticket type
        System.out.println("\nTicket Types:");
        System.out.println("1. One-Way");
        System.out.println("2. Round-Trip");
        System.out.print("Select ticket type (1-2): ");
        int ticketChoice = scanner.nextInt();
        scanner.nextLine(); // consume newline
        
        // Generate ticket details
        String ticketId = generateTicketId();
        String seatNumber = generateSeatNumber(coachType);
        double fare = calculateFare(origin, destination, coachType);
        
        System.out.println("\n" + "=".repeat(50));
        System.out.println("          PROCESSING BOOKING...");
        System.out.println("=".repeat(50));
        
        switch (ticketChoice) {
            case 1 -> {
                // One-Way Ticket
                OneWayTicket oneWayTicket = new OneWayTicket(
                        ticketId, passengerName, origin, destination, fare,
                        seatNumber, coachType, travelDate, true
                );  System.out.println("\n✓ ONE-WAY TICKET BOOKED SUCCESSFULLY!");
                oneWayTicket.displayOneWayTicketInfo();
            }
            case 2 -> {
                // Round-Trip Ticket
                System.out.print("Enter return date (YYYY-MM-DD): ");
                String returnDate = scanner.nextLine();
                // Round-trip fare is typically discounted
                fare = fare * 1.8; // 10% discount for round-trip
                RoundTripTicket roundTripTicket = new RoundTripTicket(
                        ticketId, passengerName, origin, destination, fare,
                        seatNumber, coachType, travelDate, returnDate
                );  System.out.println("\n✓ ROUND-TRIP TICKET BOOKED SUCCESSFULLY!");
                roundTripTicket.displayRoundTripTicketInfo();
            }
            default -> {
                System.out.println("Invalid ticket type selection!");
                return;
            }
        }
        
        System.out.println("\nThank you for booking with us!");
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=".repeat(60));
        System.out.println("      WELCOME TO TRAIN TICKET BOOKING SYSTEM");
        System.out.println("=".repeat(60));
        
        boolean continueBooking = true;
        int totalBookings = 0;
        
        while (continueBooking) {
            bookTicket(scanner);
            totalBookings++;
            
            System.out.println("\n" + "=".repeat(50));
            System.out.print("Do you want to book another ticket? (y/n): ");
            String choice = scanner.nextLine();
            
            if (!choice.equalsIgnoreCase("y")) {
                continueBooking = false;
            }
        }
        
        // Display final summary
        System.out.println("\n" + "=".repeat(60));
        System.out.println("              BOOKING SESSION SUMMARY");
        System.out.println("=".repeat(60));
        System.out.println("Total bookings processed: " + totalBookings);
        System.out.println("Thank you for using our Train Ticket Booking System!");
        System.out.println("=".repeat(60));
        scanner.close();
    }
}