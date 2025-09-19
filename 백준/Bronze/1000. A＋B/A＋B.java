import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        // BufferedReader 객체 생성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 한 줄 전체를 읽고 StringTokenizer에 저장
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        // 공백을 기준으로 토큰을 나누어 정수로 변환
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        System.out.println(a + b);
    }
}