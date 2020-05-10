package model;

import java.io.Serializable;
public class SiteEv implements Serializable{

	private int good;
	private int bad;

	public SiteEv() {
		good = 0;
		bad = 0;
	}
	public int getGood() {
		return good;
	}
	public void setGood(int good) {
		this.good = good;
	}

	public int getBad() {
		return bad;
	}
	public void setBad(int bad) {
		this.bad = bad;
	}
}
