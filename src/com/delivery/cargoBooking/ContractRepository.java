package com.delivery.cargoBooking;

import java.util.HashMap;
import java.util.Map;

public class ContractRepository {

	private static Map<Long, Contract> contracts = new HashMap<Long, Contract>();

	public void save(Contract contract) {

		contracts.put(contract.getContractNo(), contract);
	}

	public Contract find(Long contractNo) {
		return contracts.get(contractNo);
	}

}
