
/**
 * Write a description of class here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LinkedListAlgorithms
{
    
    public static void main(String [] args)
    {
        int arr1[] = {24, 18, 12, 3, 7};
        int arr2[] = {31, -9, 5, 21, 4, 0, 8, -7};
        int arr3[] = {5, 5, 0, 1};
        int arr5[] = {};
        int arr6[] = {65, 66}; 
        
        IntNode list1, list2, list3, list4, list5, list6;
        list1 = createList(arr1);
        list2 = createList(arr2);
        list3 = createList(arr3);
        
        System.out.println("\f");

        System.out.println("to begin with, ");
        System.out.println("list1= " + toString(list1));
        System.out.println("list2= " + toString(list2));
        System.out.println("list3= " + toString(list3));
          
        //******************* Problem 1 **************************************
        System.out.println("\nProblem 1");
        System.out.println("sum of list1 = " + sum(list1)); 
        System.out.println("sum of list2 = " + sum(list2));
        System.out.println("sum of list3 = " + sum(list3));
        //*/
        /****************** Problem 2 **************************************
        System.out.println("\nProblem 2");
        System.out.println("is 18 in list1? "  + contains(list1,18));
        System.out.println("is 3 in list2? "   + contains(list2,3));
        System.out.println("is 1 in list3? "   + contains(list3,1));
        //*/
        /****************** Problem 3 **************************************
        System.out.println("\nProblem 3");
        System.out.println("minimum value of list1= " + min(list1));
        System.out.println("minimum value of list2= " + min(list2));
        System.out.println("minimum value of list3= " + min(list3));
        //*/
        /****************** Problem 4 **************************************
        System.out.println("\nProblem 4");
        System.out.println("maximum value of list1= " + max(list1));
        System.out.println("maximum value of list2= " + max(list2));
        System.out.println("maximum value of list3= " + max(list3));        //*/
        /****************** Problem 5 **************************************
        System.out.println("\nProblem 5");
        // invoke your method to remove 12 from list1 
        list1 = remove(list1,12); // remove returns the new list so that list1 changes
        // invoke your method to remove -7 from list2 
        // invoke your method to remove 5 from list3 
        
        System.out.println("Now list1= " + toString(list1));
        System.out.println("Now list2= " + toString(list2));
        System.out.println("Now list3= " + toString(list3));
        //*/
        /****************** Problem 6 **************************************
        System.out.println("\nProblem 6");
        // invoke your method to insert 11 at the beginning of list1 
        list1 = insert(list1,11);  // insert returns the new list so that list1 changes
        // invoke your method to insert 2 at the beginning of list2 
        // invoke your method to insert 1 at the beginning of list3 
        
        System.out.println("Now list1= " + toString(list1));
        System.out.println("Now list2= " + toString(list2));
        System.out.println("Now list3= " + toString(list3));
        //*/
        /****************** Problem 7 **************************************
        System.out.println("\nProblem 7");
        // invoke your method to replace last item of list1 with 5 
        replaceLast(list1,5);
        // invoke your method to replace last item of list2 with 3 
        // invoke your method to replace last item of list3 with 9 
                        
        System.out.println("Now list1= " + toString(list1));
        System.out.println("Now list2= " + toString(list2));
        System.out.println("Now list3= " + toString(list3));
       //*/
        /****************** Problem 8 **************************************
        System.out.println("\nProblem 8");
        // invoke your method to replace position 2 of list1 with 15 
        replace(list1,2,15);
        // invoke your method to replace position 8 of list1 with 15 
        replace(list1,8,15);    // list should remain unchanged and no errors!
        // invoke your method to replace position 5 of list2 with 29 
        // invoke your method to replace position 1 of list3 with 2 
                        
        System.out.println("Now list1= " + toString(list1));
        System.out.println("Now list2= " + toString(list2));
        System.out.println("Now list3= " + toString(list3));
        //*/        
        
        
    }

    public static IntNode createList(int [] arr)
    {
         IntNode list = new IntNode(arr[0],null), p;
         p = list;
         for (int k=1; k<arr.length; k++)
         {
            p.next = new IntNode(arr[k],null);
            p = p.next;
        }
        return list;
    }

    public static int sum(IntNode list)
    {
        return 0; // fix this
    }

    public static IntNode remove(IntNode list,int value){
        return null;  // fix this
    }
    
    public static String toString(IntNode list)
    {
        IntNode p=null;
        String result = "";
        if (list == null) return "null";
        if (list.next == null) return result + list.data + "->null";
        for (p = list; p.next!= null; p = p.next)
        {
            result = result + p.data + "->";
        }
        result = result + p.data + "->null";
        return result;
    }
}
