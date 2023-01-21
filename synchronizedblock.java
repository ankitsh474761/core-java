class BookTheatreSeat1{
    int totalseats = 10;
    void bookSeat(int seats) {
        synchronized (this) {
            if (totalseats >= seats) {
                System.out.println("seats booked successfully");
                totalseats = totalseats - seats;
                System.out.println("seats left " + totalseats);
            } else {
                System.out.println("seats cannot be booked");
                System.out.println("seat left " + totalseats);
            }
        }
    }
}
public class synchronizedblock extends Thread {
    static BookTheatreSeat1 b;
    int seats;
    public void run(){
        b.bookSeat(seats);
    }

    public static void main(String[] args) {
        b = new BookTheatreSeat1();
        synchronizedblock anshi = new synchronizedblock();
        anshi.seats = 7;
        anshi.start();

        synchronizedblock anki = new synchronizedblock();
        anki.seats = 6;
        anki.start();
    }
}

