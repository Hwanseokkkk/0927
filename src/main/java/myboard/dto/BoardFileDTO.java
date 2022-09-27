package myboard.dto;

import java.io.Serializable;

public class BoardFileDTO implements Serializable {

	public static final long serialVersionUID = 43893429447232984L;

	private int bfid;
	private String bfcfn;
	private String bfsfn;
	private int bfsize;
	private int bfbid;
	private String bfcontenttype;

	public String getBfcontenttype() {
		return bfcontenttype;
	}

	public void setBfcontenttype(String bfcontenttype) {
		this.bfcontenttype = bfcontenttype;
	}

	public BoardFileDTO() {
	}

	public BoardFileDTO(String bfcfn, String bfsfn, int bfsize, int bfbid) {
		this.bfcfn = bfcfn;
		this.bfsfn = bfsfn;
		this.bfsize = bfsize;
		this.bfbid = bfbid;
	}

	public int getBfid() {
		return bfid;
	}

	public void setBfid(int bfid) {
		this.bfid = bfid;
	}

	public String getBfcfn() {
		return bfcfn;
	}

	public void setBfcfn(String bfcfn) {
		this.bfcfn = bfcfn;
	}

	public String getBfsfn() {
		return bfsfn;
	}

	public void setBfsfn(String bfsfn) {
		this.bfsfn = bfsfn;
	}

	public int getBfsize() {
		return bfsize;
	}

	public void setBfsize(int bfsize) {
		this.bfsize = bfsize;
	}

	public int getBfbid() {
		return bfbid;
	}

	public void setBfbid(int bfbid) {
		this.bfbid = bfbid;
	}

	@Override
	public String toString() {
		return "BoardFileDTO [bfid=" + bfid + ", bfcfn=" + bfcfn + ", bfsfn=" + bfsfn + ", bfsize=" + bfsize
				+ ", bfbid=" + bfbid + ", bfcontenttype=" + bfcontenttype + "]";
	}

}
