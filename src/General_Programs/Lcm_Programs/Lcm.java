package General_Programs.Lcm_Programs;

public class Lcm {
    public static void main(String[] args) {
        int num1=72; int num2= 120;
        int lcm =(num1>num2)? num1:num2;
        findLcm(lcm,num1,num2);
    }

    public static void findLcm(int lcm,int num1, int num2){
        while (true){
            if(lcm%num1==0 && lcm %num2==0){
                System.out.println("LCM is "+lcm);
                break;
            }
            ++lcm;
        }
    }
}
