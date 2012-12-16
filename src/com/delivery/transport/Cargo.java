package com.delivery.transport;

public class Cargo {

	private final long id;
	
	private final TransportSpec spec = new TransportSpec();
	
	private final TransportRecord record = new TransportRecord();

	public Cargo(long id) {
		super();
		this.id = id;
	}
	
	public long getId() {
		return id;
	}

	void addHandlingEvent(HandlingEvent event) {
		record.addEvent(event);
	}
	
	void addDeliveryCenter(DeliveryCenter dc) {
		spec.addDeliveryCenter(dc);
	}
	
	public TransportRecord getRecord() {
		return record;
	}
	
	public TransportSpec getSpec() {
		return spec;
	}
}
