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
                numPlayers.set(i, numPlayers.get(i)+1);
                super.setMembers(super.getMembers()+1);
                return;
            }
        }
        instruments.add(instr);
        numPlayers.add(1);
        super.setMembers(super.getMembers()+1);
    }

    public boolean isPlayer(String instr, int i){
        if (i==instruments.size()){
            return(false);
        }

        if (instruments.get(i).equals(instr) &&numPlayers.get(i)>0){
                return(true);
        }

        return(isPlayer(instr, i+1));

    }

    public String getDirectorName(){
        return(directorName);
    }

    public String getInstruments(){
      return(instruments);
    }

    public String getNumPlayers(){
      return(numPlayers);
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
      return("Instruments: "+instruments+", Number of Players for Each Instrument: "+numPlayers);
    }



}
