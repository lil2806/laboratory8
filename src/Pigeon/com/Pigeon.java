package Pigeon.com;

public class Pigeon extends Bird implements AnimalMove, Animalmanner{
    private String specieskama57094;

    @Override
    public void sleep() {
        System.out.println("Zuuu");
    }

    @Override
    public void movekama57094() {
        System.out.println("Pigeon is flying");
    }

    Pigeon(){
        super();
        specieskama57094="NN";
    }

    public Pigeon(String namekama57094, int agekama57094, int weightkama57094, String featherColorkama57094, String specieskama57094){
        super(namekama57094, agekama57094, weightkama57094,featherColorkama57094);
        this.specieskama57094= specieskama57094;
    }

    public Pigeon(int agekama57094, String featherColorkama57094, String specieskama57094){
        super(agekama57094, featherColorkama57094);
        this.specieskama57094=specieskama57094;
    }

    public void peckingWoodkama57094(){
        System.out.println("The Pigeon is pecking wood");
    }

    @Override
    public void getVoicekama57094() {
        System.out.println("The Pigeon chirps");
    }

    @Override
    public void eatkama57094(String FoodName) {
        System.out.println("The Pigeon is eating: "+ FoodName);
    }

    public String getSpecieskama57094() {
        return specieskama57094;
    }

    public void setSpecieskama57094(String specieskama57094) {
        this.specieskama57094 = specieskama57094;
    }

    @Override
    public String toString() {
        return "Pigeon{" +
                "specieskama57094='" + specieskama57094+ '\'' +
                '}';
    }
}