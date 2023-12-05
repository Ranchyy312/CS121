package weekFour.loopsActivities;

import java.util.Scanner;

public class HotelOccupancy {
    public static void main(String [] args){
        Scanner console = new Scanner(System.in);

        System.out.println("Enter number of floors");
        int floors= Integer.parseInt(console.nextLine());

        int rooms = 0;
        int occ =0;
        int totalRooms = 0;
        int totalOcc =0;

        for(int n = 1; n<= floors;n++) {
            System.out.println("Enter number of rooms on floor " + n);
            rooms = Integer.parseInt(console.nextLine());
            totalRooms = rooms+totalRooms;

            System.out.println("How many of the floor's rooms are occupied?");
            occ= Integer.parseInt(console.nextLine());
            totalOcc = occ+totalOcc;
        }

        int totalVacant =(totalRooms - totalOcc);
        double occRate = (double) totalOcc/totalRooms;

        System.out.printf("Total Number of Floors: %d\nTotal Number of Rooms: %d\nTotal Number of Occupied Rooms: %d" +
                "\nTotal Number of Vacant Rooms: %d\n" +
                "Total Occupancy Rate: %.2f",floors,totalRooms,totalOcc, totalVacant, occRate);
    }
}
