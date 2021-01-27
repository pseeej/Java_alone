public class Casting {
    public static void main(String[] args) {
        double a = 1.1;
        double b = 1;
        double b2 = (double)1;
        System.out.println(b);  //1->1.0 실수(real number)로 converting됨

        //  int c = 1.1;    //cannot convert from double to int.
        double d = 1.1;
        int e = (int) 1.1;
        System.out.println(e);  //1.1을 강제로 1로 만들어줌. 0.1 손해

        // 1 to String
        String f = Integer.toString(1);
        System.out.println(f.getClass());   //int->string 형변환

    }
}
