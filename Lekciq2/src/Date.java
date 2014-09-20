
public class Date {
	private int month,day,year;
	public Date(int month,int day,int year) {
		if(month<=12&&month>0)
			this.month = month;
		if(day<=31&&day>0)
			this.day = day;
		if(year>0)
			this.year = year;
	}
	public void setMonth(int month){
		if(month<=12&&month>0)
			this.month = month;
	}
	public int getMonth(){
		return month;
	}
	public void setDay(int day){
		if(day<=31&&day>0)
			this.day = day;
	}
	public int getDay(){
		return day;
	}
	public void setYear(int year){
		this.year = year;
	}
	public int getYear(){
		return year;
	}
	public void displayMessage(){
		System.out.printf("\n%d/%d/%d\n", day,month,year);
	}

}
