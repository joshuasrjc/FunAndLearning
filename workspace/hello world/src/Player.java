
public class Player {
private int hour;
private int minute;
private int second;
	
public void setTime(int h, int m, int s){
	//why is this initialized
	int x =0;
	int y = 0;
	// fix use of int y and x
	second = ((s>=0 && s<60)? s : (x= s% 60));
	minute = ((m>=0 && m<60)? m+(s/60) :(y = (m%60) +(s/60)));
	hour = ((h>=0 && h<24)? h+(m/60) :(h= (h%24)+(m/60)));
	
	System.out.println("second:"+second);
	System.out.println("s:"+s);

	System.out.println("minute:"+minute);
	System.out.println("m:"+m);
	
	System.out.println("hour:"+hour);
	System.out.println("h:"+h);
	
	System.out.println(x);
	System.out.println(y);
	
}

public String toMilitary(){
	return String.format("%02d:%02d:%02d" ,hour, minute, second);
	
}

public String toSteven(){
	return String.format("%d:%02d:%02d %s", ((hour == 0 || hour==12) ?12:hour%12), minute, second,(hour < 12? "AM": "PM"));
}
} 