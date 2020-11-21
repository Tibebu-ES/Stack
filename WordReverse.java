
package stack;

/**
 * A stack application that reverse a given word (inputWord) 
 * @author tibebu
 */
public class WordReverse {
    Stack stack;
    String inputWord = "ABCDE";
    
    
    public static void main(String[] args) {
        WordReverse wr = new WordReverse();
        wr.stack=new Stack(wr.inputWord.length());
        
        //insert the input word to the stack
        for(int i=0;i<wr.inputWord.length();i++){
            wr.stack.push(wr.inputWord.charAt(i));
        }
        
        
        // reversed the input word
        String reversedWord="";
        while(!wr.stack.isEmpty()){
            reversedWord+=wr.stack.pop();
        }
        
        //print the reversed word
        System.out.println("The Reversed Word:\n"+reversedWord);
    }
    
}
