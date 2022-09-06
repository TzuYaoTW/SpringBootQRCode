package com.peterchao.SpringBootQRCode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.text.SimpleDateFormat;
import java.util.Calendar;

@SpringBootApplication
public class SpringBootQrCodeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootQrCodeApplication.class, args);
		Calendar startTime = Calendar.getInstance();
		startTime.set(Calendar.YEAR,2022);
		startTime.set(Calendar.MONTH,10);
		startTime.set(Calendar.DAY_OF_MONTH,4);
		SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
		String startCurrentTime = format.format(startTime.getTime());
		System.out.println(startCurrentTime);

		Calendar lastTime = Calendar.getInstance();
		lastTime.set(Calendar.YEAR,2022);
		lastTime.set(Calendar.MONTH,10);
		lastTime.set(Calendar.DAY_OF_MONTH,30);
		String lastCurrentTime = format.format(lastTime.getTime());
		System.out.println("Last" + lastCurrentTime);
		if (startCurrentTime.substring(4,5).equals(lastCurrentTime.substring(4,5))){
			System.out.println("same");
			System.out.println(startCurrentTime.substring(4,6));
			System.out.println(lastCurrentTime.substring(4,6));
		}else {
			System.out.println("diff");
			System.out.println(startCurrentTime.substring(4,6));
			System.out.println(lastCurrentTime.substring(4,6));
		}
	}
}
