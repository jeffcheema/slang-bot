import java.util.Scanner;
import java.util.Random; 
/**
 * Write a description of class slangbot here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class slangbot
{
    // instance variables - the different inputs and outputs 
    private int x;
    public String[][] inputs = {{"hello","hi"}, {"brother", "sister"}, {"food", "meal", "lunch", "breakfast", "dinner"}, {"mother", "mom"}, {"father", "dad"}, {"no"}, {"dog", "cat"}, {"hobby", "hobbies"}, {"sport"}, {"spanish"}, {"age", "old"}, {"coding", "code", "program"}, {"color"}, {"shoes"}, {"god", "jesus", "christ", "bible"}, {"book" ,"article"}, {"clothing","shirt","pants"}, {"money","dollars"}, {"school"}, {"teacher"}, {"person"}, {"amigo","friend"}, {"party", "celebration", "holiday"}, {"religion"}, {"car"}, {"robot","bot"}, {"world", "earth", "continent"}, {"yes","sure","ok"}, {"good bye","bye","adios"}, {"dude"}, {"classes","class"}, {"dream","future"}, {"stupid", "dumb"}, {"games"}, {"store"}, {"computer science"}};
    public String[][] outputs = {{"wassup.","what’s good.","what’s poppin’"}, {"lemme know more about your siblings bro."}, {"aw bro i love myself some delicious hot dogs now that you mention (input)."}, {"oh yeah, now that you mention your mom, i just wanna say love my mom."}, {"oh, you know my dad went to get milk when i was four and is gone."}, {"why you gotta be so negative?"}, {"that’s super cool. tell me more about your pets."}, {"dope. why do you like (input)."}, {"oh cool, what sports do you play?"}, {"hola mi amigo gracias adios"}, {"back up man, my age is private info."}, {"i am the freshest robot out there bro."}, {"my favorite color is red, how ‘bout you?"}, {"my favorite shoe is the jordan 1. how ‘bout you?"}, {"you ever hear 'jesus is king' by kanye west?"}, {"i don’t read no books lol"}, {"i only wear hypebeast clothing!"}, {"i got tons of it, trust me"}, {"i am already educated, trust"}, {"i am my own teacher"}, {"i am a person yes"}, {"i don’t need any friends my man"}, {"i party every day at my mom’s place homie"}, {"i believe in myself fool"}, {"i only drive hondas"}, {"i am the best bot in the world"}, {"i am the best in this world"}, {"that’s the positivity i am looking for"}, {"alright talk to me when you can"}, {"don’t call me dude, i ain’t your friend"}, {"nah i don’t take classes"}, {"my dream is to become rich and that is about it"}, {"stop talking"}, {"i love to play minecraft my man"}, {"i always go to the gucci store"}, {"that’s my favorite class"}}; 
    /**
     * Constructor for objects of class slangbot
     * It reads all input and looks for an appropriate response 
     */
    
    public slangbot()
    {
    while (true){
    
        Scanner in = new Scanner (System.in);
    String statement = in.nextLine();
    String[] cleaned = cleanInput(statement);
    String response = defaults(cleaned);
    if (response.equals("")){
    String[] res = {"idk what you saying bru", "IDK DO YOU??", "smh relatable", "dont talk to me :(", "I love you too <3", "hey yo that is cool factiods", "smh what are you doing please dont"};
    System.out.print(res[getRandomNumberInRange(0,res.length-1)]);
    
    }
    else{
    System.out.print(response);
    }
    
    }
    }
    
    /**
     * Generates a random number in a given interval 
     *
     * @param  min  minimum of the random range
     * @param  max  maximum of the random range
     * @return    a random number between min and max
     */
    private static int getRandomNumberInRange(int min, int max) {

		if (min >= max) {
			throw new IllegalArgumentException("max must be greater than min");
		}

		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	}
    /**
     * Removes punctuation and lower cases everything then splits on spaces  
     *
     * @param  string to be cleaned  
     * @return   cleaned string list 
     */	
    public String[] cleanInput(String input){
    return input.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");
    }
    /**
     * Removes punctuation and lower cases everything then splits on spaces  
     *
     * @param  cleaned string list 
     * @return   response
     */	
    public String defaults(String[] input)
    {
        
        for (int i=0; i < inputs.length; i++){
        for (int a= 0; a < inputs[i].length; a++){
        for (int e=0; e < input.length; e++ ){
        if (input[e].equals(inputs[i][a]) || input[e].equals(inputs[i][a]+"s")){
        return outputs[i][getRandomNumberInRange(0,outputs[i].length - 1)];
        
        }
        }

        
        }
        }
        return "";
    }
}
