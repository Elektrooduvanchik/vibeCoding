public class Message {
	private static long all_id = 0;
	private long id = 1;
	private final String from;
	private final String to;
	private String soobshcheniye;

	public Message(String from, String to, String text) {
		all_id++;
		this.id = all_id;
		this.from = from;
		this.to = to;
		this.soobshcheniye = text;
	}


	public void setSoobshcheniye(String text) {
		this.soobshcheniye = text;
	}

	public String getSoobshcheniye() {
		return soobshcheniye;
	}

	public long getId() {
		return id;
	}

	public String getFrom() {
		return from;
	}

	public String getTo() {
		return to;
	}
}