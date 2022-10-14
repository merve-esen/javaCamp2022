package day3.kodlamaio.src.core.logging;

public class DatabaseLogger implements Logger {

	@Override
	public void log(String data) {
		System.out.println("Veri tabanına loglandı: " + data);
	}

}
