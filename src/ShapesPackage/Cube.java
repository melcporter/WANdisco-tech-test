package ShapesPackage;

public class Cube implements Shape
{
   @Override
   public double getVolume(int width){
      double volume = ShapesUtil.cubeVolume(width);
      return ShapesUtil.getRound(volume);
   }
}//class
