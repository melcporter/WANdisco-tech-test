package ShapesPackage;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class JUnitTest
{
   Shape sphere, cube, tetrahedron;

   @Before
   public void setUp(){
      sphere = new Sphere();
      cube = new Cube();
      tetrahedron = new Tetrahedron();
   }

   @Test
   public void sphereVolumeOf1(){
      Double expectedValue = 4.19;
      Double actualValue = sphere.getVolume(1);

      assertEquals(expectedValue,actualValue);
   }

   @Test
   public void sphereVolumeOf5(){
      Double expectedValue = 523.6;
      Double actualValue = sphere.getVolume(5);

      assertEquals(expectedValue,actualValue);
   }

   @Test
   public void cubeVolumeOf1(){
      Double expectedValue = 1.0;
      Double actualValue = cube.getVolume(1);

      assertEquals(expectedValue,actualValue);
   }

   @Test
   public void cubeVolumeOf5(){
      Double expectedValue = 125.0;
      Double actualValue = cube.getVolume(5);

      assertEquals(expectedValue,actualValue);
   }

   @Test
   public void tetrahedronVolumeOf1(){
      Double expectedValue = 0.12;
      Double actualValue = tetrahedron.getVolume(1);

      assertEquals(expectedValue, actualValue);
   }

   @Test
   public void tetrahedronVolumeOf5(){
      Double expectedValue = 14.73;
      Double actualValue = tetrahedron.getVolume(5);

      assertEquals(expectedValue, actualValue);
   }

}//class
