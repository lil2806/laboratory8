package BlowFish.com;

public class BlowFish extends Fish implements Animalmanner, AnimalMove{
    private int diameterkama57094;

    BlowFish(){
        super();
        diameterkama57094=10;
    }

    public BlowFish(String namekama57094String , int agekama57094 , int weightkama57094, String scaleColorkama57094, int diameterkama57094){
        super(namekama57094String,agekama57094,weightkama57094,scaleColorkama57094);
        this.diameterkama57094=diameterkama57094;

    }

    @Override
    public void movekama57094() {
        System.out.println("Blowfish is swimming");
    }

    @Override
    public void sleep() {
        System.out.println("Zuuu");
    }

    public BlowFish(int agekama57094, String scaleColorkama57094, int diameterkama57094){
        super(agekama57094, scaleColorkama57094);
        this.diameterkama57094=diameterkama57094;
    }

    public void swimkama57094(){
        System.out.println("The BlowFish is swimming upstream");
    }

    @Override
    public void eatkama57094(String FoodName) {
        System.out.println("The BlowFish is eating: "+ FoodName);
    }

    @Override
    public void getVoicekama57094() {
        System.out.println("The blowfish is howling");
    }

    public int getDiameterkama57094() {
        return diameterkama57094;
    }

    public void setDiameterkama57094(int diameterkama57094) {
        this.diameterkama57094 = diameterkama57094;
    }

    @Override
    public String toString() {
        return "BlowFish{" +
                "diameterkama57094=" + diameterkama57094 +
                '}';
    }
}