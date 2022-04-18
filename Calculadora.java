
/**
 * Write a description of class Calculador here.
 * 
 * @author Roberto Salazar Marquez
 * @version 1.0
 */
import java.awt.*;

public class Calculadora extends Frame
{
    // Variables de Instancia 
    private Button b1, b2, b3,b4, b5, b6, b7, b8, b9;
    private Button b10, b11, b12, b13, b14, b15, b16, b17;
    private TextField display;
    private Panel teclado, displ;

    /**
     * Constructor para objetos de la clase Calculador
     */
    public Calculadora()
    {
        super("Calculadora");
        
        b1 = new Button("1");  b2 = new Button("2");
        b3 = new Button("3");  b4 = new Button("4");
        b5 = new Button("5");  b2 = new Button("6");
        b7 = new Button("7");  b8 = new Button("8");
        b9 = new Button("9");  b10 = new Button("0");
        b11 = new Button("+");  b12 = new Button("-");
        b13 = new Button("*");  b14 = new Button("/");
        b15 = new Button("=");  b16 = new Button(".");
        b17 = new Button("C"); 
        
        display = new TextField("0");
        teclado = new Panel();
        displ = new Panel();
        
        add(display);
    }
    
    public boolean handleEvent(Event e) {
        if(e.id == Event.WINDOW_DESTROY) {
            hide();
            dispose();
            return true;
        }
        return super.handleEvent(e);
    }
    
    public static void main(String arg[]) {
        Calculadora calc = new Calculadora();
        calc.resize(300,350);
        calc.show();
        
    }
    
    
}




