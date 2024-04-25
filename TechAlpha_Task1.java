//Java Array Program to Remove Duplicates elements from an Array
public class TechAlpha_Task1
{
    public static void main(String[] args) {
        int a=0;
        int [] array={1,2,2,3,4,5,5};
        for(int element:array)//we are printing array element by for each oop
        {
            System.out.print(element+"  " );
        }
        for (int i=0;i<array.length-1;i++)
        {
            if (array[i]!=array[i+1])     //cheaking dulicating
            {
                array[a++]=array[i];
            }
        }
        array[a++]=array[array.length-1];
        System.out.println("\nAFTER REMOVING DUPLICATE ELEMENT");
        for (int b=0;b<a;b++)
            System.out.print("  "+array[b]);
    }
}
