import java.util.Scanner;

class MyPattern{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}
class MyRegex {
    final String pattern = "^((25[0-5]|2[0-4][0-9]|1[0-9][0-9]|0?[1-9][0-9]|0{0,2}[0-9])\\.){3}(25[0-5]|2[0-4][0-9]|1[0-9][0-9]|0?[1-9][0-9]|0{0,2}[0-9])";
}
//Write your code here