

import java.util.ArrayList;
import java.util.List;


public class Student {
    private String name, username, DOB;
    private CourseProgramme courseProg;
    private int age, id;
    private List <Module> currentMods;
    
    public Student(String name, String DOB, int age, int id){
        this.name = name;
        this.DOB = DOB;
	this.age = age;
        this.username= this.getUsername();
	this.id = id;
	currentMods = new ArrayList<Module>();
        }
    
    public String getUsername(){
		String username = name + "_" + age;
		return username;
	}
    
    public void addModule(Module module){
	if (!currentMods.contains(module)){ 
		currentMods.add(module);
		module.addStudentModule(this);
	}
    }

    public void removeModule(Module module){
	if (currentMods.contains(module)){
		currentMods.remove(module);
		module.removeStudentModule(this);
	}
    }
    
    public void removeStudentCourse(){
	this.courseProg = null;
    }
    
    //getters and setters
      public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }
    
    public int getId(){
	return id;
    }

    public void setId(int id){
	this.id = id;
    }

    public String getDOB(){
        return DOB;
    }

    public void setDOB(String DOB){
        this.DOB = DOB;
    }
    
    public CourseProgramme getCourseProgramme(){
	return courseProg;
    }

    public void setCourseProgramme(CourseProgramme courseProg){
        this.courseProg = courseProg;
    }
    
    
}
