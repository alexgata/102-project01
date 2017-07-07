/**
 * Cartesian Point class
 * @ Alexandra Gata
 * @ Lab01 
 * @ CPE102-01
 */

import java.lang.*;

public class CartesianPoint implements Point
{
   private double xCoord;
   private double yCoord;

   public CartesianPoint(double xCoord, double yCoord) {
      this.xCoord = xCoord;
      this.yCoord = yCoord;     
   }
 
   public double angle() {
      double angle = Math.atan2(yCoord,xCoord);
      return angle;
   }

   public double distanceFrom(Point other) {
      double distance = Math.sqrt((((xCoord-other.xCoordinate())*(xCoord-other.xCoordinate())))+((yCoord-other.yCoordinate())*(yCoord-other.yCoordinate())));
      return distance;
   }

   public double radius() {
      double radius = Math.sqrt(((xCoord)*(xCoord)) + ((yCoord)*(yCoord)));
      return radius;
   }
   
   public Point rotate90() {
      return new CartesianPoint(-yCoord, xCoord);          
   }

   public double xCoordinate() {
      return xCoord;
   }

   public double yCoordinate() {
      return yCoord;
   }

}
