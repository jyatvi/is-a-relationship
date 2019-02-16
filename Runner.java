public class Runner{

  public static void main(String[] args){
    Band band=new Band();
    Extacurricular extracurricular=new Extrcurricular();
    for (int i=0; i<5; i++){
      band.addPlayer("saxophone"); //add 4 saxophone players...could pass number of players of given instrument to add to addPlayer method and have loop inside method
      if ((i+1)%2==1){
        band.addPlayer("drum"); //add 3 drum players
      }
      else{
        band.addPlayer("violin"); //add 2 violin players
      }
    }
    band.addPlayer("piano");
    band.addPlayer("yukelale");
    band.toString();

  }
}
