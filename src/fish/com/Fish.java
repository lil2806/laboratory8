package fish.com;


public class Fish extends Animal implements Animalmanner,AnimalMove{
    private String scaleColorkama57094;

    public Fish(){
        super();
        scaleColorkama57094= "NN";
    }

    public Fish(String namekama57094, int agekama57094 , int weightkama57094, String scaleColorkama57094){
        super(namekama57094, agekama57094, weightkama57094);
        this.scaleColorkama57094= scaleColorkama57094;
    }

    public Fish(int agekama57094 , String scaleColorkama57094){
        super(agekama57094);
        this.scaleColorkama57094=scaleColorkama57094;
    }

    public void drinkWaterkama57094(){
        System.out.println("Gulp gulp");
    }

    @Override
    public void getVoicekama57094() {
        System.out.println("Fish is making sounds");
    }

    @Override
    public void sleep() {
        System.out.println("Zuuu");
    }

    @Override
    public void movekama57094() {
        System.out.println("Fish is swimming");
    }

    @Override
    public void eatkama57094(String FoodName) {
        System.out.println("Fish is eating: "+ FoodName);
    }

    public String getScaleColorkama57094() {
        return scaleColorkama57094;
    }

    public void setScaleColorkama57094(String scaleColorkama57094) {
        this.scaleColorkama57094 = scaleColorkama57094;
    }

    @Override
    public String toString() {
        return "Fish{" +
                "scaleColorkama57094='" + scaleColorkama57094 + '\'' +
                '}';
    }
}