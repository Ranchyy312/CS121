package weekThirteen.LinkedList;

public class Main {
    public static void main(String[] args) {
        ResturantUser one = new ResturantUser();
        ResturantUser two = new ResturantUser();
        one.addTableReservation("5:00PM 11/20/23");
        one.addTableReservation("7:00PM 11/20/23");
        one.addTableReservation("6:30PM 11/23/23");
        one.addTableReservation("6:45PM 11/25/23");

        System.out.println(one.getUserInfo());
        one.displayUserBooking();
        one.removeTableReservation(2);
        System.out.println(" ");
        one.displayUserBooking();
    }
}
