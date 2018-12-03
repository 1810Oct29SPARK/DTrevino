package com.revature.comparision;

import java.util.Comparator; 

import com.revature.transport.*;

public class CarModelCompare implements Comparator<Car> {

	@Override
	public int compare(Car arg0, Car arg1) {
		return arg0.getModel().compareTo(arg1.getModel());
	}

}
