package Third;

public class MainThird {
    public static void main(String[] args) {
        int[] myArray = {1,50,25,45,2};
        int temp  = myArray[0];
        myArray[0] = myArray[myArray.length - 1];
        myArray[myArray.length - 1] = temp;
        System.out.println(myArray[0]+myArray[myArray.length/2]);
    }
}
