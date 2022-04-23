package Mammal.com;

public class Mammal extends Animal implements AnimalMove,AnimalName {

    private String orderkama57094;

    public Mammal(){
        super();
        orderkama57094 = "NN";
    }

    public Mammal(String namekama57094, int agekama57094 , int weightkama57094, String orderkama57094){
        super(namekama57094, agekama57094, weightkama57094);
        this.orderkama57094=orderkama57094;
    }

    public Mammal(int agekama57094, String orderkama57094){
        super(agekama57094);
        this.orderkama57094=orderkama57094;
    }

    @Override
    public void movekama57094() {
        System.out.println("Mammal is moving ");
    }

    public void drinkMilkkama57094(){
        System.out.println("Gulp gulp");
    }


    @Override
    public void getVoicekama57094() {
        System.out.println("Mammal is making sounds");
    }

    @Override
    public void eatkama57094(String FoodName) {
        System.out.println("Mammal is eating: " + FoodName);
    }

    public String getOrderkama57094() {
        return orderkama57094;
    }

    public void setOrderkama57094(String orderkama57094) {
        this.orderkama57094= orderkama57094;
    }

    @Override
    public String toString() {
        return "Mammal{" +
                "orderkama57094='" + orderkama57094 + '\'' +
                '}';
    }
}