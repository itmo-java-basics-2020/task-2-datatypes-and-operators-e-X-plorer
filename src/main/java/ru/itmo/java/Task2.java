package ru.itmo.java;

@SuppressWarnings("all")
public class Task2 {

    /**
     * Дано произвольное вещественное число. Выведите его дробную часть
     * <p>
     * Например
     * - дано 17.9
     * - вывод 0.9
     */
    double getFractionalPart(double realNumber) {
        return realNumber - (int)realNumber;
    }

    /**
     * Дан символ, верните его код. Не используйте явное приведение типов и любые библиотечные функции
     */
    int charCode(char c) {
        return c;
    }

    /**
     * Даны 2 целых числа. Проверьте равны ли они
     */
    boolean testIfIntsEqual(Integer a, Integer b) {
        return a.intValue() == b.intValue();
    }

    /**
     * Дано целое число. Выведите {@code true}, если оно входит в заданный диапазон или {@code false}
     * в иных случаях
     *
     * @param number      заданное число
     * @param leftBound   правая граница диапазона
     * @param rightBound  верхняя граница диапазона
     * @param inclusively входят ли границы в заданный даипазон
     */
    boolean numberInRange(Integer number, Integer leftBound, Integer rightBound, Boolean inclusively) {
        try {
            /*if (number.intValue() >= leftBound.intValue() && number.intValue() <= rightBound.intValue())
                if (!inclusively && (number.intValue() == leftBound.intValue() || number.intValue() == rightBound.intValue()))
                    return false;
                else return true;
            else return false;*/
            if (!inclusively) {
                leftBound++;
                rightBound--;
            }
            if (number.intValue() >= leftBound.intValue() && number.intValue() <= rightBound.intValue()) {
                return true;
            }
            else return false;
        }
        catch (NullPointerException e) {
            return false;
        }
    }

    /**
     * Даны 3 символа. Определите является ли хотя бы один из них цифрой 1..9 <- ОШИБКА В УСЛОВИИ!
     */
    boolean atLeastOneIsDigit(char c1, char c2, char c3) {
        return (c1 >= '0' && c1 <= '9') || (c2 >= '0' && c2 <= '9') || (c3 >= '0' && c3 <= '9');
    }

    /**
     * Даны два вещественных числа. Определите равны ли они
     */
    boolean areRealNumbersEqual(double a, double b) {
        return Math.abs(a - b) < 0.00001;
    }

    /**
     * Дано трехзначное число 100 <= N <= 999. Найдите сумму его чисел.
     */
    int sumOfDigits(int n) {
        int sum = 0;
        for (int i = 0; i < 3; ++i) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    /**
     * Дано натуральное число N <= 10000. Выведите следующее после N четное число. Например: N = 8, Result = 10
     */
    int nextEvenNumber(int n) {
        n++;
        if (n % 2 == 0)
            return n;
        else return n + 1;
    }

    /**
     * Школа №32 решила создать 3 дополнительных физмат класса и укомплектовать кабинеты новыми партами.
     * За одной партой может сидеть 2 ученика. Кол-во учеников в каждом из классов известно (num1, num2, num3).
     * Выведите минимальное кол-во парт, которые нужно приобрести школе, при условии что каждый из классов сидит в
     * своем кабинете
     */
    int schoolDesks(int num1, int num2, int num3) {
        int desks = 0;
        return (num1 + 1) / 2 + (num2 + 1) / 2 + (num3 + 1) / 2;
    }

    /**
     * Дано натуральное число N >= 10. Выведите результат применения XOR к последним 2-м цифрам числа N
     */
    int xorDigits(int N) {
        return (N % 100 / 10) ^ (N % 10);
    }

}
