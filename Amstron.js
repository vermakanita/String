let n=153
// let rem = 1;
let rev=0;
let rem;
let t=n;

while(n>0){
     rem = n%10;
    // rev= rev+rem*rem*rem 
    rev=rev+Math.pow(rem,4)
    n=parseInt(n/10);

}
if(t===rev){
    console.log("y")
}else{
console.log("n")
}