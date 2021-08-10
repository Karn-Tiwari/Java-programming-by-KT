/*package com.company;

public class KT_37_scope_method {
    public static void main(String[] args) {// the i is behaving local variable for seperate class or different scope
        int i;
    }

        public static void method1(String[] args) {
        int i;
}
}
 */

package com.company;

import javax.imageio.stream.ImageInputStream;

public class KT_37_scope_method {

    static int logic(int x , int y) {
        int z;
        if (x > y) {
            z = x + y;
        }
        else {
            z = (x + y) * 5;
        }
            return z;
        }
        public static void main(String[] args){

            System.out.println("Karn");
            int a = 5;
            int b = 8;
            int c;
            c = logic(a, b);
            int a1 = 2;
            int b1 = 1;
            int c1;
            c1 = logic(a1, b1);
            System.out.println(c);
            System.out.println(c1);
        }

}

//  The value from the method call(a, b0 are copied to the a and b of the function
//my sum . Thus even if we modify the values a and b inside the method , the values in the public static void main(String[]args){
 //       method will not change
