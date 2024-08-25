/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int srt=1;
        int lst=n;
        int mid;
        while(srt<=lst){
            mid=srt+(lst-srt)/2;
            if(guess(mid)==0) return mid;
            else if(guess(mid)==1)  srt=mid+1;
            else lst=mid-1;
        }
        return -1;
    }
}