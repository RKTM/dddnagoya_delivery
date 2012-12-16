package com.delivery.application;

import java.util.ArrayList;
import java.util.List;

import com.delivery.cargoBooking.Constants.Size;
import com.delivery.cargoBooking.Contract;
import com.delivery.cargoBooking.ContractFactory;
import com.delivery.cargoBooking.ContractRepository;
import com.delivery.transport.Cargo;
import com.delivery.transport.CargoFactory;
import com.delivery.transport.CargoRepository;
import com.delivery.transport.DeliveryCenter;
import com.delivery.transport.HandlingEvent;
import com.delivery.transport.TransportRecord;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Contract contract = ContractFactory.createContract();
		contract.setSender("–î–ì");
		contract.setReceiver("–k‘º");
		contract.setCargo(Size.Small, 5.0);

		ContractRepository repos = new ContractRepository();

		System.out.println(contract.getContractNo());
		repos.save(contract);

		Contract savedContract = repos.find(contract.getContractNo());

		System.out.println(savedContract.getContractNo());
		
		// —A‘—
		long id = getCargoId(contract);
		List<DeliveryCenter> deliveryCenters = routing(contract);
		
		Cargo cargo = new CargoFactory().create(id, deliveryCenters);
		
		CargoRepository cargoRepository = new CargoRepository();
		
		cargoRepository.addCargo(cargo);
		
		Cargo resultCargo = cargoRepository.findById(cargo.getId());
		
		assert(resultCargo.equals(cargo));
		
		System.out.println(cargo.getId());
		
		TransportRecord record = cargo.getRecord();
		List<HandlingEvent> events = record.getEvents();
		for (HandlingEvent handlingEvent : events) {
			System.out.println(handlingEvent);
		}
	}
	
	private static List<DeliveryCenter> routing(Contract contract) {
		
		class RoutingService {
			
			List<DeliveryCenter> routing(String sender, String receiver) {
				return new ArrayList<DeliveryCenter>() {
					{
						add(new DeliveryCenter("Nagano"));
						add(new DeliveryCenter("Tokyo"));
						add(new DeliveryCenter("Chiba"));
					}
				};
			}
		}
		
		RoutingService service = new RoutingService();
		
		return service.routing("", "");
	}

	private static long getCargoId(Contract contract) {
		// TODO Auto-generated method stub
		return 0;
	}
}
