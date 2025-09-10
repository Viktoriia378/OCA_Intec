package intecOCA.test1;

public class Q17 {
    /*
    switch(condition){
    case 1: System.out.println("1"); break;
    case 2: System.out.println("2"); break;
    case 3: System.out.println("3"); break;
    }
     */
    /*
    correct:
    Byte condition = 1;
    Integer condition = new Integer("1");
    incorrect:
    short condition = new Short(1);
    This is almost a valid option but for the fact that 1 is an int and you can't instantiate a
    Short object with an int argument. It will, therefore, not compile. short condition = new Short((short)1);
    would have been valid.
     */
}
