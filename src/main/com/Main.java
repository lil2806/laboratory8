package main.com;

public class Main {

    public static void main(String[] args) {

        Animal animal[]= new Animal[6];

        animal[0]=new Mammal("Little brown",2,3,"Bat");
        animal[1]=new Dog("Tom",3,16,"Carnivora","German Shepard");
        animal[2]=new Fish("CatFish",2,1,"Yellow");
        animal[3]=new BlowFish("Kevin",2,5,"Purple",10);
        animal[4]=new Bird("Falcon",4,10,"Brown");
        animal[5]=new Pigeon("Smith",3,4,"Grey","Argentina");

      /*  animal[2].getVoicekama57094();
        animal[4].getVoicekama57094();
*/


        Animalmannner animalmanner[] = new Animalmanner[3];
        animalmanner[0]= new Dog("hello",14,"zaki","Bulldog");
        animalmanner[1]= new Pigeon("Me",5,"pink","mommy");
        animalmanner[2]= new BlowFish("Fish",4,1,"yellow");


        animalmanner[0].sleep();
        animalmanner[1].sleep();
        animalmanner[2].sleep();


        for (Animal b: animal){
            b.movekama57094();
        }

        for (Animal b: animal) {
            AnimalName.name(b.getNamekama57094());
        }

    }


}
