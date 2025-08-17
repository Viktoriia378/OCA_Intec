package equal;

public class Equal {
    public static  void main(String[] args) {

        String str1="Java";
        String []str2= {"J"+"a"+"v"+"a"};
        String str3="";
        double d = 10, c = 10.0f;
        String str4="Java";
        boolean b3=(str1==str4);
        System.out.println("b3:"+b3);
        //char b = '';

        String str5=new String("Java");
        boolean b4=(str1==str5);
        System.out.println("b4:"+b4);

        for(String str:str2){
            str3=str3+str;
        }
        boolean b1=(str1.equals(str3));
        boolean b2=(str1==str3);
        System.out.println(b1+","+b2);

        double s=Math.round(-0.5);
        System.out.println(s);
        char c1 ='a';
        int b=c1;
        System.out.println(b);
    }
}
