import java.util.Scanner;

public class No4 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("input : ");
        String s = input.next();
        int inputLength = s.length();
        char array[] = s.toCharArray();

        int countLParenthesis = 0, countRParenthesis = 0, countLSquareBracket = 0, countRSquareBracket = 0, countLCurlyBracket = 0, countRCurlyBracket = 0;
        boolean result;
        for(int i=0; i<=inputLength-1; i++){
            if(array[i] == '('){
                countLParenthesis++;
            }
            if(array[i] == ')'){
                countRParenthesis++;
            }
            if(array[i] == '['){
                countLSquareBracket++;
            }
            if(array[i] == ']'){
                countRSquareBracket++;
            }
            if(array[i] == '{'){
                countLCurlyBracket++;
            }
            if(array[i] == '}'){
                countRCurlyBracket++;
            }
        }

        if(countLParenthesis == countRParenthesis && countLSquareBracket == countRSquareBracket && countLCurlyBracket == countRCurlyBracket){
            result = true;
        }
        else {
            result = false;
        }
        System.out.print(" => " + result);

    }
}
