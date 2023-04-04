public class ArrayList{
       
   // instance variables
   private int[] array;
   private int numArray;

   public ArrayList(){
      this.array = new int[10];
      this.numArray = 0;
   }

   // adds an int to the end of the list
   public void add(int element){
      // if the array is full, make the array larger
      if(this.array.length == this.numArray){
         // determine the new size
         int size = this.numArray*2;
         // create the new array
         int[] biggerArray = new int[size];
         // go through the smaller array and copy it over
         for (int i = 0; i < this.numArray; i++) {
             biggerArray[i] = this.array[i];
         }
         // change the array to be bigger array
         this.array = biggerArray;
     }

     // add the element at the end
        // put at numArray
        this.array[this.numArray] = element;
        // increase the item counter
        this.numArray++;
   }      

   // adds an int in a specified spot in the list
   public void add(int index, int element){
      // make sure that index is a valid position
      if(index < 0){
         // send back an error if index is invalid
         throw new IndexOutOfBoundsException("This isn't a valid position!");
     }

      // if the array is full, make the array larger
      if(this.array.length == this.numArray){
         // determine the new size
         int size = this.numArray*2;
         // create the new array
         int[] biggerArray = new int[size];
         // go through the smaller array and copy it over
         for (int i = 0; i < this.numArray; i++) {
             biggerArray[i] = this.array[i];
         }
         // change the array to be bigger array
         this.array = biggerArray;
     }

     /* push all ints in the array 1 spot forward
     *  only applies to ints above the specified index
     */ 
     for (int i = this.numArray; i >= index; i--) {
         // move int i one spot forward
         this.array[i + 1] = this.array[i];
         //set int i to zero
         this.array[i] = 0;
     }

      // add element at index
      this.array[index] = element;
      // increase the array counter
      this.numArray++;
   }

   // return the int at the specified index
   public int get(int index){
      // make sure that index is a valid position
      if(index < 0){
         // send back an error if index is invalid
         throw new IndexOutOfBoundsException("This isn't a valid position!");
     }

     return this.array[index];
   }

   // removes an int at a specified location
   public int remove(int index){
      // make sure that index is a valid position
      if(index < 0){
         // send back an error if index is invalid
         throw new IndexOutOfBoundsException("This isn't a valid position!");
     }

     // remove element at index
      this.array[index] = 0;
      int indexItem = this.array[index];

     /* pull all ints in the array 1 spot back
     *  only applies to ints above the specified index
     */ 
      for (int i = index; i < numArray; i++) {
         // move int i one spot back
         this.array[i] = this.array[i + 1];
      }
      // decrease the array counter
      this.numArray--;

      return indexItem;
   }

   public int size(){
      return this.numArray;
   }

   public boolean isEmpty(){
      return this.numArray == 0;
   }

   

}

