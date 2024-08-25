class carModel{
    String model;
    String colour;
    int price;

    carModel(){
        System.out.println("Inside the constructor.");
         model = "Tata";
        colour = "Black";
        price = 1000000;
    }
    carModel(String modelName, String color){
        System.out.println("Inside the parameterized constructor.");
        model = modelName;
        colour = color;
    }

    void drive(){ System.out.println("Zzzzz...... Zzzz....");}
    void stop(){ System.out.print("damallllllllll....");}

}

public class Car {
    public static void main(String[] args){
        carModel c1 = new carModel("Hyundai","Silver");
        carModel c2 = new carModel();

        System.out.println(c1.model);
        System.out.println(c1.price);

        System.out.println(c2.model);
        System.out.println(c2.price);

    }
}

