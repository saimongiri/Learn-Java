// Declared the main body for type casting
public class typecast {
    public static void main(String[] args){

        /*Type of type casting
        1.Widening
            converting lower to higher datatype
            (opposite order of narrowing)
        2. Narrowing
         */

        // Narrowing :- converting higher datatype to  lower datatype
        // double -> float -> long -> int ->char ->short ->byte

        int val1 =20;
        float val2 = val1;

        System.out.println("Integer value :"+val1+"after widening is "+val2);
    

        double doubleval = 10.325;
        int val3 = (int) doubleval;
        System.out.println("Double value :"+doubleval+"after narrowing is "+val3 );
    }
    
}
