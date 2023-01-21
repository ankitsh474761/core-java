class BookTheatreSeat{
    int totalseats = 10;
    synchronized void bookSeat(int seats){
        if(totalseats  >= seats){
            System.out.println("seats booked successfully");
            totalseats = totalseats - seats;
            System.out.println("seats left"+ totalseats);
        }else {
            System.out.println("seats cannot be booked");
            System.out.println("seat left "+ totalseats);
        }
    }
}

public class synchronizedmeth extends Thread {
    static BookTheatreSeat b;
    int seats;
    public void run(){
        b.bookSeat(seats);
    }

    public static void main(String[] args) {
        b = new BookTheatreSeat();
        synchronizedmeth anshi = new synchronizedmeth();
        anshi.seats = 7;
        anshi.start();

        synchronizedmeth anki = new synchronizedmeth();
        anki.seats = 6;
        anki.start();
    }
}
