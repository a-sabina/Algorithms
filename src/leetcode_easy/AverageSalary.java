package leetcode_easy;

public class AverageSalary {
    public static void main(String[] args) {
        int[] salary = {48000, 59000, 99000, 13000, 78000, 45000, 31000, 17000, 39000, 37000, 93000, 77000, 33000, 28000, 4000, 54000, 67000, 6000, 1000, 11000};
        int length = salary.length;
        int dividedBy = length - 2;
        double averageSalary = 0;
        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;
        double total = 0;
        for (int i : salary) {
            min = Math.min(min, i);
            max = Math.max(max, i);
            total += i;
        }
        averageSalary = (total - (max + min)) / dividedBy;
        System.out.println(averageSalary);
//
//        for (int i = 0; i < length; i++) {
//            for (int j = 0; j < length; j++) {
//                if (salary[i] < salary[j]) {
//                    int temp = salary[i];
//                    salary[i] = salary[j];
//                    salary[j] = temp;
//                }
//            }
//        }
//        long sum = 0;
//        for(int i=1 ; i< length-1; i++)
//        {
//            sum += salary[i];
//        }
//        averageSalary = (double)sum/dividedBy;
//        System.out.println(averageSalary);
    }
}
