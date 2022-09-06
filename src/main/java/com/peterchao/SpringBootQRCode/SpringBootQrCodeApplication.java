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
		startTime.set(Calendar.MONTH,9);
		startTime.set(Calendar.DAY_OF_MONTH,4);
		startTime.add(Calendar.MONTH,-1);
		SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
		String startCurrentTime = format.format(startTime.getTime());
		System.out.println(startCurrentTime);

		Calendar lastTime = Calendar.getInstance();
		lastTime.set(Calendar.YEAR,2022);
		lastTime.set(Calendar.MONTH,9);
		lastTime.set(Calendar.DAY_OF_MONTH,1);
		lastTime.add(Calendar.MONTH,-1);
		String lastCurrentTime = format.format(startTime.getTime());
		System.out.println("Last" + lastCurrentTime);
	}
}
