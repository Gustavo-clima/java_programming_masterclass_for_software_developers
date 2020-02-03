public class MegaBytesConverter
{
    public static void printMegaBytesAndKiloBytes(int kilobytes)
    {
        if(kilobytes < 0)
        {
            System.out.println("Invalid Value");
        }
        else
        {
            System.out.printf("%d KB = %d MB and %d KB", kilobytes, (kilobytes / 1024), (kilobytes % 1024));
        }
    }

    public static void main(String[] args) {
        
    }
}