package studyWithABook.assignments;

public class Q5 {
    public static void main(String[] args) {
        int i = 1;
        int[] iArr = {1};
        incr(i) ;
        incr(iArr) ;
        System.out.println( "i = " + i + "  iArr[0] = " + iArr [ 0 ] ) ;
    }
    public static void incr(int n) { n++ ; }
    public static void incr(int[] n) { n[0]++ ; }
}
/*
Для примитивов (int, boolean, double, и т.д.) — передаётся само значение.
Для объектов (в том числе массивов) — передаётся значение ссылки на объект
 */
