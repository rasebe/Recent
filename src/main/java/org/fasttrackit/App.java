package org.fasttrackit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception {

        Race race = new Race();
        race.setTrackLength(200);
        race.setTrackFuelLevel(50);

        race.start();


    }
}
