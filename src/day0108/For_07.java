package day0108;

public class For_07 {
    public static void main(String[] args) {
        int i=10;
        while(i>=0){
            System.out.print(i--+"   ");
        }

        System.out.println();

        System.out.println("***for문으로 10~0 출력");
        for(int a=10;a>=0;a--){
            System.out.print(a+"   ");
        }
    }
}
