import java.util.Stack;

public class StackIntegers {

	//declare the stack
			Stack<Integer> intStack = new Stack<Integer>();
			//this function gets the value from the user and pushes it to the stack, then returns the stack
			public Stack pushStack (int userAnsw)
			{
				//push user's answer to the stack
				intStack.push(userAnsw);
				//return the stack
				return intStack;
			}
			
			//this function pops top value from the stack and return the stack
			public  Stack popStack(int popedVal)
			{	
				//pop the top value
				intStack.pop();	
				//return the stack
				return intStack;
			}
			
			//this function get the top value from the stack (peek) and returns it
			public int peekStack()
			{
				//get the top value
				int peekVal = intStack.peek();
				//return the top value
				return peekVal;
			}
			
			//this function pops top value from the stack and return the stack
			public  Stack clearStack()
			{	
				//pop the top value
				intStack.clear();	
				//return the stack
				return intStack;
			}
}
