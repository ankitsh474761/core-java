public class precedence {
    public static void main(String[] args) {
        int a = 10, b = 5, c = 1, result;
        result = a-c++-b++;

        System.out.println(result);
//        int d = 3;
//        int e =9;
//        int i=8;
//        int k=(d*e)+(d-i);//27-5=22
//        int l= (d+e);
//        System.out.println(k);
//        int j=d*e+e-i+(d+e);
//        System.out.println(j);
        char ch ='c';
        char chd='d';
        System.out.println("difference of characters is");
        System.out.println(ch-chd);
        System.out.println(ch+chd);
        System.out.println(ch);
        ch++;
        System.out.println(ch);

        int A=3;
        int B=9;
        boolean C = true;
        int D=9;
        System.out.println(!(A>B));//true
        System.out.println(~A);
       System.out.println(~A);//-4
        System.out.println(A*B);
        System.out.println(!C);
        System.out.println(A*B+D);//27+9=36
        System.out.println(A/B+D);//0+9=9
        System.out.println(B/A+D);//3+9=12
        System.out.println(B%A+D);//0+9=9
        System.out.println(~(B%A+D));//0+9=9=-10
        System.out.println(B+A-A);//9+3-3
        int n=5;
        n>>=2;//right shift operator
        System.out.println(n);//1
        int m =5;
        m<<=2;//left shift operator
        System.out.println(m);//20
        int u =5;
        int s =u>>>2;
        System.out.println(s);//unsigned right shift ans is 1
        System.out.println(A>B);
        System.out.println(A<=B);//3 <=9 and ans is true
        System.out.println(A!=B);//true
        System.out.println(A==B);
        System.out.println(A&B|D);//A=3and B=9and D=9
        System.out.println(A^B);
        System.out.println(8>7&&3<9||3>8);
        int h=90;
         h+=10;
        System.out.println(h);


    }
}
