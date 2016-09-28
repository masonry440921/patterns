package flyweight.example_1;

import java.util.EnumMap;
import java.util.Map;

public class TeacherFactory {
	private final Map<TeacherType,Teacher> teachers;
	
	public TeacherFactory() {
		// TODO Auto-generated constructor stub
		this.teachers = new EnumMap<>(TeacherType.class);
	}
	
	public Teacher getTeacher(TeacherType type){
		Teacher teacher = teachers.get(type);
		
		if(teacher == null){
			switch (type) {
			case ENGINSH:
				teacher = new EnglishTeacher();
				teachers.put(type, teacher);
				break;
			case YUWEN:
				teacher = new YuWenTeacheer();
				teachers.put(type, teacher);
				break;
			case WULI:
				teacher = new WuliTeacher();
				teachers.put(type, teacher);
				break;	
			default:
				break;
			}
		}
		
		return teacher;
	}
}
