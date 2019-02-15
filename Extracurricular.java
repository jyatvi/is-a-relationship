
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
        hoursPerDay = 4;
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
    
    public boolean collegeReadiness()
    {
        if (hoursPerDay > 3)
            return true;
        else
            return false;
    }
    
    public int successRate()
    {
        int hoursPerDayTotal = 50;
        if (hoursPerDay * members / hoursPerDayTotal > 1)
            return 100;
        else
            return hoursPerDay * members / hoursPerDayTotal * 100;
    }
}
