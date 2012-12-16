package com.delivery.transport;

import java.util.ArrayList;
import java.util.List;

public class TransportRecord {

	private final List<HandlingEvent> events = new ArrayList<HandlingEvent>();
	
	public void addEvent(HandlingEvent event) {
		events.add(event);
	}
	
	public List<HandlingEvent> getEvents() {
		return new ArrayList<HandlingEvent>(events);
	}
}
