package dataoperations.tokenizer;

public class TryTokenizer {

    public static void main(String args[]) {

        SimpleTokenizer tnzer = new SimpleTokenizer(1);

        String myname="my name is kostas";
        
        String[] res = tnzer.getTokens(myname);
        
        for(String w: res){
            System.out.println(w);
        }
       
    }
}
