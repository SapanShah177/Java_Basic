
public class Door {

	private Lock lock;

	public Door() {
		lock = new Lock(true);
	}

	public Lock getLock() {
		return lock;
	}

	public void shopstatus() {
		if (lock.isLock()) {
			System.out.println("Shop is closed, Please visit again.");
		} else {
			System.out.println("Welcome to Store.");
		}
	}

	public class Lock {
		private boolean lock;

		public Lock(boolean lock) {
			super();
			this.lock = lock;
		}

		public boolean isLock() {
			return lock;
		}

		public void setLock(boolean lock) {
			this.lock = lock;
		}

	}
}
