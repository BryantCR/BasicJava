public class JavaBasicTest{

    public static void main(String args[]){

        JavaBasic test = new JavaBasic();

        test.print255();
        test.odds255();
        test.sigma255();
        System.out.println(test.sigma255());
        int argsL[] = {1,3,5,7,9,13,26};
        test.printArray(argsL);
        int fMax[] = {-5, 5, -7, 0, 2};
        test.findMax(fMax);
        test.arrayOdds255();
    }

}