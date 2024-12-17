

public class Emotion
{
    private int happiness;
    
    
    public Emotion (int startHappiness){
        happiness = startHappiness;    
    }
    
    public Emotion (){
        this(4);}
    
    public int getHappiness(){
        return this.happiness;}
        
    public void changeHappiness(int n){
        this.happiness += n;
        if (this.happiness > 7){
            this.happiness = 7;}
        if (this.happiness < 1){
            this.happiness = 1;}
    }
    
    public void setHappiness(int n){
        this.happiness = n;
        if (this.happiness > 7){
            this.happiness = 7;}
        if (this.happiness < 1){
            this.happiness = 1;}}
        
    @Override
    public String toString(){
        String face = "";
        switch(this.getHappiness()){
            case 1: face = "😡 >:(";
                    break;
            case 2: face = "😟  :(";
                    break;
            case 3: face = "😞  <(";
                    break;
            case 4: face = "😐  :|";
                    break;
            case 5: face = "🙂  :)";
                    break;
            case 6: face = "😄  :D";
                    break;
            case 7: face = "😆  XD";
                    break;}
        return face;}}
    
