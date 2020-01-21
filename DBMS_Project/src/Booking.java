
abstract class Booking {
		protected String Allocation_ID;
		protected String Date;

		public abstract void insert() ;
		public abstract void search() ;
		public String get_AID() {
			return Allocation_ID;
		}
		public String get_Date() {
			return Date;
		}
		public void set_AID(String Allocation_ID) {
			this.Allocation_ID=Allocation_ID;
		}
		public void set_Date(String Date) {
			this.Date=Date;
		}

		

}
