package inflearn;

import java.util.Scanner;
import java.util.Stack;

// 인프런 괄호문자제거
public class Quiz25 {

    public static String solution(String str){
        String answer="";
        Stack<Character> stack=new Stack<>();
        for(char x : str.toCharArray()){
            if(x==')'){
                while(stack.pop()!='(');
            }
            else stack.push(x);
        }
        for(int i=0; i<stack.size(); i++) answer+=stack.get(i);
        return answer;
    }

    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        String str=kb.next();
        System.out.println(solution(str));
    }
}