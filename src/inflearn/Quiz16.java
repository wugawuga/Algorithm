package inflearn;

import java.util.Scanner;

// 인프런 문자열 압축
public class Quiz16 {

    public static String solution(String s){
        String answer="";
        s=s+" ";
        int cnt=1;
        for(int i=0; i<s.length()-1; i++){
            if(s.charAt(i)==s.charAt(i+1)) cnt++;
            else{
                answer += s.charAt(i);
                if(cnt>1) answer+=String.valueOf(cnt);
                cnt=1;
            }
        }
        return answer;
    }

    public static void main(String[] args){

        Scanner kb = new Scanner(System.in);
        String str=kb.next();
        System.out.println(solution(str));
    }
}
