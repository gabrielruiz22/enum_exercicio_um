package entities;

import entities.enums.WorkerLevel;

public class Worker {
	private String name;
	private WorkerLevel level;
	private Double baseSalary;
	
	public void addContract(HourContract contract) {
		
	}
	
	public void removeContract(HourContract contract) {
		
	}
	
	public Double income(Integer year, Integer month) {
		return 2.0;
	}
}
