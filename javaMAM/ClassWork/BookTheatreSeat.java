package ClassWork;

public class BookTheatreSeat {
    int tseat = 10; // Total Seat
    public synchronized void bookSeat(int seat)
    {
        if (seat<tseat) {
            System.out.println("Succesfully booked : " + seat + "Seats");
            tseat=tseat-seat;
            System.out.println("Remaining Seats are : " + tseat);
        }
        else if(seat>tseat){
            System.out.println("seats not available");
        }
    }
    
}
