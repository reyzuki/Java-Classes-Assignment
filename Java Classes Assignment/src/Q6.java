
public class Q6 {
	static class Room{
		private int roomNo;
		 private String roomType;
		  private Double roomArea;
		  private Boolean acMachine;
		  
		  public void setData( int rmno, String rmtype, Double rmarea, Boolean acmac)
		{
		  roomNo = rmno;
		  roomType = rmtype;
		  roomArea = rmarea;
		  acMachine = acmac;
		}
		 public void displayData()
		 {
		   System.out.println("Room number: " + roomNo);
		   System.out.println("Room type: " + roomType);
		   System.out.println("Room has an area of: " + roomArea);
		   System.out.println("Has AC machine: " + acMachine);
		 }
	}

	public static void main(String[] args) {
		Room firstroom = new Room();
		   firstroom.setData(1, "Detached", 320.0, true);
		   firstroom.displayData();

	}

}
