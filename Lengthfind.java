public class Lengthfind {
    public static void main(String[] args) {
        String str = "kanita";
        int count=0;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch!=0){
                count++; 
            }
        }
        System.out.println(count);
    }
}
