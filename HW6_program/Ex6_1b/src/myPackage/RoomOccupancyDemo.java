package myPackage;

public class RoomOccupancyDemo {

	public static void main(String[] args) {
		RoomOccupancy room1 = new RoomOccupancy(202,4);
		RoomOccupancy room2 = new RoomOccupancy(102,2);
		RoomOccupancy room3 = new RoomOccupancy(103,0);
		
		System.out.println("total people : " + RoomOccupancy.getToal());
		
		room1.addOneToRoom();
		room1.addOneToRoom();
	
		
		room2.removeOneFromRoom();
		
		room3.removeOneFromRoom();
		room3.addOneToRoom();
		
		System.out.println("total people in room1 : " + room1.getPeopleInRoom());
		System.out.println("total people in room2 : " + room2.getPeopleInRoom());
		System.out.println("total people in room3 : " + room3.getPeopleInRoom());
		System.out.println("total people : " + RoomOccupancy.getToal());
		
	}

}
