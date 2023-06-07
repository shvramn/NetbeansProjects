
package stringbufferbuilder;
public class StringBufferBuilder {

    public static void main(String[] args) {
        String s = new String("Hello");
        StringBuffer sb = new StringBuffer("Hello");
        StringBuilder sb1 = new StringBuilder("Hello");
        
        s.concat("World");
        sb.append("World");
        sb1.append("World");
        
        System.out.println(s);
        System.out.println(sb);
        System.out.println(sb1);
        
    }
    
}
