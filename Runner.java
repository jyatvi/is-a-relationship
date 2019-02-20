import java.util.ArrayList;
public class Runner{

  public static void main(String[] args){
    //extracurr with no params
    Extracurricular extracurricular0=new Extracurricular(); //2 hrs, 30 members
    System.out.println("Does this extracurricular get you into college? "+extracurricular0.isCollegeReady());
    System.out.println(extracurricular0.toString()); //println hours per day, num of mems
    extracurricular0.setHours(5); //5 hrs 30 mems
    System.out.println("Now, does this extracurricular get you into college? "+extracurricular0.isCollegeReady());

    //extracurr with params (hours per day, number of members)
    Extracurricular extracurricular1=new Extracurricular(3,25);  //3 hrs, 25 mems
    extracurricular1.setMembers(15); //3 hrs, 15 members
    System.out.println(extracurricular1.toString()); //println hours per day, num of mems
    System.out.println("Does this extracurricular get you into college? "+extracurricular1.isCollegeReady());

    //at the start otf the year, the band already has 3 guitarists and 2 saxophonists. The director is Ashley Lu.
    //This extracurricular takes 1 hr a day, has 5 members (exluding the director).
    ArrayList<String> instr=new ArrayList<String>();
    instr.add("guitar");
    instr.add("saxophone");
    ArrayList<Integer> nPlayers=new ArrayList<Integer>();
    nPlayers.add(3);
    nPlayers.add(2);
    Band band=new Band(1, 5, instr, nPlayers, "Ashley Lu");

    //add instruments
    for (int i=0; i<5; i++){
      band.addPlayer("saxophone"); //add 5 saxophone players...could pass number of players of given instrument to add to addPlayer method and have loop inside method
      if ((i+1)%2==1){
        band.addPlayer("drum"); //add 3 drum players
      }
      else{
        band.addPlayer("violin"); //add 2 violin players and 2 oboe players
        band.addPlayer("oboe");
      }
    }
    band.addPlayer("yukelale"); //add 1 yukelale player

    //printing "properties"
    System.out.println(band.toString()); //println number of hours per day, number of members, list of instuments, and list of number of players of each instrument
    System.out.println("Is there a saxophone player? "+band.isPlayer("saxophone"));
    System.out.println("Is there a xylophone player? "+band.isPlayer("xylophone"));



    System.out.println("number of string instrument players: "+band.amountOfType("string"));
    System.out.println("number of woodwind instrument players: "+band.amountOfType("woodwind"));
    System.out.println("Does Band get you into college? "+band.isCollegeReady());
  }
}
