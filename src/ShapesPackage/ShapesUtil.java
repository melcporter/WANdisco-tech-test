package ShapesPackage;

import java.lang.Math;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class ShapesUtil
{
   private ShapesUtil()
   {
      //private constructor to prevent creating instance of object
   }

   public static double cubeVolume(double cubeWidth)
   {
      return Math.pow(cubeWidth, 3);
   }

   static double getRound(double size)
   {
      BigDecimal bd = new BigDecimal(size);
      bd = bd.setScale(2, RoundingMode.HALF_UP);
      return bd.doubleValue();
   }

}//class
