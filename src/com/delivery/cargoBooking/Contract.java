package com.delivery.cargoBooking;

import java.util.ArrayList;
import java.util.List;

import com.delivery.cargoBooking.Constants.Size;

/**
 * Œ_–ñ
 * 
 * @author Owner
 * 
 */
public class Contract {

	private Long contractNo;

	private List<Cargo> cargos = new ArrayList<Cargo>();

	private Sender sender = new Sender();

	private Receiver receiver = new Receiver();

	public Contract(Long contractNo) {
		super();
		this.contractNo = contractNo;
	}

	public Long getContractNo() {
		return contractNo;
	}

	public List<Cargo> getCargos() {
		return cargos;
	}

	public void setCargo(Size size, Double weight) {
		Cargo cargo = new Cargo();
		cargo.setSize(size);
		cargo.setWeight(weight);
		cargos.add(cargo);
	}

	public void setSender(String senderName) {
		this.sender.setName(senderName);
	}

	public void setReceiver(String receiverName) {
		this.receiver.setName(receiverName);

	}

}
