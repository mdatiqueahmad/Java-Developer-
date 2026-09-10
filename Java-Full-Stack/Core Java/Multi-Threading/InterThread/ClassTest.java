package InterThread;

class Classroom{
    boolean classStarted=false;

    public synchronized  void waitforteacher() throws InterruptedException {
        while (!classStarted) {
            System.out.println("Student:waiting for teacher...");
            wait();
        }
        Thread.sleep(2000); //Student jion class after 2 sec of teacher jion
        System.out.println("student : Join the class!");
    }

    public synchronized void startClass()
    {
        System.out.println("Teacher : starting class");
        classStarted=true;
        notify();
    }
}

class StudentThread extends Thread {
    private Classroom classroom;

    public StudentThread(Classroom classroom){
        this.classroom=classroom;
    }

    @Override
    public void run() {
        try {
            classroom.waitforteacher();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class TeacherThread extends Thread{
    private Classroom classroom;

    public TeacherThread(Classroom classroom)
    {
        this.classroom=classroom;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        classroom.startClass();
    }
}

public class ClassTest {
    public static void main(String[] args) {
        Classroom classroom=new Classroom();

        StudentThread studentThread=new StudentThread(classroom);
        TeacherThread teacherThread=new TeacherThread(classroom);

        studentThread.start();
        teacherThread.start();
    }
}
