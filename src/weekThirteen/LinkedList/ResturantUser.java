package weekThirteen.LinkedList;

import java.util.LinkedList;

public class ResturantUser {
    String UserName;
    String reservationDate;
    Integer numberOfGuests;
    Integer tableNumber;
    String menuSelection;
    Integer orderNumber;
    LinkedList<String> tableList = new LinkedList<>();

    public void addTableReservation(String reservationDate){
        tableList.add(reservationDate);
    }

    public void removeTableReservation(int tableNumber){
        tableList.remove(tableNumber);
    }

    public String getUserInfo(){
        UserName = "Bob";
        return UserName;
    }

    public void displayUserBooking(){
        for(int i = 0; i <= tableList.size()-1;i++){
            System.out.println("Table number: "+(i+1)+" "+"Reservation: "+tableList.get(i));
        }
    }



}
