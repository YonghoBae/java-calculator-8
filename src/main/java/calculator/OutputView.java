package calculator;

public class OutputView {
    public void print(int result){
        System.out.println("결과 : "+result);
    }

    public void printError(String errorMessage){
        System.out.println("<에러> : "+errorMessage);
    }
}
