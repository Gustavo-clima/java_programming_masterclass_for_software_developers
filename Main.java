public class Main
{
    public static void main(String[] args) 
    {
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        
        System.out.println("Float minimum value = " + myMinFloatValue);
        System.out.println("Float maximum value = " + myMaxFloatValue);


        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        
        System.out.println("double minimum value = " + myMinDoubleValue);
        System.out.println("double maximum value = " + myMaxDoubleValue);

        int myIntValue = (5 / 3);
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5.0d / 3.0d;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);

        //1 Kg = 0,45359237 pounds
        //3 kg = x
        double numberOfPounds = 3d;
        double kilogramPerPound = (1d / 0.45359237d);
        double kilogram = numberOfPounds * kilogramPerPound;

        System.out.println("3 pounds is equivalent to " + kilogram + " kilograms");

        double pi = 3.1415927d;
        double anotherNumber = 3_000_000.4_567_890d;
        System.out.println(pi);
        System.out.println(anotherNumber);

    }
}