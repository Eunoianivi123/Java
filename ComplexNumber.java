class CN{
    public int real;
    public int imag;

    CN(int n1 , int n2){
        real = n1;
        imag = n2;
    }

    void print(){
        System.out.println(real + "" + "+" + imag+"i");
    }
    CN add(CN y){
        int sumReal = real + y.real;
        int sumImag = imag + y.imag;
        CN res = new CN(sumReal , sumImag);
        return res;
    }
}


public class ComplexNumber {
    public static void main(String[] args){
        CN obj1 = new CN(2,3);
        CN obj2 = new CN(5,3);

        obj1.print();
        obj2.print();

        CN sum = obj1.add(obj2);
        sum.print();


    }
}
