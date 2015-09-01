package mysns.sns;

public class Reply {
	// 원본글 id
	private int mid;

	// 답글 시퀀스 id
	private int rid;

	// 답글 작성자
	private String uid;

	// 답글 내용
	private String rmsg;

	// 답글 작성일자
	private String date;

	public int getRid() {
		return rid;
	}

	public void setRid(int rid) {
		this.rid = rid;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getMid() {
		return mid;
	}

	public void setMid(int mid) {
		this.mid = mid;
	}

	public String getRmsg() {
		return rmsg;
	}

	public void setRmsg(String rmsg) {
		this.rmsg = rmsg;
	}

}
