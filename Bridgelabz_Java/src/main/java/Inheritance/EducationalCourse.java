/*
 * This program demonstrates multilevel inheritance in Java using educational courses.
 * A PaidOnlineCourse inherits properties from OnlineCourse and Course to display course details.
 */

package Inheritance;

class Course{
    String course_name;
    int duration;

    // Constructor to initialize the common course details
    Course(String course_name,int duration){
        this.course_name = course_name;
        this.duration = duration;
    }

    // Displays the basic course information
    public void display_Course(){
        System.out.println("Course name: "+course_name);
        System.out.println("Duration: "+duration);
    }
}

class OnlineCourse extends Course{
    String platform;
    boolean isRecorded;

    // Calls the parent constructor and initializes online course details
    OnlineCourse(String course_name, int duration, String platform, boolean isrecorded){
        super(course_name,duration);
        this.platform = platform;
        this.isRecorded = isrecorded;
    }
}

class PaidOnlineCourse extends OnlineCourse{
    int fee;
    int discount;

    // Calls the OnlineCourse constructor and initializes fee and discount
    PaidOnlineCourse(String course_name, int duration, String platform, boolean isrecorded, int fee,int discount){
        super( course_name,  duration,  platform,  isrecorded);
        this.fee = fee;
        this.discount = discount;
    }

    // Displays all the details of the paid online course
    public void displayCourseDetails(){
        System.out.println("Course Name: "+course_name);
        System.out.println("Course Duration: "+duration+" months");
        System.out.println("Course Platform: "+platform);
        System.out.println("Class is recorded: "+isRecorded);
        System.out.println("Course Fee: "+fee);
        System.out.println("Discount: "+discount);
    }
}


public class EducationalCourse {
    public static void main(String[] args){

        // Creating an object of the final child class
        PaidOnlineCourse paidcouse = new PaidOnlineCourse("DSA",6, "Zoom Meet",true,5000,1000);

        // Displaying the complete course details
        paidcouse.displayCourseDetails();
    }
}