//A program that multiplies corresponding elements of two array
public class Main {
    public static void main(String[] args) {
       int [] A1 = {1,3,-5,4};
       int [] A2 = {1,4,-5,-2};
       String results = " ";

       for(int j=0; j<A1.length;j++){
           int num = A1[j];
           int num2 = A2[j];
           results+= Integer.toString(num*num2)+" ";
           System.out.println(results);
        }

    }
}