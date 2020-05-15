package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;


public class Datas {

	public static void main(String[] args)  throws ParseException {

		SimpleDateFormat sfd1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sfd2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sfd3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sfd3.setTimeZone(TimeZone.getTimeZone("GMT"));

		Date y1 = sfd1.parse("25/06/2018");
		Date y2 = sfd2.parse("25/06/2018 10:13:24");
		
		
		Date x1 = new Date();
		Date x2 = new Date(System.currentTimeMillis());
		Date x3 = new Date(0L);
		Date x4 = new Date(1000L * 60L * 60L * 5);
		Date x5 = Date.from(Instant.parse("2020-06-25T15:42:07Z"));
		
		
		System.out.println("y1: "+ sfd2.format(y1));
		System.out.println("y2: "+sfd2.format(y2));
		System.out.println("x1: "+sfd2.format(x1));
		System.out.println("x2: "+sfd2.format(x2));
		System.out.println("x3: "+sfd2.format(x3));
		System.out.println("x4: "+sfd2.format(x4));
		System.out.println("x5: "+sfd2.format(x5));
		System.out.println("------------");
		System.out.println("y1: "+ sfd3.format(y1));
		System.out.println("y2: "+sfd3.format(y2));
		System.out.println("x1: "+sfd3.format(x1));
		System.out.println("x2: "+sfd3.format(x2));
		System.out.println("x3: "+sfd3.format(x3));
		System.out.println("x4: "+sfd3.format(x4));
		System.out.println("x5: "+sfd3.format(x5));

	}

}
