package no.hvl.dat110.messages;

import no.hvl.dat110.common.TODO;

public class PublishMsg extends Message {
	
private String topic;
	public PublishMsg(String user, String topic, String message) {

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
	
	public String getMessage() {
		
		throw new UnsupportedOperationException(TODO.method());
	}
}