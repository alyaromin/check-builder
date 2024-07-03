package main.java.ru.clevertec.check;

import java.util.HashMap;
import java.util.Map;

public class ArgumentParser {
	private Map<Integer, Integer> products;
	private int discountCard;
	private float balanceDebitCard;
	
	public ArgumentParser(String[] args) {
		this.products = new HashMap<Integer, Integer>();
		this.discountCard = 0;
		this.balanceDebitCard = 0;
		
		parseArguments(args);
	}

	private void parseArguments(String[] args) {
		for (String arg : args) {
			if (arg.contains("-")) {
				// get products
				String[] productDetails = arg.split("-");
				int productId = Integer.parseInt(productDetails[0]);
				int quantity = Integer.parseInt(productDetails[1]);
				
				if (products.containsKey(productId)) {
					products.put(productId, products.get(productId) + quantity);
				} else {
					products.put(productId, quantity);
				}
								
			} else if (arg.startsWith("discountCard=")) {
				// get discountCard
				this.discountCard = Integer.parseInt(arg.split("=")[1]);
			} else if (arg.startsWith("balanceDebitCard=")) {
				// get balance
				this.balanceDebitCard = Float.parseFloat(arg.split("=")[1]);
			}
		}
		
	}

	public Map<Integer, Integer> getProducts() {
		return products;
	}

	public int getDiscountCard() {
		return discountCard;
	}

	public float getBalanceDebitCard() {
		return balanceDebitCard;
	}
	
}
