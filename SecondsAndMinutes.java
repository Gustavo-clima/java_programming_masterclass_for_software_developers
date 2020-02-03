public class SecondsAndMinutes
{
    public static String getDurationString(int minutes, int seconds)
    {
        if(minutes < 0 || (seconds < 0 || seconds > 59))
        {
            return "Invalid Value";
        }

        int hours = 0;

        if(minutes >= 60)
        {
            hours += minutes / 60;
            minutes = minutes % 60;
        }
        return String.format("%dh %dm %ds", hours, minutes ,seconds);
    }

    public static String getDurationString(int seconds)
    {
        if(seconds < 0)
        {
            return "Invalid Value";
        }

        int minutes;

        minutes = seconds / 60;
        seconds %= 60;

        return getDurationString(minutes, seconds);
    }

    public static void main(String[] args) 
    {
        System.out.println(getDurationString(65, 45)); 
        System.out.println(getDurationString(7200));
    }
}