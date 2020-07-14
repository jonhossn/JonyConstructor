package learningConstructorWithJony;

public class JonyConstructor {// class start
    String name;
    int age;
    double rate;

   public JonyConstructor(){// this is default
       System.out.println("ny");
   }
   public JonyConstructor(String name) {// my argument is here now"jony"
       this.name = name;//jony
       System.out.println(this.name);
   }
    public JonyConstructor(String name, int age, double rate) {// rony----34
        this.name = name; //rony
        this.age= age;
        this.rate=rate;//
        System.out.println("name"+this.name+"age "+ this.age+" "+this.rate);

    }//
    // int a =;
    public JonyConstructor( int age, String name) {
        this.age = age;
        this.name= name;
        System.out.println(this.age+" age "+ this.name);
    }


    public static void main(String[] args) {
        JonyConstructor obj= new JonyConstructor();// this is to create object
        JonyConstructor obj2= new JonyConstructor(" jony");// passing argument
        JonyConstructor obj3= new JonyConstructor("rony",34,3.4);
        JonyConstructor obj4= new JonyConstructor(22,"james bond");

        }
    }



