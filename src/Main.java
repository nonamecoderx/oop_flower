public class Main {
    public static void main(String[] args) {
        Flower rosa = new Flower(null, "Голландия", 35.59 );
        Flower hrizantema = new Flower(null, null, 15 );
        Flower pion = new Flower(null, "Англия", 69.9 );
        Flower hypsofila = new Flower(null, "Турция", 19.5 );
        hrizantema.lifeSpan = 5;
        pion.lifeSpan = 1;
        printInfo(rosa);
        printInfo(hrizantema);
        printInfo(pion);
        printInfo(hypsofila);

    }
    private static void printInfo (Flower flower){
        System.out.println( "Цвет: "+ flower.getFlowerColor() +
                ", страна: " + flower.getCountry() +
                ", стоимость за штуку: "+ flower.getCost()+
                ", срок стояния: " + flower.lifeSpan );
    }
}