// diffrence b/w loop and iterator
// s , j, itr explain working

package Q3CollectionP;


import java.util.ArrayList;
import java.util.Iterator;

class Student1{
    private String name;
    private int total;
    private int java,c,python;

    Student1(String name, int java,int c,int python){
        this.name= name;
        this.java= java;
        this.c=c;
        this.python= python;
    }
    public String getName(){
        return name;
    }

    int getTotal()
    {
    total = ((java+ c +python)/3);
    //int ang = total/3;
    return total;
    }
    public String toString(){
        return "name" +this.name +"marks"+ (this.java+this.c+this.python)+"avg"+getTotal();
    }
    }
    class Main1{
        public static void main(String args[]){
            ArrayList<Student1> s = new ArrayList<>();
            s.add(new Student1("kanita", 23, 12, 13));
            s.add(new Student1("saloni",90,77,67));
            s.add(new Student1("Harsh",90,90,90));
            s.add(new Student1("Babita",89,89,89));
           // diffrence b/w loop and iterator
            for(Student1 j:s)
            {
                if(j.getName().startsWith("H"))
                {
                    System.out.println(j);
                }
            }
            Iterator<Student1> itr= s.iterator();
            while(itr.hasNext())
            {
                Student1 j=itr.next();
                if(j.getName().startsWith("B")){
                    itr.remove();
                    System.out.println(j);
                }
            }
            //int total=0
            for(Student1 j:s){
                System.out.println(j);
            }
        }
    }



