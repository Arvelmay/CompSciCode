public class Event {
    private String description, month;
    //time is in military time
    private int day, year, startTime, endTime;

    public Event(String desc, String m, int da, int y, int start, int end){
        this.description = desc;
        this.month = m;
        this.day = da;
        this.year = y;
        this.startTime = start;
        this.endTime = end;
    }

    public Event (Event e2){
        this.description = e2.description;
        this.month = e2.month;
        this.day = e2.day;
        this.year = e2.year;
        this.startTime = e2.startTime;
        this.endTime = e2.endTime;
    }

    //Getters
    public String getDescription(){
        return this.description;
    }

    public String getMonth(){
        return this.month;
    }

    public int getDay(){
        return this.day;
    }

    public int getYear(){
        return this.year;
    }

    public int getStartTime(){
        return this.startTime;
    }

    public int getEndTime(){
        return this.endTime;
    }

    //Setters
    public void setDescription(String desc){
        this.description = desc;
    }

    public void setMonth(String mon){
        this.month = mon;
    }

    public void setDay(int da){
        this.day = da;
    }

    public void setYear(int ye){
        this.year = ye;
    }

    public void setStartTime(int start){
        this.startTime = start;
    }

    public void setEndTime(int end){
        this.endTime = end;
    }

    //runs when you print the name of the class
    public String toString(){
        return (this.description+"\n"+this.day+" "+this.month+", "+this.year);
        System.out.println(this.startTime+" - "+this.endTime);
    }
}
