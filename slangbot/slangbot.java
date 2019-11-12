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
    public String[][] outputs = {{"wassup.","what’s good.","what’s poppin’"}, {"lemme know more about your siblings bro."}, {"aw bro i love myself some delicious hot dogs now that you mention (input)."}, {"oh yeah, now that you mention your mom, i just wanna say love my mom."}, {"oh, you know my dad went to get milk when i was four and is gone."}, {"why you gotta be so negative?"}, {"that’s super cool. tell me more about your pets."}, {"dope. why do you like (input)."}, {"oh cool, what sports do you play?"}, {"hola mi amigo gracias adios"}, {"back up man, my age is private info."}, {"i am the freshest robot out there bro."}, {"my favorite color is red, how ‘bout you?"}, {"my favorite shoe is the jordan 1. how ‘bout you?"}, {"you ever hear 'jesus is king' by kanye west?"}, {"i don’t read no books lol"}, {"i only wear hypebeast clothing!"}, {"i got tons of it, trust me"}, {"i am already educated, trust"}, {"i am my own teacher"}, {"i am a person yes"}, {"i don’t need any friends my man"}, {"i party every day at my mom’s place homie"}, {"i believe in myself fool"}, {"i only drive hondas"}, {"i am the best bot in the world"}, {"i am the best in this world"}, {"that’s the positivity i am looking for"}, {"alright talk to me when you can"}, {"don’t call me dude, i ain’t your friend"}, {"nah i don’t take classes"}, {"my dream is to become rich and that is about it"}, {"stop talking"}, {"i love to play minecraft my man"}, {"i always go to the gucci store"}, {"that’s my favorite class"}}; 
    /**
     * Constructor for objects of class slangbot
     */
    
    public slangbot()
    {
    while (true){
    
        Scanner in = new Scanner (System.in);
    String statement = in.nextLine();
    String[] cleaned = cleanInput(statement);
    defaults(cleaned);
    
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
    public String defaults(String[] input)
    {
        
        for (int i=0; i < inputs.length; i++){
        for (int a= 0; a < inputs[i].length; a++){
        for (int e=0; e < input.length; e++ ){
        if (input[e].equals(inputs[i][a]) || input[e].equals(inputs[i][a]+"s")){
        System.out.println(outputs[i][0]);
        
        }
        }

        
        }
        }
        return "";
    }
}
