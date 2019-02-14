import java.util.*;

public class Student
{
    private String m_name;
    private int m_age;
    private String m_course;
    private String m_year;
    private String m_section;

    public Student( String name, int age, String course, String year, String section )
    {
        m_name = name;
        m_age = age;
        m_course = course;
        m_year = year;
        m_section = section;
    }

    public String getName()
    {
        return m_name;
    }

    public int getAge()
    {
        return m_age;
    }

    public String getCourse()
    {
        return m_course;
    }

    public String getYear()
    {
        return m_year;
    }

    public String getSection()
    {
        return m_section;
    }

    public String toString()
    {
        return "name: " + m_name + ", age: " + m_age + 
               ", course: " + m_course + ", year: " + m_year +
               ", section: " + m_section;
    }

    public static void main(String[] args) 
    {
       ArrayList<Student> students = new ArrayList<Student>();
       Scanner input = new Scanner(System.in);

       int menuChoice = 4;
       do {
           System.out.println("\t\t\tStudent Record Menu");
           System.out.println("\t\t1. Add Student\t2. View Students\t3. Search Student\t4. Exit");
           try {
               System.out.println("Enter a choice: ");
               menuChoice = Integer.parseInt(input.nextLine());
           } catch (NumberFormatException e) {
               continue;
           }

           if (menuChoice==1)
           {
               System.out.println("Full name:");
               String name = input.nextLine();

               int age = -1;
               do {
                   try {
                       System.out.println("Age:");
                       age = Integer.parseInt(input.nextLine());
                   } catch (NumberFormatException e) {
                       System.out.println("Enter a number!");
                       continue;
                   }
               } while (age <= 0);

               System.out.println("Course:");
               String course = input.nextLine();

               System.out.println("Year:");
               String year = input.nextLine();

               System.out.println("Section:");
               String section = input.nextLine();

               Student student = new Student(name, age, course, year, section);
               students.add(student);

           } else if (menuChoice==2) {
               System.out.println("Students:");
               for (Student student : students)
               {
                   System.out.println(student);
               }
           }
       } while (menuChoice<4);
    }
}