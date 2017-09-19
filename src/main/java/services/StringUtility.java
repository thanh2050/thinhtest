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
            // làm sao biết đối xứng là từ Symmetry. bấm từ đối xứng vào google dịch nó ra từ này.
            // co thê tìm các cách làm khác khi search theo từ khóa Symmetry string java , chọn 1 kết quả mình thích rồi test lại.
            // huong lam la chia doi chuoi. sau do so sanh chuoi 1 voi chuoi nguoc cua chuoi 2 thu co bang nhau ko neu bang nhau thi doi xuong

            double halfLength = (double) input.length() / 2;
            int top = (int)Math.ceil(halfLength);
            int bottom = (int)Math.floor(halfLength);

            String firstHalf = input.substring(0, bottom);
            String secondHalf = input.substring(top, input.length());

            String reverse2 = new StringBuffer(secondHalf).reverse().toString();
            if (firstHalf.equals(reverse2))
            {
                result = true;
            }

        }
        catch (Exception ex)
        {
            // log error
        }
        return result;
    }

}
