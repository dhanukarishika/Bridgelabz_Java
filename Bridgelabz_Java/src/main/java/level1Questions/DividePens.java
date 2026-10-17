package level1Questions;

class DividePens {
    public static void main(String[] args) {
        int totalPens=14;
        int noOfStudents=3;
        int pensPerStudent=totalPens/noOfStudents;
        int remainingPens=totalPens%noOfStudents;
        System.out.println("The Pen Per Student is " + pensPerStudent +" and the remaining pen not distributed is " +
                remainingPens);
    }
}
