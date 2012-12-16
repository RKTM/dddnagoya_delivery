package com.delivery.transport;

import java.util.HashMap;
import java.util.Map;

public class CargoRepository {

	private final Map<Long, Cargo> store = new HashMap<Long, Cargo>();
	
	public void addCargo(Cargo cargo) {
		store.put(cargo.getId(), cargo);
	}
	
	public Cargo findById(long id) {
		return store.get(id);
	}
}
