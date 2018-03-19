import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClientTest {
    @Test
    void solution() {
        int[] A = {1, 3, 6, 4, 1, 2};
        Client client = new Client();
        assertEquals(5, client.solution(A));
    }

    @Test
    void solutionOther() {
        int[] A = {1, 2, 3};
        Client client = new Client();
        assertEquals(4, client.solution(A));
    }
    @Test
    void solutionAnother() {
        int[] A = {-1,-3};
        Client client = new Client();
        assertEquals(1, client.solution(A));
    }
    @Test
    void solutionOneElement() {
        int[] A = {2};
        Client client = new Client();
        assertEquals(1, client.solution(A));
    }
}