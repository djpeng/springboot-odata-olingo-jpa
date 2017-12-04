package com.pengdaijun.odata.olingo.jpa.model;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.apache.olingo.odata2.api.annotation.edm.EdmEntitySet;
import org.apache.olingo.odata2.api.annotation.edm.EdmEntityType;
import org.apache.olingo.odata2.api.annotation.edm.EdmKey;
import org.apache.olingo.odata2.api.annotation.edm.EdmNavigationProperty;
import org.apache.olingo.odata2.api.annotation.edm.EdmProperty;

@EdmEntityType
@EdmEntitySet
public class Manufacturer {
	@EdmKey
	@EdmProperty
	private String id;
	@EdmProperty
	private String name;
	@EdmProperty
	private Calendar founded;
	@EdmNavigationProperty
	private List<Car> cars = new ArrayList<Car>();

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Calendar getFounded() {
		return founded;
	}

	public void setFounded(Calendar founded) {
		this.founded = founded;
	}

	public List<Car> getCars() {
		return cars;
	}

	public void setCars(List<Car> cars) {
		this.cars = cars;
	}

}
