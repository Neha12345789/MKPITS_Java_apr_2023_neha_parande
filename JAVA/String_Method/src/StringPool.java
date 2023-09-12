public class StringPool {

    public static void Pool(){

        String s1 = "Python";
        String s2 = "Java";
        String s3 = new String("Java").intern();
        String s4 = new String("Python");
        System.out.println(s3==s2);
        System.out.println(s4.equals(s1));

        String s5 = new String("Nagpur");



    }
}
