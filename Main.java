package SDA;

public class Main {

    public static void main ( String[] args ) {
        Bicycle bicycle = new Bicycle ( 5, 6, 7 )

        {
        };
        MountainBike mountainBike = new MountainBike ( 12, 23, 45, 56 ) {
        };
        System.out.println ( mountainBike.speed + mountainBike.cadence + mountainBike.gear );
        System.out.println ( bicycle.speed + bicycle.cadence + bicycle.gear );
        System.out.println ( "----------------------" );

        Cat myCat = new Cat ();
        Animal myAnimal = myCat;
        Animal.testClassMethod ();
        myAnimal.testInstanceMethod ();
        System.out.println ( "-----------------------" );
        //myCat.equals ( 4 );

        Cirlce cirlce = new Cirlce ();
        cirlce.draw ();
        cirlce.resize ();
        Rectangle rectangle = new Rectangle ();
        rectangle.draw ();
        rectangle.resize ();
/*            @Override
            void draw () {
                Cirlce cirlce = new Cirlce ();
                cirlce.draw ();
            }

            @Override
            void resize () {

            }
            Cirlce cirlce = new Cirlce ();



        };*/
    }
}

