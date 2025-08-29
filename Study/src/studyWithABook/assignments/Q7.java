package studyWithABook.assignments;

public class Q7 {
    public void initData(String[] arr){
        int ind = 0;
        for(String str : arr){
            str.concat(str+" "+ind);
            ind++;
        }
    }

    public void printData(String[] arr){
        for(String str : arr){
            System.out.println(str);
        }
    }
    public static void main(String[] args) {
        Q7 ot = new Q7();
        String[] arr = new String[2];
        ot.initData(arr);
        ot.printData(arr);
}}
