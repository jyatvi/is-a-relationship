import java.util.ArrayList;
/**
 * Band is a subclass of Extracurricular.
 * @author (your name)
 */
public class Band extends Extracurricular
{
    //encapsulated fields
    private ArrayList<String> instruments;
    private ArrayList<Integer> numPlayers;
    private String directorName;


    /**
     * Constructor for objects of class Band
     */
    public Band() //default constructor
    {
        super();
        instruments=new ArrayList<String>();
        numPlayers=new ArrayList<Integer>();
        directorName="Sean McAnally";
    }

    public Band(ArrayList<String> i, ArrayList<Integer> nP, String dN)  //overloading constructor with parameters for Band fields only
    {
        // initialise instance variables
        super();
        instruments=i;
        numPlayers=nP;
        directorName=dN;
    }

    public Band(int h, int m, ArrayList<String> i, ArrayList<Integer> nP, String dN) //overloading constructor with parameters for fields of Band and Extracurricular
    {
        super(h, m);
        instruments=i;
        numPlayers=nP;
        directorName=dN;
    }

    public void addPlayer(String instr){ //Adds player of given instrument. If player of
        for (int i=0; i<instruments.size(); i++){
            if (instruments.get(i).equals(instr)){
                int currNumPlayers=numPlayers.get(i);
                numPlayers.set(i, currNumPlayers+1);
                super.setMembers(super.getMembers()+1);
                return;
            }
        }
        instruments.add(instr);
        numPlayers.add(1);
        super.setMembers(super.getMembers()+1);
    }

    public String isPlayer(String instr){ //Checks if someone in the Band plays the given instrument
        for (int i=0; i<instruments.size(); i++){
          if (instr.equals(instruments.get(i)) && numPlayers.get(i)>0){
            return("yes :)");
          }
        }
        return("no :(");
    }

    public int amountOfType(String type){ //counts number of instrumentsin instruments list beloning to given category by calling numMatches to count matches between Strings in instrument list and Strings in category lists.
      if (type.equals("woodwind")){
        String[] woodwind={"flute", "oboe", "saxophone"};
        return(numMatches(woodwind));
      }
      else if (type.equals("brass")){
        String[] brass={"horn", "trumpet", "tuba"};
        return(numMatches(brass));
      }
      else if (type.equals("string")){
        String[] string={"guitar", "violin", "yukelale"};
        return(numMatches(string));
      }
      else{//if (type.equals("percussion")){
        String[] percussion={"drum", "xylophone", "gong"};
        return(numMatches(percussion));
      }
    }

    public int numMatches(String[] type){ //finds number of Strings shared by instruments and given array
      int numMatches=0;
      for (int j=0; j<instruments.size(); j++){
        for (int i=0; i<type.length; i++){
          if (type[i].equals(instruments.get(j))){
            numMatches+=numPlayers.get(j);
          }
        }
      }
      return(numMatches);
    }

    //accessor methods
    public int getHours(){
      return(super.getHours());
    }

    public int getMembers(){
      return(super.getMembers());
    }

    public String getDirectorName(){
        return(directorName);
    }

    public ArrayList<String> getInstruments(){
      return(instruments);
    }

    public ArrayList<Integer> getNumPlayers(){
      return(numPlayers);
    }

    //modifier methods
    public void setHours(int h){
      super.setHours(h);
    }

    public void setMembers(int m){
      super.setMembers(m);
    }

    public void setDirectorName(String d){
        directorName=d;
    }

    public void setInstruments(ArrayList<String> i){
        instruments=i;
    }

    public void setNumPlayers(ArrayList<Integer> nP){
      numPlayers=nP;
    }

    //returns String containing all fields of Band and Extracurricular, so that this String can be printed with S.o.pl(object of this class);
    public String toString(){
      return(super.toString()+", instruments: "+instruments+", number of players for each instrument: "+numPlayers+", director: "+directorName);
    }



}
