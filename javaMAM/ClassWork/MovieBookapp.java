package ClassWork;

public class MovieBookapp extends Thread {
    static BookTheatreSeat b;
    int seat;

    public MovieBookapp(int seat) {
        this.seat = seat;
    }

    public void run() {
        b.bookSeat(seat);
    }

    public static void main(String[] args) {
        b = new BookTheatreSeat();
        MovieBookapp Chaitanya = new MovieBookapp(4);
        MovieBookapp Arjun = new MovieBookapp(5);
        Chaitanya.start();
        Arjun.start();
    }

}
