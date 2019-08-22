/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testprog1;

/**
 *
 * @author Brama Hendra Mahendra
 */
public class TestProg1 {

    /**
     * @param args the command line arguments
     */
    
    int solution(int X , int Y, int[] A) {
        int N = A.length;
        int result = -1;
        int nX = 0;
        int nY = 0;
        for (int i = 0; i < N; i++) {
            if (A[i] == X)
                nX += 1;
            else if (A[i] == Y)
                nY += 1;
            
            if (nX == nY)
                result = i;
        }
        return result;
    }
    
    public static void main(String[] args) {
        int[] A = {100,63};
        int X=6;
        int Y=13;
        
        int N = A.length;
        int result = -1;
        int nX = 0;
        int nY = 0;
        for (int i = 0; i < N; i++) {
            if (A[i] == X)
                nX += 1;
            else if (A[i] == Y)
                nY += 1;
            
            if (nX == nY)
                result = i;
        }
     
        System.out.println(result);
        

    }
    
}
