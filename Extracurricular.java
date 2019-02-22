/**
 * Extracurricular is a super class of Band.
 * @author Ashley Lu, Jessica Yatvitskiy
 */
public class Extracurricular
{
    private int hoursPerDay;
    private int members;

    public Extracurricular() //default constructor
    {
        hoursPerDay = 2;
        members = 20;
    }

    public Extracurricular(int h, int m) //overloading constructor
    {
        hoursPerDay = h;
        members = m;
    }

    //accessor methods

    public int getHours()
    {
        return hoursPerDay;
    }

    public int getMembers()
    {
        return members;
    }

    //modifier methods

    public void setHours(int h)
    {
        hoursPerDay = h;
    }

    public void setMembers(int m)
    {
        members = m;
    }

    //checks if extracurricular makes you ready for college (checks if extracurricular takes over 2 hrs a day)

    public String isCollegeReady()
    {
        if (hoursPerDay > 2)
            return "yes :)";
        else
            return "no :(";
    }

    //calculates probability of the extracurricular team doing well at an event, calculated by number of hours per day spent by members in total on extracurricular/optimal total number of hours per day

    public double successRate() //we can also do hoursPerDay/hoursPerDayOprimal (not total)
    {
        int hoursPerDayTotalOptimal = 50;
        if (hoursPerDay * members/ hoursPerDayTotalOptimal > 1)
            return 100;
        else
            return hoursPerDay * members / (double) (hoursPerDayTotalOptimal) * 100;
    }

    //returns String of all fields of this class, so that this String can be printed with S.o.pl(object of this class);

    public String toString(){
      return("hours per day: " + hoursPerDay + ", members: " + members);
    }
}
