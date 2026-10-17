package level1Questions;

public class AverageMarks {
    public static void main(String[] args)
    {
        String name="Sam";
        int maths=94;
        int phy=95;
        int chem=96;
        int totSubj=3;
        double avg=(maths+phy+chem)/totSubj;
        System.out.println(name + "'s average mark in PCM is " +avg);
    }
}
