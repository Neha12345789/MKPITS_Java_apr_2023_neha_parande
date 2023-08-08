public class Main {
    public static void main(String[] args) {

        String str = "Neha";
        str.codePointBefore(1);
        System.out.println(str.charAt(1));

        String a = "Neha";
        String b = "Parande";
        String m = a.concat(b);
        System.out.println(m);

//        String alt = "method with the given expression";
//        String[] abc = alt.split(" ");
//        System.out.println(abc);

        //String to primitive data type

        String xyz = "456";
        Integer x = new Integer(xyz);  //boxing


        int p = x.intValue(); //unboxing
        System.out.println(p);

        int f = 45125;
        Integer e = f;  //auto boxing
        int g = x;      //auto unboxing
        System.out.println(e);

        //primitive to string

        int d = Integer.parseInt(xyz);
        System.out.println(d);


        String one = "I am Neha";

        String two = "surname is parande";
        System.out.println(one.contains("am Neha"));


        String que = "what are you doing";
        boolean j = que.contentEquals("what are you doing");
        System.out.println(j);

        //StringBuffer
        String ans = "this is my pen";
        boolean u = ans.contentEquals(ans);
        System.out.println(u);


        String nose = "Neha Parande";
        int r = nose.hashCode();
        System.out.println(r);

        double v = 20.30;
        System.out.println(Math.ceil(v));

        double q = 20.30;
        System.out.println(Math.floor(q));


        double w = 12;
        System.out.println(Math.random());


        double y = 2.0, z = 2.5;
        System.out.println(Math.pow(2.0, 2.5));

        double k = 2.3;
        System.out.println(Math.rint(k));

        String eleven = "Neha@2001";
        String Twelve = "Neha$2001";
        if (eleven == Twelve) {

            System.out.println("password is correct");
        } else {
            System.out.println("password is incorrect");
        }

        if(eleven.compareTo(Twelve)==0){
            System.out.println("password is correct");

        }
        else {
            System.out.println("password is incorrect");
        }

        int t = 15248;
        System.out.println("the binary conversion of 15248= " + Integer.toBinaryString(t));
        System.out.println("the Hexadecimal conversion of 15248 ="  + Integer.toHexString(t));
        System.out.println("the octal conversion of 15248 = " + Integer.toOctalString(t));

        int h = 1524;
        int l = 1452;
        System.out.println(Double.max(h,l));

        StringBufferMethods sm = new StringBufferMethods();
        sm.NewMethod();


        StringBufferchar sg = new StringBufferchar();
        sg.Charmethod();


        FindWebsite fw = new FindWebsite();
        fw.Website("http://www.abc.com");



    }
}