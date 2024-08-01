//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import javax.swing.JFrame;

public class FractalRunner extends JFrame {

    private static final int WIDTH = 850;
    private static final int HEIGHT = 650;

    public FractalRunner() {
        super( "Fractal Runner" );

        setSize( WIDTH + 40, HEIGHT + 40 );

        getContentPane().add( new Gasket() );
        //getContentPane().add(new Carpet());

        setVisible( true );
        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    }

    public static void main( String args[] ) {
        FractalRunner run = new FractalRunner();
    }
}
