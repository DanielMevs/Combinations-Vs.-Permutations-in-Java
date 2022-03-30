/*In permutations, *order *_DOES_* matter.*
Therefore, a hand containing a {3C, KD, 4S, 9H, QC} is not equal to
a hand with the order {9H, 3C, QC, 4S KD} even though they contain
the same cards.
to start let us have 5 spaces, each representing a hypothetical
card that can be chosen from the deck:
_ _ _ _ _
let us start with the left most space. At this point we have not chosen
a card from the deck so the total number of cards this space can contain
is 52. So we fill out the left most space with 52.

*/
public class permutation {
    static int permute(int n, int k){
        if(k == 0){
            return 1;
        }
        else {
            return n * permute(n - 1, k - 1);
        }
    }
    public static void main(String[] args){
        int answer = permute(52, 5);
        System.out.println(answer);
    }
}

