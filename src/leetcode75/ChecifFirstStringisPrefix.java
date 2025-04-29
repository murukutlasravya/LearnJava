package leetcode75;

public class ChecifFirstStringisPrefix {

    public static void main(String[] args) {

        String str[] = {"flower", "flow", "flight"};

        String prefix = str[0];


        for(int i=1;i<str.length;i++){

            while(!prefix.isEmpty()){
                if(str[i].startsWith(prefix)){
                    break;
                } else{
                    prefix = prefix.substring(0,prefix.length()-1);
                    System.out.println("Printing trimmed prefix: " +prefix);
                }
            }

        }

        if(prefix!=null){
            System.out.println("Ending Prefix: " +prefix);
        }

    }
}
