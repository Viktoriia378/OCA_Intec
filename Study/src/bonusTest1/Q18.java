package bonusTest1;

import java.util.function.Predicate;

public class Q18 {
    int age;

    public static void main(String[] args) {
        Q18 p1 = new Q18();
        p1.age = 1;
        check(p1,p-> p.age < 5);//check(p1, Panda p -˃ p.age ˂ 5); wrong
    }
    private static void check(Q18 p, Predicate<Q18> pred){
        String result = pred.test(p) ? "match" : "not match";
        System.out.println(result);
    }
}
/*
p1 — передаётся как первый аргумент (объект, который будем тестировать)
p -> p.age < 5 — лямбда, которая реализует Predicate<Q18>
Predicate<T> — это функциональный интерфейс с ОДНИМ параметром
 */