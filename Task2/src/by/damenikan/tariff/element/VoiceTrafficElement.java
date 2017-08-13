package by.damenikan.tariff.element;

import by.damenikan.tariff.types.CallType;
import by.damenikan.tariff.types.VoiceBillingType;

public class VoiceTrafficElement extends BaseElement {
	private CallType callType;
	private VoiceBillingType billingType;
	
	public VoiceTrafficElement(){
		super();
	}

	public VoiceTrafficElement(CallType callType, VoiceBillingType billingType, int price){
		super(price);
		this.callType = callType;
		this.billingType = billingType;
	}
	
	public void setCallTylpe(CallType callType){
		this.callType = callType;
	}
	public CallType getCallType(){
		return this.callType;
	}

	public void setVoiceBillingType(VoiceBillingType billingType){
		this.billingType = billingType;
	}
	public VoiceBillingType getVoiceBillingType(){
		return this.billingType;
	}

	@Override
	public int hashCode() {
		int prime = 31;
		int hash = super.hashCode();
		
		hash = prime * hash + ((callType == null) ? 0 : callType.hashCode());
		hash = prime * hash + ((billingType == null) ? 0 : billingType.hashCode());
		
		return hash;
	}
}
