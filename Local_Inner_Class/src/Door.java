
public class Door {

	public boolean islocked(String key) {

		class Lock {
			public boolean isLocked(String key) {
				if (key.equals("open")) {
					return false;
				} else {
					return true;
				}
			}
		}
		return new Lock().isLocked(key);
	}
}
