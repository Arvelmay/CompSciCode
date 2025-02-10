public class Interval {
    private double min;
    private double max;

    public Interval(){
        this.min = 0;
        this.max = 1;
    }

    public Interval(double min1, double max1){
        if (min1>max1){
            this.min = max1;
            this.max = min1;
        }
        else{
            this.min = min1;
            this.max = max1;
        }
    }

    public Interval(Interval i1){
        this.min = i1.min;
        this.max = i1.max;
    }

    public double getMin(){
        return this.min;
    }

    public double getMax(){
        return this.max;
    }

    public boolean intersects(Interval i1){
        return(this.min<=i1.min && this.max >= i1.min || this.max<=i1.max && this.min >= i1.max);
    }
    
    public boolean contains(Interval i1){
        return (this.min <= i1.min && this.max >= i1.max);
    }

    public double length(){
        return this.max-this.min;
    }

    public String toString(){
        return "["+this.min+","+this.max+"]";
    }

    public boolean equals(Interval i1){
        return (this.min == i1.min && this.max == i1.max);
    }
}
