public class TeenNumberChecker
{
    public static boolean isTeen(int par)
    {
        if(par >= 13 && par <= 19)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static boolean hasTeen(int par1, int par2, int par3)
    {  
        int[] parameters = new int[]{par1, par2, par3}; 
        boolean teen = false;

        for(int currentPar : parameters)
        {
            teen = isTeen(currentPar);

            if(teen)
            {
                return true;
            }
        }

        return false;
    }
}