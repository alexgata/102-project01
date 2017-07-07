/**
 * Point Interface
 *
 * @ Alexandra Gata
 * @ Project01 
 * @ CPE102-01
 */


public interface Point
{
   double xCoordinate();
   double yCoordinate();
   double radius();
   double angle();
   double distanceFrom(Point other);
   Point rotate90();
}
