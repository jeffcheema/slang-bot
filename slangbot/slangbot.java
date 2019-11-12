import java.util.Scanner;
/**
 * Write a description of class slangbot here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class slangbot
{
    // instance variables - replace the example below with your own
    private int x;
    public String[][] inputs = {{"hello","hi"}, {"brother", "sister"}, {"food", "meal", "lunch", "breakfast", "dinner"}, {"mother", "mom"}, {"father", "dad"}, {"no"}, {"dog", "cat"}, {"hobby", "hobbies"}, {"sport"}, {"spanish"}, {"age", "old"}, {"coding", "code", "program"}, {"color"}, {"shoes"}, {"god", "jesus", "christ", "bible"}, {"book" ,"article"}, {"clothing","shirt","pants"}, {"money","dollars"}, {"school"}, {"teacher"}, {"person"}, {"amigo","friend"}, {"party", "celebration", "holiday"}, {"religion"}, {"car"}, {"robot","bot"}, {"world", "earth", "continent"}, {"yes","sure","ok"}, {"good bye","bye","adios"}, {"dude"}, {"classes","class"}, {"dream","future"}, {"stupid", "dumb"}, {"games"}, {"store"}, {"computer science"}};
    
    /**
     * Constructor for objects of class slangbot
     */
    
    public slangbot()
    {
    while (true){
    
        Scanner in = new Scanner (System.in);
	String statement = in.nextLine();
	defaults(cleanInput(statement));
	
    }
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String[] cleanInput(String input){
    return input.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");
    }
    public String defaults(String input)
    {
        for (int i=0; i < inputs.length; i++){
        for (int a= 0; a < inputs[i].length; a++){
        if (input.indexOf(inputs[i][a]) >= -1){
        System.out.println(i);
        }
        
        }
        }
        return "";
    }
}
