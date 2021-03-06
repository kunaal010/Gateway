package MyPack;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTimeUtils {
	
	
	public static String TimeStamp(){
		Date myStamp=new Date();
		SimpleDateFormat myFormat=new SimpleDateFormat("hhmmddMMyy");
		return myFormat.format(myStamp);
	}
	
	public static String CourseDate(){
		Date courseDate = new Date();
		SimpleDateFormat CourseDateFormat= new SimpleDateFormat("MM/dd/yyyy");
		return CourseDateFormat.format(courseDate);
	}
	
	public static String CourseDate_Max(){
		Date dt= new Date();
		Calendar c= Calendar.getInstance();
		c.setTime(dt);
		c.add(Calendar.DATE, 25);
		dt=c.getTime();
		SimpleDateFormat CourseDateFormat=new SimpleDateFormat("MM/dd/yyyy");
		return CourseDateFormat.format(dt);
	}
	
	public static String CourseDate_3Days(){
		Date dt= new Date();
		Calendar day = Calendar.getInstance();
		day.setTime(dt);
		day.add(Calendar.DATE, 3);
		dt=day.getTime();
		SimpleDateFormat CourseDateFormat = new SimpleDateFormat("MM/dd/yyyy");
		return 	CourseDateFormat.format(dt);
	}
}


