
public class Shop {

	public static void main(String[] args) {
		
		Door door = new Door();
		door.shopstatus();
		
		door.getLock().setLock(false);
		door.shopstatus();

	}
}
