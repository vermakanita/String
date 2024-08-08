public class ReplaceString {
    public static void main(String[] args) {
        String str= "this is a String";
        String [] strAr= str.split("\\s");
        
        for(int i=0;i<strAr.length;i++){
            if(strAr[i].equalsIgnoreCase("String"))
            {
                strAr[i]= "java";
            }}
            String newstr ="";
            newstr=strAr+" "; 
    for(int i=0;i<strAr.length;i++){
    System.out.println(newstr);
}
    }}
