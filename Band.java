import java.util.ArrayList;
/**
 * Write a description of class Band here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Band extends Extracurricular
{
    // instance variables - replace the example below with your own
    ArrayList<String> instruments;
    ArrayList<Integer> numPlayers;
    String directorName;



    /**
     * Constructor for objects of class Band
     */
    public Band()
    {
        // initialise instance variables
        super();
        instruments=new ArrayList<String>();
        numPlayers=new ArrayList<Integer>();
        directorName="Sean McAnally";
    }

    public Band(ArrayList<String> i, ArrayList<Integer> nP, String dN)
    {
        // initialise instance variables
        super();
        instruments=i;
        numPlayers=nP;
        directorName=dN;
    }

    public Band(int h, int m, ArrayList<String> i, ArrayList<Integer> nP, String dN)
    {
        // initialise instance variables
        super(h, m);
        instruments=i;
        numPlayers=nP;
        directorName=dN;
    }

    public void addPlayer(String instr){
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

    public String isPlayer(String instr){
        for (int i=0; i<instruments.size(); i++){
          if (instr.equals(instruments.get(i)) && numPlayers.get(i)>0){
            return("yes :)");
          }
        }
        return("no :(");
    }

    public int amountOfType(String type){
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

    public int numMatches(String[] type){
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

    public String toString(){
      return(super.toString()+", instruments: "+instruments+", number of players for each instrument: "+numPlayers);
      //return(", Instruments: "+instruments+", Number of Players for Each Instrument: "+numPlayers);
    }



}
