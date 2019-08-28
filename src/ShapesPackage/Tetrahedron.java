package ShapesPackage;

public class Tetrahedron implements Shape
{
   @Override
   public double getVolume(int edge)
   {
      double volume = ShapesUtil.cubeVolume(edge) / (6 * Math.sqrt(2));
      return ShapesUtil.getRound(volume);
   }
}//class
