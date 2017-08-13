package by.damenikan.tariff.element;

import by.damenikan.tariff.types.MessageType;

public class MessageElement extends BaseElement {
	private MessageType messageType;
	
	public MessageElement(){
		super();
	}

	public MessageElement(MessageType messageType, int price){
		super(price);
		this.messageType = messageType;
	}
	
	public void setMessageType(MessageType messageType){
		this.messageType = messageType;
	}

	public MessageType getMessageType(){
		return this.messageType;
	}
	
	@Override
	public int hashCode() {
		int prime = 31;
		int hash = super.hashCode();
		
		hash = prime * hash + ((messageType == null) ? 0 : messageType.hashCode());
		
		return hash;
	}
}
