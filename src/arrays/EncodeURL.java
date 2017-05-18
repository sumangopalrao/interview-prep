package arrays;

public class EncodeURL {
   
   public static String enc(String in, int len) {
       char[] out = new char[len];
       int j=0;
       for(int i=0; i<in.length(); i++) {
            if(in.charAt(i) == ' ') {
                out[j] = '%';
                out[j+1] = '2';
                out[j+2] = '0';
                j+=3;
            }
            else {
                out[j++] = in.charAt(i);
            }
       }
       return new String(out);
   }

    public static void main(String[] args) {
        System.out.println(enc(args[0], Integer.parseInt(args[1])));
    }
}
