import java.util.ArrayList;
//Import package

public class JavaBasic {
//Public class, everyone have access

    public static void main( String args[] ){
    //Methods inside JavaBasic Class

    //================================== ARRAY's ======================

        String numbersList[] = new String[5]; //Array size/index
        numbersList[0] = "My Full Name:";
        numbersList[1] = "Bryan";
        numbersList[2] = "Eduardo";
        numbersList[3] = "Cascante";
        numbersList[4] = "Vargas";

        for( int i = 0; i < numbersList.length; i ++ ){
            System.out.println( numbersList[i] );
        }
        

        ArrayList<String> list = new ArrayList<String>();
        // add, clear, clone, contains, get, indexOf, isEmpty, remove, size
        list.add( "Zeus" );
        list.add( "Poseidon" );
        System.out.println( list.size() ); //size = length

        for( int i = 0; i < list.size(); i ++ ){
            System.out.println( list.get(i) );
        }
    }

    //====================================== BASIC ALGORITHMS JAVA ====================

    //====== Print 1 to 255

    public void print255(){

        for( int i = 1; i < 256; i++ ){
            System.out.println(i);
        }

    }

    //====== Print odd numbers from 1 to 255

    public void odds255(){

        for( int i=1; i<256;i++ ){
            if( i % 2 != 0 ){
                System.out.println(i);
            }
        }

    }

    //====== Print odd numbers from 1 to 255

    public int sigma255(){

        int sum = 0;

        for( int i = 1; i < 256; i++ ){

            sum += i;
           //System.out.println(sum);
        }

        return sum;

    }

    //====== Print an given array
    
    public static void printArray(){

        int arrayL[] = {1,3,5,7,9,13,26};

        for( int i = 0; i < arrayL.length; i ++ ){
            System.out.println( arrayL[i] );
        }

    }
    printArray();

}