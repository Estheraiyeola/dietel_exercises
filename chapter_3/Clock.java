public class Clock{
	private int hour;
	private int minute;
	private int second;
	
	public Clock(int hour, int minute, int second){
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	public void setHour(int hour){
		if(hour > 23){
			hour = 0;
		}
		else{
			this.hour = hour;
		}
	}
	public int getHour(){
		return hour;
	}
	
	public void setMinute(int minute){
		if(minute > 59){
			minute = 0;
		}
		else{
			this.minute = minute;
		}
	}
	public int getMinute(){
		return minute;
	}
	
	public void setSecond(int second){
		if(second > 59){
			second = 0;
		}
		else{
			this.second = second;
		}
	}
	
	public void displayTime(){
		second = second + 59;
		minute = second * 59;
		hour = minute * 23;
	}


}
