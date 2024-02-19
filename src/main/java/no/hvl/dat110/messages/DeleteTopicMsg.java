package no.hvl.dat110.messages;

public class DeleteTopicMsg extends Message {
private String topic;
	// message sent from client to create topic on the broker

    public DeleteTopicMsg(String user, String topic) {
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