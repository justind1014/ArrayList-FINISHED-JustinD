public class ListTest {
   public static void main(String[] args){
        
      //create new array list
      ArrayList list = new ArrayList();

      //add elements to array
      list.add(1);
      list.add(7);
      list.add(4);
      list.add(12);
      
      //print list
      int firstInt = list.get(0);
      int secondInt = list.get(1);
      int thirdInt = list.get(2);
      int fourthInt = list.get(3);
      int fifthInt = list.get(4);
      int sixthInt = list.get(5);
      System.out.println("Current list:");
      System.out.println(firstInt + ", " + secondInt + ", " + thirdInt + ", " + fourthInt + ", " + fifthInt + ", " + sixthInt);

      //print list size
      int listSize = list.size();
      System.out.println("List size: " + listSize);
      

      //add element in second spot
      list.add(1, 5);

      //print list
      firstInt = list.get(0);
      secondInt = list.get(1);
      thirdInt = list.get(2);
      fourthInt = list.get(3);
      fifthInt = list.get(4);
      sixthInt = list.get(5);
      System.out.println("List after adding to 2nd spot:");
      System.out.println(firstInt + ", " + secondInt + ", " + thirdInt + ", " + fourthInt + ", " + fifthInt + ", " + sixthInt);

      //print list size
      listSize = list.size();
      System.out.println("List size: " + listSize);

      //remove element at fourth spot
      list.remove(3);

      //print list
      firstInt = list.get(0);
      secondInt = list.get(1);
      thirdInt = list.get(2);
      fourthInt = list.get(3);
      fifthInt = list.get(4);
      sixthInt = list.get(5);
      System.out.println("List after removing the 4th element:");
      System.out.println(firstInt + ", " + secondInt + ", " + thirdInt + ", " + fourthInt + ", " + fifthInt + ", " + sixthInt);

      //print list size
      listSize = list.size();
      System.out.println("List size: " + listSize);

       //remove element at first spot
       list.remove(0);

       //print list
       firstInt = list.get(0);
       secondInt = list.get(1);
       thirdInt = list.get(2);
       fourthInt = list.get(3);
       fifthInt = list.get(4);
       sixthInt = list.get(5);
       System.out.println("List after removing the 1st element:");
       System.out.println(firstInt + ", " + secondInt + ", " + thirdInt + ", " + fourthInt + ", " + fifthInt + ", " + sixthInt);

       //print list size
      listSize = list.size();
      System.out.println("List size: " + listSize);

   }
}
