package learningConstructorWithJony;

public class JonyConstructor {// class start
    String name;
    int age;

   public JonyConstructor(){// this is default
       System.out.println("ny");
   }
   public JonyConstructor(String name) {// my argument is here now"jony"
       this.name = name;//jony
       System.out.println(this.name);
   }
    public JonyConstructor(String name, int age) {// rony----34
        this.name = name; //rony
        this.age= age;// 34
        System.out.println("name"+this.name+"age "+ this.age);

    }
    public JonyConstructor( int age, String name) {
        this.age = age;
        this.name= name;
        System.out.println("name "+this.age+" age "+ this.name);
    }


    public static void main(String[] args) {
        JonyConstructor obj= new JonyConstructor();// this is to create object
        JonyConstructor obj2= new JonyConstructor(" jony");// passing argument
        JonyConstructor obj3= new JonyConstructor("rony",34);
        JonyConstructor obj4= new JonyConstructor(22,"james bond");

        }
    }



