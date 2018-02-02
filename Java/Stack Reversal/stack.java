/********************************************************/
//              STACK CLASS  :  generic
/********************************************************/

import java.util.*;
   
public class stack <T> {
    private ArrayList<T> st = new ArrayList<T> ();
    private int top = 0;
  
  	// Return the size of the list
    public int size (){ 
    	return top; 
    }
   
   	// To push elements into Stack
    public void push (T item) {
        st.add (top++, item);
    }
  	
  	// To pop elements from stack
    public T pop () {
        return st.remove (--top);
    }
    
    // To check whether stack is empty
    public boolean isEmpty(){
    	return top == 0;
    }
    
    
}

