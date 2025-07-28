1.  Define `Ticket` class with attributes (ID, name, origin, destination, fare) and a `displayTicketInfo()` method.
2.  Define `ReservationDetails` class extending `Ticket`, adding `seatNumber`, `coachType`, `travelDate`, and a `displayReservationDetails()` method.
3.  Define `OneWayTicket` class extending `ReservationDetails`, adding `isValidForSelectedDateOnly` and a `displayOneWayTicketInfo()` method.
4.  Define `RoundTripTicket` class extending `ReservationDetails`, adding `returnDate` and a `displayRoundTripTicketInfo()` method.
5.  In the `Main_short` class `main` method, get the current `Date`.
6.  Initialize a `Scanner` for user input.
7.  Prompt the user and read all ticket and reservation details: `ticket ID`, `passenger name`, `origin`, `destination`, `fare`, `seat number`, `coach type`, and `return date`.
8.  Prompt user to choose between 1 (One-way) or 2 (Round-trip) and read `choice`.
9.  Use a `switch` statement based on `choice`.
10. If `choice` is 1, create `OneWayTicket` object, print "One Way Ticket Details", and call its display method.
11. If `choice` is 2, create `RoundTripTicket` object, print "Round Trip Ticket Details", and call its display method.
12. If `choice` is anything else, print "Invalid Choice".