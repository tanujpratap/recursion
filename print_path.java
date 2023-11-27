public class print_path{
    public static void printpath(int cc,int cr,int ec,int er, String ans){
        if(cr==er && cc==ec){
            System.out.println(ans);
            return;
        }
        if(cr>er || cc>ec){
            return ;
        }
printpath(cc+1,cr,ec,er,ans+"H");
printpath(cc,cr+1,ec,er,ans+"V");
    }
    public static void main(String []args){
        int m=3;
        int n=3;
printpath(0,0,m-1,n-1,"");
    }
}