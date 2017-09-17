public class Test {

    public static void main(String[] args) {
        // Prints "Hello, World" to the terminal window.

        String parrentStr = "có nghĩa là thông báo tin tức. Nên dùng như động từ, không nên dùng như danh từ. Tin tức có thể dùng như danh từ chẳng hạn: tin tức";
        String childStr = "Tin tức";

        int numberToShow = 0;

        for (int i = 0; i < parrentStr.length(); i++)
        {
            char character = parrentStr.toLowerCase().charAt(i);
            char firstChildChar = childStr.toLowerCase().charAt(0);
            if(firstChildChar == character)
            {
                if(i + childStr.length() <= parrentStr.length())
                {
                    String temp = parrentStr.toLowerCase().substring(i, i + childStr.length());
                    if(temp.equals(childStr.toLowerCase()))
                    {
                        numberToShow ++;
                    }
                }
            }
        }

        /*int numberToShow = 0;
        int theLastIndex = 0;
        boolean isDone = false;

        do {
            int temp = parrentStr.toLowerCase().indexOf(childStr.toLowerCase(),theLastIndex + 1);
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
        while (!isDone);*/

        System.out.format("So lan xuat hien: %d", numberToShow);

        System.out.format("\n" );

        System.out.format("So lan xuat hien: %d", StringUtility.NumberTimeAppearance(parrentStr,childStr));

        //System.out.format("So lan xuat hien: %d", StringUtility.NumberTimeAppearance2(parrentStr,childStr));

    }

}
