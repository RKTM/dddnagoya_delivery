package com.delivery.transport;

import java.util.ArrayList;
import java.util.List;

public class TransportSpec {

	private final List<DeliveryCenter> deliveryCenters = new ArrayList<DeliveryCenter>();
	
	public void addDeliveryCenter(DeliveryCenter dc) {
		deliveryCenters.add(dc);
	}
	
	public List<DeliveryCenter> getDeliveryCenters() {
		return new ArrayList<DeliveryCenter>(deliveryCenters);
	}
}
