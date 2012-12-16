package com.delivery.transport;

import java.util.List;

public class CargoFactory {

	public Cargo create(long id, List<DeliveryCenter> deliveryCenters) {
		
		Cargo newCargo = new Cargo(id);
		
		for (DeliveryCenter dc : deliveryCenters) {			
			newCargo.addDeliveryCenter(dc);
		}
		
		// �ȉ��͕K�v�H�s�v�H
		DeliveryCenter first = deliveryCenters.get(0);
		DeliveryCenter second = deliveryCenters.get(1);
		
		HandlingEvent from = HandlingEvent.accept(first, second);
		newCargo.addHandlingEvent(from);
		
		return newCargo;
	}
}
