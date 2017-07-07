import java.util.*;
import java.lang.*;

public class CircularQueue<T> implements SimpleQueue<T> {
   //initializing variables
   private T[] arr;
   private int back;
   private int front;
   private int size;
   public static final int INITIAL_LENGTH = 10;
   
   // Construction of a new Circular Queue with parameter "initialCapacity" as its maximum size
   @SuppressWarnings("unchecked") 
   public CircularQueue(int initialCapacity) {
      if (initialCapacity <= 0) {
         throw new MyException();
      }
      arr = (T[]) new Object[initialCapacity];
      front = 0;
      back = -1;
      size = 0;
   }

   //Default Constructor
   @SuppressWarnings("unchecked")
   public CircularQueue() {
      arr = (T[]) new Object[INITIAL_LENGTH];
      front = 0;
      back =-1;
      size = 0;
   }

   public T dequeue() {
      if (size == 0) {
         throw new NoSuchElementException();
      }

      T temp = arr[front];

      if (front == arr.length-1) {
         front = 0; 
      }
      else {
         front += 1; 
      }

      size --;
      return temp;
   }
   
   @SuppressWarnings("unchecked")
   public void enqueue(T element) {

      T[] tempArr;
      if (size == arr.length) {
 
         tempArr = (T[]) new Object[(arr.length)*2];
         for (int i = 0; i < arr.length; i++) {
            if (front < arr.length) {
               tempArr[i] = arr[(front+i)% arr.length];
            }
         }

         arr = tempArr;
         front = 0;
         back = size -1;

      }

      if (back == arr.length-1) {
         back = 0;
         arr[back]=element;
      }
   
      else {
         arr[back+1] = element;
         back++;
      }
      
      size++;
   
   }

   public T peek() {
      if (size ==0) {
         throw new NoSuchElementException();
      }

      else {
         return arr[front];
      }
   }

   public int size() {
      return size;
   }

   public Object[] unusualMethodForTestingPurposesOnly() {
      return arr;
   }

   public static class MyException extends RuntimeException {
      public MyException() {
      }

      public MyException(String s) {
         super(s);
      }
   }
}
