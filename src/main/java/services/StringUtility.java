package services;

public class StringUtility {

    public static int NumberTimeAppearance(String parrent, String child)
    {
        int result = 0;
        try
        {
            int numberToShow = 0;
            int theLastIndex = 0;
            boolean isDone = false;

            do {
                int temp = parrent.toLowerCase().indexOf(child.toLowerCase(),theLastIndex + 1);
                if(temp != theLastIndex && temp != - 1)
                {
                    theLastIndex = temp;
                    numberToShow ++;
                }
                else
                {
                    isDone = true;
                }
            }
            while (!isDone);

            result = numberToShow;
        }
        catch (Exception ex)
        {
            // log error
        }
        return result;
    }

    public static int NumberTimeAppearance2(String parrent, String child)
    {
        int result = 0;
        try
        {
            int numberToShow = 0;
            for (int i = 0; i < parrent.length(); i++)
            {
                char character = parrent.toLowerCase().charAt(i);
                char firstChildChar = child.toLowerCase().charAt(0);
                if(firstChildChar == character)
                {
                    if(i + child.length() <= parrent.length())
                    {
                        String temp = parrent.toLowerCase().substring(i, i + child.length());
                        if(temp.equals(child.toLowerCase()))
                        {
                            numberToShow ++;
                        }
                    }
                }
            }
        }
        catch (Exception ex)
        {
            // log error
        }
        return result;
    }

    public static boolean IsSymmetry(String input)
    {
        boolean result = false;
        try
        {

        }
        catch (Exception ex)
        {
            // log error
        }
        return result;
    }

}
