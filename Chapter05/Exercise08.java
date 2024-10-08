package Chapter05;

public class Exercise08 {
    public static void main(String[] args) {
        int[][] array = {
                {95, 86},
                {83, 92, 96},
                {78, 83, 93, 87, 88}
        };

        int sum = 0;
        double avg = 0.0;

        // 작성 위치
        int cnt = 0;  // 전체 항목의 개수

        for(int i=0; i<array.length; i++) {
            for(int j=0; j<array[i].length; j++) {
                sum += array[i][j];
            }

            cnt += array[i].length;
        }

        avg = (double) sum / cnt;

        System.out.println("sum: " + sum);
        System.out.println("avg: " + avg);
    }
}
