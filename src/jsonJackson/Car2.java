package jsonJackson;

import java.math.BigDecimal;
import java.util.List;

public  class Car2{
	String name;
	String company;
	BigDecimal Price;
	
	//List<Book> EngineOptions;
	String EngineOptions;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public BigDecimal getPrice() {
		return Price;
	}
	public void setPrice(BigDecimal price) {
		Price = price;
	}
	@Override
	public String toString() {
		return "Car2 [name=" + name + ", company=" + company + ", Price=" + Price + ", EngineOptions=" + EngineOptions
				+ "]";
	}
	
	
	
	
	
}