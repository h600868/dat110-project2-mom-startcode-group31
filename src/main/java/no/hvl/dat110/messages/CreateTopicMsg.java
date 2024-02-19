package no.hvl.dat110.messages;

public class CreateTopicMsg extends Message {
	
	// message sent from client to create topic on the broker   
    
    private String topic;

    public CreateTopicMsg(String user, String topic) {
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

