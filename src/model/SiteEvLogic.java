package model;

public class SiteEvLogic {
	public void good(SiteEv site) {
		int count = site.getGood();
		site.setGood(count +1);
	}
	public void bad(SiteEv site) {
		int count = site.getBad();
		site.setBad(count +1);
	}

}
