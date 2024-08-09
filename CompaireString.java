 class CompaireString {
    public static void main(String[] args) {
        String str  = "This is Exercise6";
        String str1 = "This is Exercise1";
        char ch1;
        char ch;
         
        for(int i=0;i<str.length();i++){

            ch1 = str.charAt(i);}
        for(int j=0;j<str1.length();j++){
              ch = str1.charAt(j); 
    }
   
 if(ch1==ch){
    System.out.println(str+" "+"is equal to"+" "+str1);
}
else if(ch1>ch){
    System.out.println(str+" "+"is grether than"+" "+str1);
}
else if(ch1<ch){
    System.out.println(str+" "+"is less than"+" "+str1);
}

//System.out.println(i);

}
 }
