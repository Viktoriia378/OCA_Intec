package bonusTest1;

public class Q17 {
    public static void main(String[] args) {
        int x = 5;
        while (x >= 0){
            int y = 3;
            while (y > 0){
                if(x<2) continue;
                x--; y--;
                System.out.println(x*y+" ");
            }
        }
    }
}
/*
Внутренний цикл:
x = 2, y = 3, x < 2 ❌ → x--, y--
x = 1, y = 2
System.out.println(1 * 2) → 2 ← 🔹 ВОТ ОН — "2" в конце!
 */
/*
Следующая итерация внутреннего цикла:
x = 1, x < 2 ✅ → continue
y не меняется! y = 2
x не меняется! x = 1
👉 бесконечный цикл!
 */
/*
The code contains an infinite loop and does not terminate.
Before reaching the infinite state, the code will output 8 3 0 2.
 */