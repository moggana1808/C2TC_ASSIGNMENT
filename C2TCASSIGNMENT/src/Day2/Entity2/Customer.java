package Day2.Entity2;

public class Customer {


		// TODO Auto-generated method stub
        private int cid;
        private String cname;
        private String city;
        public int getcid() {
        	return cid;
	}
		public int getCid() {
			return cid;
		}
		public void setCid(int cid) {
			this.cid = cid;
		}
		public String getCname() {
			return cname;
		}
		public void setCname(String cname) {
			this.cname = cname;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		@Override
		public String toString() {
			return "Customer [cid=" + cid + ", cname=" + cname + ", city=" + city + "]";
		}

}
