package CIPipline;

import static org.junit.jupiter.api.Assertions.*;

import org.joda.time.DateTime;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import CIPipeline.CourseProgramme;
import CIPipeline.Student;
import CIPipeline.Module;


	public class CourseProgrammeTest {
		private Student student1;
		private Student student2;
		private Module module1;
		private Module module2;
		private CourseProgramme course1;

		@BeforeEach
		public void setUp() throws Exception{
			
			student1 = new Student("MikeOxlong", "11-11-99", 21, 17345677);
			student2 = new Student("PatMcGroin", "10-10-01", 19, 19223459);
			module1 = new Module("EE456", "NutznBolts");
			module2 = new Module("EE417", "Software Eng");
			course1 = new CourseProgramme("BP", new DateTime("2019-01-01T00:00:00Z"),
					   new DateTime("2025-01-01T00:00:00Z"));
		}

		@Test
		public void removeStudentTest(){
			
			course1.addStudentCourse(student1);
			course1.addStudentCourse(student2);
			course1.removeStudentCourse(student2);
			String correctStudent = "MikeOxlong_21";
			String currentStudent = course1.getStudentList().toString();
			assertTrue(currentStudent.contains(correctStudent));
		}

		@Test
		public void removeModTest(){
			
			course1.addModuleCourse(module1);
			course1.addModuleCourse(module2);
			course1.removeModuleCourse(module2);
			String correctResult = "NutznBolts";
			String currentResult = course1.getModuleListString();
			assertTrue(currentResult.contains(correctResult));
		}
	}