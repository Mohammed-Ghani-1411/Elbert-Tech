public class Reverse
{
    //CREATING A REVERSE CODE

    public static void main(String[] args)
{
        String txt= "Mohammed Abdul ghani";
        String rev= "";
        for(int i = 0;i < txt.length();i++)
        {
            rev = txt.charAt(i)+rev;
        }
                System.out.println("Reverse String:"+rev);

    }
}
