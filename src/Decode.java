import java.util.*;
public class Decode {
    public static void main(String[] args){

//        To be solved

        String str="124871217";
        int oDigit=0;
        int tDigit=0;
        for(int i=0;i<str.length();i++){
            int sDigit=Integer.parseInt(str.substring(i,i+1));
            if(sDigit>0){
                oDigit++;
            }
            if(i<str.length()-1) {
                int dDigit = Integer.parseInt(str.substring(i, i + 2));
                if(dDigit>=10 && dDigit<=26){
                    tDigit++;
                }
            }
        }
        System.out.println(oDigit+" "+tDigit);
    }
}
