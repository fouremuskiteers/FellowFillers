package org.ff.requesthandler.service;

public class Request {
	
	
	private long requestId;
	
	private long userId;
	
	private String fillLocation;
	
	private String vehiclePlateNumber;
	
	private double gasQuantity;
	
	private String gasType;

	public long getRequestId() {
		return requestId;
	}

	public void setRequestId(long requestId) {
		this.requestId = requestId;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getFillLocation() {
		return fillLocation;
	}

	public void setFillLocation(String fillLocation) {
		this.fillLocation = fillLocation;
	}

	public String getVehiclePlateNumber() {
		return vehiclePlateNumber;
	}

	public void setVehiclePlateNumber(String vehiclePlateNumber) {
		this.vehiclePlateNumber = vehiclePlateNumber;
	}

	public double getGasQuantity() {
		return gasQuantity;
	}

	public void setGasQuantity(double gasQuantity) {
		this.gasQuantity = gasQuantity;
	}

	public String getGasType() {
		return gasType;
	}

	public void setGasType(String gasType) {
		this.gasType = gasType;
	}

	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append("requestId: "+ requestId + "\n");
		sb.append("userId: "+ userId + "\n");
		sb.append("fillLocation: "+ fillLocation + "\n");
		sb.append("vehiclePlateNumber: "+ vehiclePlateNumber + "\n");
		sb.append("gasQuantity: "+ gasQuantity + "\n");
		sb.append("gasType: "+ gasType + "\n");		
		return sb.toString();
		
	}
}
