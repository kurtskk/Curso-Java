package entities;

import entities.enums.WorkerLevel;
import entities.HourContract;
import entities.Department;
import java.util.List;
import java.util.ArrayList;
import java.time.LocalDate;

public class Worker {

	private String _name;
	private WorkerLevel _level;
	private Double _baseSalary;
	private Department _department;
	private List<HourContract> _contracts = new ArrayList<>();
	

	public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
		_name = name;
		_level = level;
		_baseSalary = baseSalary;
		_department = department;
	}

	public void setName(String name) {
		_name = name;
	}

	public String getName() {
		return _name;
	}

	public WorkerLevel getLevel() {
		return _level;
	}

	public void setLevel(WorkerLevel level) {
		_level = level;
	}

	public Double getSalary() {
		return _baseSalary;
	}

	public void setSalary(Double salary) {
		_baseSalary = salary;
	}

	public Department getDepartment() {
		return _department;
	}

	public void setDepartment(Department department) {
		_department =  department;
	}

	public List<HourContract> getContracts() {
		return _contracts;
	}

	public void addContract(HourContract contract) {
		_contracts.add(contract);
	}

	public void removeContract(HourContract contract) {
		_contracts.remove(contract);
	}

	public Double income(Integer year, Integer month) {
		Double sum = _baseSalary;
		for (HourContract contract : _contracts) {
			LocalDate date = contract.getDate();
			if (date.getYear() == year && date.getMonthValue() == month) {
				sum += contract.totalValue();
			}
		}
		return sum;
	}
}