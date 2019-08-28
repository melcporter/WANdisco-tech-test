package ShapesPackage;

public class Sphere implements Shape
{
   @Override
   public double getVolume(int radius)
   {
      double volume =  4.0 / 3.0 * Math.PI * ShapesUtil.cubeVolume(radius);
      return ShapesUtil.getRound(volume);
   }


}//class
