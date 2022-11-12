public class JavaInteroperability {
    public static void main(String[] args) {
        //The following method is being called from a Kotlin File
        //System.out.println(FunctionsKt.add(6,10));
        //We are not using the file name because it has been changed using annotation in the Kotlin File

        System.out.println(CustomFileName.add(6,10));
    }

    public static int product(int a, int b) {
        return a * b;
    }
}
