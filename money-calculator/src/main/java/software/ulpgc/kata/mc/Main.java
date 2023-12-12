package software.ulpgc.kata.mc;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class Main {

	public static void main(String[] args) throws IOException {
		Money in = new Money(20, "usd");
		String erpUrl = System.getenv("ERP_URL");
		URL url = new URL(erpUrl + "/exchange-rate/usd/eur");
		try (InputStream is = url.openStream()){
			String response = new String(is.readAllBytes());
			double rate = Double.parseDouble(response);
			Money out = new Money(in.amount * rate, "eur");
			System.out.println(in + " = " + out);
		}
	}

	record Money(double amount, String currency){}
}
