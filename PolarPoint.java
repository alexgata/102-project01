/**
 * Polar Point Class
 *  @ Alexandra Gata
 *  @ Project01
 *  @ CPE102-01
 */

import java.lang.*;

public class PolarPoint implements Point
{
   private double radius;
   private double angle;

   public PolarPoint(double radius, double angle) {
      this.radius = radius;
      this.angle = angle;
   }

   public double radius() {
      return radius;
   }

   public double angle() {
      return angle;
   }

   public double xCoordinate() {
      double xCoordinate = (radius) * (Math.cos(angle));
      return xCoordinate;
   }

   public double yCoordinate() {
      double yCoordinate = (radius) * (Math.sin(angle));
      return yCoordinate;
   
   }

   public double distanceFrom(Point other) {
      double distance = Math.sqrt(((radius)*(radius)) + ((other.radius())*(other.radius()))-(2)*(radius)*(other.radius())*(Math.cos((angle)-(other.angle()))));
      return distance;
   }

   public Point rotate90() {
      return new PolarPoint(radius, angle + Math.PI/2);        
   }


   }
