package bridge;

import java.util.List;

/**
 * 사용자에게 게임 진행 상황과 결과를 출력하는 역할을 한다.
 */
public class OutputView {

    /**
     * 현재까지 이동한 다리의 상태를 정해진 형식에 맞춰 출력한다.
     * <p>
     * 출력을 위해 필요한 메서드의 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    public void printMap(List<String> result1, List<String> result2, int index) {
        printOneMap(result1, index + 1);
        printOneMap(result2, index + 1);
    }

    public void printOneMap(List<String> result, int index) {
        System.out.print("[");
        for (int i = 0; i < index; i++) {
            System.out.print(" " + result.get(i));
            if (i < index - 1) {
                System.out.print(" |");
            }
        }
        System.out.println(" ]");
    }

    /**
     * 게임의 최종 결과를 정해진 형식에 맞춰 출력한다.
     * <p>
     * 출력을 위해 필요한 메서드의 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    public void printResult() {
    }

    public void printReadSizeError() {
        System.out.println("[ERROR] 다리 길이는 3부터 20 사이의 숫자여야 합니다.");
    }
}
