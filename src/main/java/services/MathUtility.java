package services;
import entities.ResultValue;

public class MathUtility {

    public static ResultValue GetOutputQuadraticEquation(int a, int b, int c)
    {
        ResultValue result = null;
        try
        {
            // ly thuyet
            /*
            ax^2+bx+c=0

            ∆=b^2-4ac

            ∆<0:Phương trình VN
            ∆=0:Phương trình có nghiệm kép x=-b/2a
            ∆>0:Phương trình có 2 nghiệm phân biệt
            x=(-b±√∆)/2a

            Nếu b=2b':
            ∆'=b'^2-ac
            ∆'<0:Phương trình VN
            ∆'=0:Phương trình có nghiệm kép x=-b'/a
            ∆'>0:Phương trình có 2 nghiệm phân biệt x=(-b'±√∆')/a


             */
            double dis = Math.sqrt(b*b-4*a*c);

            if(dis > 0)
            {
                double c1=(-b+dis)/(2*a);
                double c2=(+b+dis)/(2*a);

                // gan gia trị cho biến kết quả trả về
                result.Value1 = c1;
                result.Value2 = c2;
            }

        }
        catch (Exception ex)
        {
            // log error
        }
        return result;
    }
}
