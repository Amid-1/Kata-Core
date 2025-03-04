package oop;

public class ComplexNumber {

    private final double re;
    private final double im;

    public ComplexNumber(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ComplexNumber other = (ComplexNumber) obj;
        return Double.compare(this.re, other.re) == 0 && Double.compare(this.im, other.im) == 0;
    }

    @Override
    public int hashCode() {
        long reBits = Double.doubleToLongBits(re);
        long imBits = Double.doubleToLongBits(im);
        return ((int) (reBits ^ (reBits >>> 32))) * 31 + (int) (imBits ^ (imBits >>> 32));
    }
}

//ComplexNumber other = (ComplexNumber) obj;
//return this.re == (other.re) && this.im == (other.im);

//Дан класс ComplexNumber. Переопредели в нем методы equals() и hashCode() так, чтобы equals() сравнивал экземпляры
// ComplexNumber по содержимому полей re и im, а hashCode() был согласованным с реализацией equals().
//
//Реализация hashCode(), возвращающая константу или не учитывающая дробную часть re и im, засчитана не будет
//
//Пример
//
//ComplexNumber a = new ComplexNumber(1, 1);
//ComplexNumber b = new ComplexNumber(1, 1);
// a.equals(b) must return true
// a.hashCode() must be equal to b.hashCode()

//Подсказка 1. Поищи в классе java.lang.Double статический метод, который поможет в решении задачи.
//
//Подсказка 2. Если задача никак не решается, можно позвать на помощь среду разработки, которая умеет сама
// генерировать equals() и hashCode(). Если ты воспользовался помощью IDE, разберись, что было сгенерировано и
// почему оно выглядит именно так. Когда тебя на собеседовании попросят на бумажке реализовать equals() и
// hashCode() для какого-нибудь простого класса, то среда разработки помочь не сможет.