package main.java.ru.clevertec.check;

public class CheckRunner {
	public static void main(String[] args) {
		ArgumentParser parser = new ArgumentParser(args);
				
		String check = CheckFactory.createCheck(parser.getProducts(), 
												parser.getDiscountCard(), 
												parser.getBalanceDebitCard());
		
		System.out.println(check);
	}
}
