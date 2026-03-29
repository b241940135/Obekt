package lab07;

    import java.util.ArrayList;
	import java.util.Comparator;
	import java.util.List;

	public class StudentManager {
	    private List<Student> students;

	    public StudentManager() {
	        this.students = new ArrayList<>();
	    }

	    public void addStudent(Student student) {
	        students.add(student);
	        System.out.println("✅ Амжилттай нэмэгдлээ.");
	    }

	    public void removeStudent(String id) {
	        boolean removed = students.removeIf(s -> s.getStudentId().equalsIgnoreCase(id));
	        if (removed) {
	            System.out.println("🗑️ Оюутан амжилттай устгагдлаа.");
	        } else {
	            System.out.println("❌ Ийм ID-тай оюутан олдсонгүй.");
	        }
	    }

	    public Student findStudent(String id) {
	        for (Student s : students) {
	            if (s.getStudentId().equalsIgnoreCase(id)) return s;
	        }
	        return null;
	    }

	    public void sortByName() {
	        students.sort(Comparator.comparing(Student::getName));
	        System.out.println("⚖️ Нэрээр эрэмбэлж дууслаа.");
	    }

	    public void printAllStudents() {
	        if (students.isEmpty()) {
	            System.out.println("📭 Одоогоор оюутны мэдээлэл байхгүй байна.");
	            return;
	        }
	        System.out.println("\n--- Оюутны жагсаалт ---");
	        for (Student s : students) {
	            System.out.println(s);
	        }
	    }
	}

