public class lab {
    public static void main(String[] args)
    {

        String s="java class";
        System.out.println("String length=" +s.length());

        System.out.println("using charAt method Character at 3rd position= "  +s.charAt(3));

        System.out.println("Substring=" +s.substring(3));
        System.out.println("Substring="  +s.substring(2,4));

        String s1="Hello";
        String s2="World";
        System.out.println("Concatenated string="  +s1.concat(s2));

        String s3="  Core Java Lab  ";
        System.out.println("Index of Java="   +s3.indexOf("Java"));
        System.out.println("Index of  o ="   +s3.indexOf('o',3));

        String s4="HimAChAL";
        System.out.println("using lowercase String=" +s4.toLowerCase());

        String s5="India";
        System.out.println("using uppercase String=" +s5.toUpperCase());

        System.out.println("using trim String= " +s3.trim());

        String s6="Bhagwan";
        System.out.println("Replacing 'n' to 'N'= " +s6.replace('n','N'));

        String s7="PROGRAMMING";
        System.out.println("Equalityof's7'with\"PROGRAMMING\"="+s7.equalsIgnoreCase
                ("PROGRAMMING"));

        System.out.println("using equal of string "+s7.equals("programming"));



    }
}
