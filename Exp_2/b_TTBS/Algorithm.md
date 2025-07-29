## Algorithm

1.  Define the **`Ticket` class** with attributes and a `displayTicketInfo()` method.
2.  Define the **`ReservationDetails` class** extending `Ticket`, with additional attributes and a display method.
3.  Define **`OneWayTicket`** and **`RoundTripTicket`** classes, both extending `ReservationDetails` with specific attributes and display methods.
4.  In `Main_short`, get the current date and initialize a `Scanner`.
5.  Prompt the user to **enter all ticket and reservation details**.
6.  Prompt the user to **choose between one-way or round-trip**.
7.  Use a **`switch` statement** to handle the user's choice.
8.  Create either a **`OneWayTicket` or `RoundTripTicket` object** based on the choice.
9.  **Display the details** of the created ticket object.
10. Handle **invalid choices**.

## Program Output
```
Enter ticket id: 70302610
Enter passenger name: Immanuel
Enter origin station: MAS
Enter destination station: TPJ
Enter fare: 980
Enter seat number: 3A
Enter coach type: 1
Enter return date (YYYY-MM-DD): 2025-08-14
Enter Choice 1.Oneway 2.Roundtrip
1
===== One Way Ticket Details =====
Ticket ID: 70302610
Passenger Name: Immanuel
Origin: MAS
Destination: TPJ
Fare: 980.0
Seat Number: 3A
Coach Type: 1
Travel Date: Wed Jul 30 02:26:09 IST 2025
Valid Only for Selected Date: Yes
```