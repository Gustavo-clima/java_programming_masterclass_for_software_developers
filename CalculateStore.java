public class CalculateStore
{   
    public static int calcFeetAndInchesToCentimeters(int feet, int inches)
    {
        // 1 centimeter = 0,393701 inches
        // 1 centimeter = 0,0328084
        if(feet < 0)
        {
            return (-1);
        }

        if(inches < 0 && inches > 12)
        {
            return (-1);
        }

        int feetToCentimeters = (int)(feet / 2.539998628D);
        int inchesToCentimeters = (int)(inches / 30.479999025D);

        return (feetToCentimeters + inchesToCentimeters);
    }

    public static int calcFeetAndInchesToCentimeters(int inches)
    {
        if(inches < 0)
        {
            return (-1);
        }

        
    }
    public static void main(String[] args) 
    {
        
    }
}