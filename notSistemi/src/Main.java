public class Main {
    public static void main(String[] args) {
        Course mat = new Course("Matematik", "MAT101", "MAT");
        Course fizik = new Course("Fizik", "FZK101", "FZK");
        Course kimya = new Course("Kimya", "KMY101", "KMY");
        Course sMat = new Course("Matematik", "MAT101","MAT");
        Course sFizik = new Course("Fizik", "FZK101", "FZK");
        Course sKimya = new Course("Kimya","KMY101", "KMY");

        Teacher t1 = new Teacher("Mahmut Hoca", "90550000000", "MAT");
        Teacher t2 = new Teacher("Fatma Ayşe", "90550000001", "FZK");
        Teacher t3 = new Teacher("Ali Veli", "90550000002", "KMY");

        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);

        Student s1 = new Student("Ali", "4", "140144015", mat, fizik, kimya,sMat,sFizik,sKimya);
        s1.addBulkExamNote(50,20,40,60,40,50);
        s1.isPass();

        Student s2 = new Student("Veli", "4", "2211133", mat, fizik, kimya,sMat,sFizik,sKimya);
        s2.addBulkExamNote(100,50,40,100,70,50);
        s2.isPass();

        Student s3 = new Student("İsmail", "4", "221121312", mat, fizik, kimya,sMat,sFizik,sKimya);
        s3.addBulkExamNote(50,20,40,70,40,40);
        s3.isPass();

    }
}