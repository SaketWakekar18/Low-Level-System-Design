public class Main {
    public static void main(String[] args) {
        DisplayBoard displayBoard = new DisplayBoard();
        ParkingLot parkingLot = new ParkingLot();

        parkingLot.addObserver(displayBoard);
        parkingLot.notifyObservers();

    }
}