public class javafile2
{
    public static void main(String[] args)
    {
//use of string length(starting from 1)
        String s="java class";
        System.out.println("String length= " +s.length());

//specification of particular character(starting from 0)
        System.out.println("Character at 3rd position= "  +s.charAt(3));
        System.out.println("Character at 0th position= "   +s.charAt(0));

//use of substrings (starting from 1)
        System.out.println("Substring= " +s.substring(3));
        System.out.println("Substring= "  +s.substring(2,4));

//concatenated strings
        String s1="Hello";
        String s2="World";
        System.out.println("Concatenated string using concat = "  +s1.concat(s2));
        System.out.println("Concatenation using '+' operator = "  +s1+s2);

//index value of a string (starting from 0)
        String s3="Core Java Lab";
        System.out.println("Index of Java= "   +s3.indexOf("Core"));
        System.out.println("Index of  'a'= "   +s3.indexOf('a'));

//use of lowercase
        String s4="HimAChAL";
        System.out.println("Before lowercase = "+s4);
        System.out.println("After  lowercase = "+s4.toLowerCase());

//use of uppercase
        String s5="India";
        System.out.println("Before uppercase = "+s5);
        System.out.println("After  uppercase = "+s5.toUpperCase());

        //trimming of a string
        String s6 = "  hello world ";
        System.out.println("Before trim = "+s6);
        System.out.println("After  trim = "+s6.trim());

        //use of replace
        String s7="Bhagwan";
        System.out.println("Before using replace method= "+s7);
        System.out.println("After  Replacing 'n' to 'N'= " +s7.replace('n','N'));

//use of equalsIgnoreCase
        String s8="PROGRAMMING";
        System.out.println("Equalityof's7'with\"PROGRAMMING\"="+s8.equalsIgnoreCase
                ("PROGRAMMING"));

        //use of equals for comparing two strings
        String s9 = "Programming";
        System.out.println("Using equals method for comparing two strings= "+s9.equals("Programming"));
        System.out.println("Using equals method for comparing two strings= "+s9.equals("PROGRAMMING"));
       //use of startswith(it is case sensitive and returns boolean type)
        String s10 = "Inheritance";
        String s11 = "Inherit";
        String s12 = "inherit";
        System.out.println(s10.startsWith(s11));
        System.out.println(s10.startsWith(s12));

        //use of endswith
        String s13= "Inheritance";
        String s14 = "tance";
        String s15 = "ce";
        System.out.println(s13.endsWith(s14));
        System.out.println(s13.endsWith(s15));

        //use of lastIndexof
        String s16 = "Hello planet earth";
        System.out.println("using lastIndexof = "+s16.lastIndexOf("earth"));

        //use of compare to if equal returns 0 and if not equal -1 and if greater
        String str = "hello";
        System.out.println(str.compareTo("hello"));
        System.out.println(str.compareTo("he"));
        System.out.println(str.compareTo("helloworld"));

    }
}
