public class PhoneNumber implements Comparable<PhoneNumber>
{
    private int number;
    
    public PhoneNumber(int n)
    {
        if (n < 1000000 || n > 9999999) {
        throw new IllegalArgumentException("Phone Number is not valid!");
        }
        number = n;
    }
    /**
     * Get a read-only copy of the phone number
     * @param
     * @return: Phone Number as a 7-digit int
     */
    public int getPhoneNumber(){
        return this.number; }
    /**
     * Change Phone Number to a valid new number
     * @param n A 7-digit int
     * @return
     */
    public void changePhoneNumber(int n){
        if (n < 1000000 || n > 9999999) {
        throw new IllegalArgumentException("Phone Number is not valid!");
        }
        number = n;
    }
    /**
     * @Override
     * Get object as a string
     * @param: None
     * @return number Phone Number as a String
     */
    public String toString(){
        String temp = Integer.toString(number);
        String result = temp.substring(0,3)+"-"+temp.substring(3,7);
                return result;
        }
    // Compare Two PhoneNumbers based on their int value
    /**
     * Identifies if one phone number is larger than another.
     * @param   otherNum - The PhoneNumber to be compared.
     * @return  A negative integer, zero, or a positive integer depending on if this PhoneNumber
     *          is less than, equal to, or greater than the other PhoneNumber.
     */
   
    @Override
    public int compareTo(PhoneNumber otherNum) {
        return this.getPhoneNumber() - otherNum.getPhoneNumber();
    }
    /**
     * Two PhoneNumbers are equal if they have the same 7-Digit int
     * @param   otherNum - The PhoneNumber to be compared.
     * @return  A negative integer, zero, or a positive integer depending on if this PhoneNumber
     *          is less than, equal to, or greater than the other PhoneNumber.
     */
   
    
    public boolean equals(PhoneNumber p) {
        if (this==null || p==null){
            return false;}
        else {return this.getPhoneNumber()==p.getPhoneNumber();}
        
    }
}