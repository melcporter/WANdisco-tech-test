package ShapesPackage;

public class Main
{
   public static void main(String[] args)
   {
      Shape sphere = new Sphere();
      Shape cube = new Cube();
      Shape tetrahedron = new Tetrahedron();

      System.out.println("A Sphere with radius of 1 has volume: " + sphere.getVolume(1));
      System.out.println("A Sphere with radius of 5 has volume: " + sphere.getVolume(5)) ;

      System.out.println("A Cube of width 1 has volume: " + cube.getVolume(1));
      System.out.println( "A Cube of width 5 has volume: " + cube.getVolume(5));

      System.out.println( "A regular Tetrahedron with edge of 1 has volume: " + tetrahedron.getVolume(1));
      System.out.println( "A regular Tetrahedron with edge of 5 has volume: " + tetrahedron.getVolume(5));

   }//main
}//class
