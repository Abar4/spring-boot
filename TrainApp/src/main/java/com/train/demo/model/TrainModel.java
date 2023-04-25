package com.train.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class TrainModel {
@Id
private int trainNum;
private String sPlace;
private String dPlace;
private int trainTicket;
private int Passenger;
private String driverName;
public int getTrainNum() {
	return trainNum;
}
public void setTrainNum(int trainNum) {
	this.trainNum = trainNum;
}
public String getsPlace() {
	return sPlace;
}
public void setsPlace(String sPlace) {
	this.sPlace = sPlace;
}
public String getdPlace() {
	return dPlace;
}
public void setdPlace(String dPlace) {
	this.dPlace = dPlace;
}
public int getTrainTicket() {
	return trainTicket;
}
public void setTrainTicket(int trainTicket) {
	this.trainTicket = trainTicket;
}
public int getPassenger() {
	return Passenger;
}
public void setPassenger(int passenger) {
	Passenger = passenger;
}
public String getDriverName() {
	return driverName;
}
public void setDriverName(String driverName) {
	this.driverName = driverName;
}

}
