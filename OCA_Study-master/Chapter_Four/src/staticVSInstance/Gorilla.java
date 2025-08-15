package staticVSInstance;
//we can not use instance variable inside static variables and static methods
//we can use inside our method static variable
public class Gorilla {
    public static int count;
    public int n;
    public static void addGorila(){count++;}
    public void babyGarilla(){count++;}
    public void announceBabies(){
        addGorila();
        babyGarilla();
    }

    public static void main(String[] args) {
        addGorila();
        //babyGorilla(); no object does not compile
    }
    public int total;
    //public static int average = count / total; does not compile bcs we use inside instance
}
