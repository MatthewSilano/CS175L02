package CS175L;

public class RoachPopulation {
		
		
		private int roaches;
		
		public int getroaches() {
			return roaches;
		}
		
		
		public void breed() {
			roaches = roaches*2;
		}
		
		
		public void spray(int percent) {
			roaches = roaches - (roaches*percent)/(100);
		}
		
		public void setroaches(int set) {
			roaches = set;
		}
		
		
	}


