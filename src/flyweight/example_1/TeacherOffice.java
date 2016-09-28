package flyweight.example_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TeacherOffice {
	private List<Teacher> teacher1;
	private List<Teacher> teacher2;
	
	public TeacherOffice() {
		// TODO Auto-generated constructor stub
		this.teacher1 = new ArrayList<Teacher>();
		this.teacher2 = new ArrayList<Teacher>();
		teachkemu();
	}

	private void teachkemu() {
		// TODO Auto-generated method stub
		TeacherFactory factory = new TeacherFactory();
		
		teacher1.add(factory.getTeacher(TeacherType.ENGINSH));
		teacher1.add(factory.getTeacher(TeacherType.WULI));
		
		teacher2.add(factory.getTeacher(TeacherType.WULI));
	}
	

	
	public final List<Teacher> getTeacher1(){
		return Collections.unmodifiableList(this.teacher1);
	}
	
	public final List<Teacher> getTeacher2(){
		return Collections.unmodifiableList(this.teacher2);
	}

	public void enumrate(){
		System.out.println("teacher1 teach");
		for(Teacher t:teacher1){
			t.teach();
		}
		
		System.out.println("teacher2 teach");
		for(Teacher t:teacher2){
			t.teach();
		}
		
	}
}
