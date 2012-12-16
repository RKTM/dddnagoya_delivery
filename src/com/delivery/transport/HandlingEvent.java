package com.delivery.transport;

public class HandlingEvent {

	enum Type {
		ACCEPT,
		DEPARTURE,
		ARRIVAL,
	}
	
	public static HandlingEvent accept(DeliveryCenter first, DeliveryCenter second) {
		
		CarrierMovement carrierMovement = new CarrierMovement(first, second);
		return new HandlingEvent(carrierMovement, Type.ACCEPT);
	}

	private final CarrierMovement carrierMovement;
	
	private final Type eventType;

	public HandlingEvent(CarrierMovement carrierMovement, Type eventType) {
		super();
		this.carrierMovement = carrierMovement;
		this.eventType = eventType;
	}
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append(carrierMovement);
		
		return sb.toString();
	}
}
