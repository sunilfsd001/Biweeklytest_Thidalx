class Frogs {
    public static void main(String[] args){
        String s="croakcroak";
        System.out.println(countFrogs(s));
    }
    static int countFrogs(String s){
        int cCount=0,rCount=0,OCount=0,aCount=0,kCount=0;
        int croakCount=0;
        if(s.length()<4)return -1;
        for(int i=0;i<s.length()-3;i++){
            if(s.charAt(i)=='c'){
                if(s.substring(i,i+4).equals("croak")){
                    croakCount++;
                }
            }
        }
        if(croakCount>1)


        return -1;
    }
}
