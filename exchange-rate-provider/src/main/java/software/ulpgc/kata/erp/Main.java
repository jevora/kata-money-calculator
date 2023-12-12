package software.ulpgc.kata.erp;

import spark.Spark;

public class Main {
	public static void main(String[] args) {
		Spark.port(Integer.parseInt(System.getenv("ERP_PORT")));
		Spark.get("exchange-rates/:src/:dst", (r, q) -> "0.5");
	}
}
