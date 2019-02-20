
/**
 * Write a description of class Extracurricular here.
 *
 * @author Ashley Lu, Jessica Yatvitskiy
 * @version 1.0
 */
public class Extracurricular
{
    private int hoursPerDay;
    private int members;

    /**
     * Constructor for objects of class Extracurricular
     */
    public Extracurricular()
    {
        hoursPerDay = 2;
        members = 20;
    }

    public Extracurricular(int h, int m)
    {
        hoursPerDay = h;
        members = m;
    }

    public int getHours()
    {
        return hoursPerDay;
    }

    public int getMembers()
    {
        return members;
    }

    public void setHours(int h)
    {
        hoursPerDay = h;
    }

    public void setMembers(int m)
    {
        members = m;
    }

    public String isCollegeReady()
    {
        if (hoursPerDay > 2)
            return "yes :)";
        else
            return "no :(";
    }

    public int successRate() //we can also do hoursPerDay/hoursPerDayOprimal (not total)
    {
        int hoursPerDayTotalOptimal = 50;
        if (hoursPerDay * members / hoursPerDayTotalOptimal > 1)
            return 100;
        else
            return hoursPerDay * members / hoursPerDayTotalOptimal * 100;
    }

    public String toString(){
      return("hours per day: " + hoursPerDay + ", members: " + members);
    }
}
