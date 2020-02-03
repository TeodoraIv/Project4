package fmi.informatics.gui;

import javax.swing.table.AbstractTableModel;

import fmi.informatics.extending.Person;

// Създаваме клас PersonDataModel
public class PersonDataModel extends AbstractTableModel {

	private static final long serialVersionUID = 1L;
	
	private Person[] people;

	// constructor
	public PersonDataModel(Person[] people) {
		this.people = people;
	}

	@Override
	public int getColumnCount() {
		return 7; // брой колони в таблицата 
	}

	@Override
	public int getRowCount() {
		return people.length; // брой редове в таблицата
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		switch (columnIndex) {
			case 0:
				return people[rowIndex].getName();
			case 1:
				return people[rowIndex].getEgn();
			case 2:
				return people[rowIndex].getFacNumber();
			case 3:
				return people[rowIndex].getTitle();
			case 4:
				return people[rowIndex].getSpecialty();
			case 5:
				return people[rowIndex].getAge();
			case 6:
				return people[rowIndex].getHeight();
		}
		return null;
	}

	@Override
	public String getColumnName(int column) {
		switch (column) {
			case 0:
				return "Име";
			case 1:
				return "ЕГН";
			case 2:
				return "Фак номер";
			case 3:
				return "Длъжност";
			case 4:
				return "Специалност";
			case 5:
				return "Години";
			case 6:
				return "Височина";
	
			default:
				return super.getColumnName(column);
		}
	}
}
