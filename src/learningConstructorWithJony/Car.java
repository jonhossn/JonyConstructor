package learningConstructorWithJony;

public class Car {
     static int modelYear ;
    static String modelName;


    public Car(int year, String name){//1969----toyota
        this.modelYear=year;//1969
        this.modelName=name;//toyota
       // System.out.println(this.modelYear+ " "+ this.modelName);

    }

    public static void main(String[] args) {
        Car mycar = new Car(1969,"toyota");// this is called passing argument.
        System.out.println(modelYear+ modelName);
    }







}
