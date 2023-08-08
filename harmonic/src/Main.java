public class Main {
    public static void main(String[] args) {
        double[] myList ={1,2,3,4,5};
        double harmonics=0;
        for (int i=0;i<myList.length;i++){
            harmonics += (1/myList[i]);
        }
        double average=(myList.length)/harmonics;

        System.out.println("Harmonik ortalama : " + average);
    }
}