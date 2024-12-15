let n=121;
let x=n;
let rem,mul,res=0;

  while (n>=0){
    rem = n%10;
    res=(rem*10)+res;
    n=n/10;

  }
  if(n==x){
    console.log("polindrome");
  }
  else{
    console.log("not polindrome")
  }
  console.log("hello")