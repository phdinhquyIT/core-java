
package JavaBasicExercises;


public class Bai13 {
    public static void main(String[] strings) {

        final double dai = 5.6;
        final double rong = 8.5;

        double chuvi = 2*(dai + rong);
		
        double dientich = dai * rong;			
		
		System.out.printf("Chu vi la 2*(%.1f + %.1f) = %.2f \n", dai, rong, chuvi);

        System.out.printf("Dien tich la %.1f * %.1f = %.2f \n", dai, rong, dientich);
    }
}
