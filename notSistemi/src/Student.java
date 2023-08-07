public class Student {
    String name,stuNo;
    String classes;
    Course mat;
    Course fizik;
    Course kimya;
    Course sMat;
    Course sFizik;
    Course sKimya;
    double avarage;
    boolean isPass;

    public Student(String name, String stuNo, String classes, Course mat, Course fizik, Course kimya
                    ,Course sMat,Course sFizik,Course sKimya) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.mat=mat;
        this.fizik=fizik;
        this.kimya=kimya;
        this.sMat=sMat;
        this.sFizik=sFizik;
        this.sKimya=sKimya;

    }

    public void addBulkExamNote(int mat, int fizik, int kimya,int sMat,int sFizik,int sKimya) {

        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat * 0.80;

        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
        }
        if (sMat >= 0 &&  sMat<= 100) {
            this.sMat.note = sMat;
        }
        if (sFizik >= 0 && sFizik <= 100) {
            this.sFizik.note = sFizik;
        }
        if (sKimya >= 0 && sKimya <= 100) {
            this.sKimya.note = sKimya;
        }


    }

    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }
    public void calcAvarage() {
        this.avarage = ((this.fizik.note *0.80) + (this.kimya.note * 0.80) +(this.mat.note *0.80)
                + (this.sFizik.note * 0.20) + (this.sKimya.note * 0.20) + (this.sMat.note * 0.20)) / 3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.note);
        System.out.println("Matematik Sözlü Notu : " + this.sMat.note);
        System.out.println("Fizik Notu : " + this.fizik.note);
        System.out.println("Fizik Sözlü Notu : " + this.sFizik.note);
        System.out.println("Kimya Notu : " + this.kimya.note);
        System.out.println("Kimya Sözlü Notu : " + this.sKimya.note);
    }
}
