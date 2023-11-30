public class letter_combination {
    public static void main(String[] args) {
        String ques="23";
     printanswer(ques,"");

    }
    static String[]code={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public static void printanswer(String ques,String ans){
        if(ques.length()==0){
            System.out.println(ans+"");
            return ;
        }
        char ch=ques.charAt(0);
        String press=code[ch-48];
        for(int i=0;i<press.length();i++){
            printanswer(ques.substring(1),ans+press.charAt(i));
        }

    }
    
}
