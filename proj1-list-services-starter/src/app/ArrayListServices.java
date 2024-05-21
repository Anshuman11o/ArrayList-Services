package app;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 *  This class provides methods that perform operations on a list of generic objects.
 *  The Objects are assumed to have an appropriate implementation of the equals method.
 */
public class ArrayListServices <T> {

   /**
    * This method takes an ArrayList as a parameter and returns a new ArrayList that 
    * does not contain any duplicate data. For example, if this list was passed in: 
    * [A, B, D, A, A, E, B], the method would return a list containing: [A, B, D, E]. 
    * The ordering of the data does not matter. 
    * Assume that the parameter is not null, but it may be an empty ArrayList, in which case 
    * your method returns a new, empty ArrayList.
    * Also note that the ArrayList that is returned must be a new ArrayList which is not the 
    * same as the ArrayList passed in. In other words, the parameter must not be changed by your method code.
    */
   public ArrayList<T> deDuplicate(ArrayList<T> inputList){
      //Write your comments on how you implemented the method.
      /**
       This method was implemented using set property.
       Since sets store unique elements with no duplicate values, this method takes in the input list and stores its contents into a new set.
       Then a new list is made using the content of the new set, which basically is the same as the input list but without duplicate values.
       Finally the new list is returned.
      **/
      
      //TODO: Implement this method.
      HashSet<T> set = new HashSet<>(inputList);
      return new ArrayList<>(set);
   }

   /**
    * This method takes two ArrayLists as parameters and returns a new ArrayList that 
    * contains the intersection of the data in the ArrayLists passed in. The intersection 
    * contains the elements that occur in both lists.
    * For example, if these lists were passed in: [A, B, D, A, A, E, B], [B, E, C], the method 
    * would return a list containing: [B, E]. The ordering of the data does not matter. Note that 
    * the result does not contain any duplicates.
    * Assume that the parameters are not null, but one or both may be an empty ArrayList, in which 
    * case your method returns a new, empty ArrayList.
    * Also note that the ArrayList that is returned must be a new ArrayList which is not the same as 
    * the ArrayList passed in. In other words, the parameter must not be changed by your method code.
    */
   public ArrayList<T> getSetIntersection(ArrayList<T> listA, ArrayList<T> listB){
      //Write your comments on how you implemented the method.
      /**
       This method was implemented mainly with the help of sets.
       The method takes in both the input lists A and B and stores its contents into 2 new sets.
       Then the set method 'retailAll' is used to find the common elements from both the sets and those elements are then stored into a new list.
       Finally the new list is returned with all the common elements from the original input lists.
      **/
      
      //TODO: Implement this method.
      HashSet<T> set1 = new HashSet<>(listA);
      HashSet<T> set2 = new HashSet<>(listB);
      ArrayList <T> intersectionList = new ArrayList<>(set1);
      intersectionList.retainAll(set2);
      return intersectionList;
   }

   /**
    *  This method takes two ArrayLists as parameters and returns a new ArrayList that 
    * contains the set difference of the data in the ArrayLists passed in. The set difference 
    * contains the elements that occur only in one or the other list, but not in both.
    * For example, if these lists were passed in: [A, B, D, A, A, E, B], [B, E, C], the method 
    * would return a list containing: [A, D, C]. The ordering of the data does not matter. Note 
    * that the result does not contain any duplicates.
    * Assume that the parameters are not null, but one or both may be an empty ArrayList. In the 
    * case where one list is empty, your method returns a new ArrayList that contains all of the 
    * elements on the other list- with no duplicates. In the case where both lists are empty, your 
    * method returns a new, empty ArrayList.
    * Also note that the ArrayList that is returned must be a new ArrayList which is not the same 
    * as the ArrayList passed in. In other words, the parameter must not be changed by your method code.
    */
   public ArrayList<T> getSetDifference(ArrayList<T> listA, ArrayList<T> listB){
      //Write your comments on how you implemented the method.
      /**
       First I made an if statement block to test the empty list scenarios and returned the lists accordingly.
       Then the method takes input lists A and B and makes a new sets out of it. This allows us to use set methods.
       Using 'removeAll' set method the function manages to find the unique elements in both the sets, which are then stored in 2 seperate lists.
       finally a new list is returned with the contents of both the lists.
      **/
      
      //TODO: Implement this method.
      if (listA.isEmpty()){
         return new ArrayList<>(new HashSet<>(listB));
      } 
      if (listB.isEmpty()){
         return new ArrayList<>(new HashSet<>(listA));
      } 
      if (listA.isEmpty() && listB.isEmpty()){
         return new ArrayList<>();
      }
      
      HashSet<T> set1 = new HashSet<>(listA);
      HashSet<T> set2 = new HashSet<>(listB);
      
      ArrayList <T> differenceList1 = new ArrayList <>(set1);
      differenceList1.removeAll(set2);
      ArrayList <T> differenceList2 = new ArrayList <>(set2);
      differenceList2.removeAll(set1);
      
      ArrayList <T> finalList = new ArrayList<>();
      finalList.addAll(differenceList1);
      finalList.addAll(differenceList2);
      
      return finalList;
   }

}