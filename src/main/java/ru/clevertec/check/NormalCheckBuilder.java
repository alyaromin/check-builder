package main.java.ru.clevertec.check;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class NormalCheckBuilder implements CheckBuilder {
	private List <Product> products = new ArrayList<Product>();
	private int discount = 0;
	private float balance;
	
	public CheckBuilder addProducts(Map<Integer, Integer> requestedProducts) {
		return this;
	}
	
	public CheckBuilder setDiscount(int discountCard) {
		return this;
	}
	
	public CheckBuilder setBalance(float balance) {
		return this;
	}
	
	@Override
	public String build() {
		// TODO Auto-generated method stub
		return "Mock normal check";
	}

}
