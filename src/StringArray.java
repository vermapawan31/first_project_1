public class StringArray {

    public static void main(String[] args) {
        String [] week={"sunday", "monday","tuesday","wedenesday","thursday","friday","saturday"};


        int length=0;
        int longest=0;
        String w="null";
        for(String wk:week){
            length=wk.length();

            if(longest<length){
                longest=length;
                w=wk;
            }
            System.out.println(wk +"has length " + length);
            System.out.println(w +" has longest length is "+ longest);
        }
     //   System.out.println(length);

    }
}
