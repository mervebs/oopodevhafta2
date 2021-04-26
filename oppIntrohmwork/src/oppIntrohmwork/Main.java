package oppIntrohmwork;
import java.util.Iterator;


public class Main {

	public static void main(String[] args) {
	Course course1=new Course(1,"C#+angular","Engin demiroğ",69);
	Course course2=new Course(2,"Java+React","Engin demiroğ",24);
	Course course3=new Course(3,"Programlamaya giriş","engin demiroğ",0);
	Course[] courses= {course1,course2,course3};
for(Course course:courses) {
	System.out.println(course.complete);
}
CourseManager courseManager=new CourseManager();
courseManager.addToClass(course1);
courseManager.addToClass(course2);
System.out.println(course3);
	}

}
