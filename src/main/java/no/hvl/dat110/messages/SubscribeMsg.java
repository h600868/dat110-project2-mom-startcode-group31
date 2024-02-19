package no.hvl.dat110.messages;

public class SubscribeMsg extends Message {

private String topic;
    public SubscribeMsg(String user, String topic) {

		this.topic = topic;
    }
	public String getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}
 public String toString() {
	return "Messagetopic is: " + getTopic() + "from user:" + getUser();
 }
		
}