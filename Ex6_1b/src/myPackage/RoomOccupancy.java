package myPackage;

public class RoomOccupancy {
	private int roomNumber;
	private int peopleInRoom;
	private static int totalNumber=0;
	
	public RoomOccupancy(int roomNumber, int peopleInRoom){
		this.roomNumber=roomNumber;
		this.peopleInRoom=peopleInRoom;
		totalNumber+=peopleInRoom;
	}
	

	public void addOneToRoom(){
		peopleInRoom++;
		totalNumber++;
	}
	
	public void removeOneFromRoom(){
		if(peopleInRoom<=0)
			return ;
		peopleInRoom--;
		totalNumber--;
	}	
	
	public int getNumber(){
		return roomNumber;
	}
	
	public int getPeopleInRoom(){
		return peopleInRoom;
	}
	
	static public int getToal(){
		return totalNumber;
	}
}
