/*
Rework the program 2, especially the Hint f where if index equals maxDigit, we break from the loop. Here we want to modify to Increase the size of the array i,e maxDigit by 10 if the index is equal to maxDigit. This is done to consider all digits to find the largest and second-largest number
Hint =>
In Hint f inside the loop if the index is equal to maxDigit, increase maxDigit and make digits array to store more elements.
To do this, we need to create a new temp array of size maxDigit, copy from the current digits array the digits into the temp array, and assign the current digits array to the temp array
Now the digits array will be able to store all digits of the number in the array and then find the largest and second largest number
 */
package Arrays.level2;
import java.util.Scanner;
public class LargestSecondLargestAll {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int []digits=new int[10];
        int originalNumber=number,index=0;
        while(originalNumber!=0){
            if(index==digits.length){
                int[] temp=new int[2*digits.length];
                for(int i=0;i<digits.length;i++){
                    temp[i]=digits[i];
                }
                digits=temp;
            }
            digits[index++]=originalNumber%10;
            originalNumber=originalNumber/10;
        }
        if (index < 2) {
            System.out.println("At least two digits are required.");
            sc.close();
            return;
        }
        // to find largest and Second largest number
        int largest=-1,secondLargest=-1;
        for(int i=0;i<index;i++){
            if(digits[i]>largest){
                secondLargest=largest;
                largest=digits[i];
            } else if (digits[i]>secondLargest && digits[i]<largest) {
                secondLargest=digits[i];
            }
        }
        // to display largest and secondLargest
        if (secondLargest == -1) {
            System.out.println("No distinct second-largest digit.");
        } else {
            System.out.println("Largest: " + largest);
            System.out.println("Second largest: " + secondLargest);
        }
    }
}