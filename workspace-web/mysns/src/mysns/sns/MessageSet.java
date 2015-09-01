package mysns.sns;

import java.util.ArrayList;

public class MessageSet {
	// 메시지
	private Message message;

	// 해당 메시지에 대한 댓글 목록
	private ArrayList<Reply> rlist = new ArrayList<Reply>();

	public Message getMessage() {
		return message;
	}

	public void setMessage(Message message) {
		this.message = message;
	}

	public ArrayList<Reply> getRlist() {
		return rlist;
	}

	public void setRlist(ArrayList<Reply> rlist) {
		this.rlist = rlist;
	}
}
