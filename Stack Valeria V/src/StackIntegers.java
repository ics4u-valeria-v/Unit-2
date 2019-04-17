import java.util.Stack;

public class StackIntegers {

	//declare the stack
			Stack<Integer> intStack = new Stack<Integer>();
			public void pushStack (int userAnsw)
			{
				intStack.push(userAnsw);
			}
			
			public void popStack()
			{
				intStack.pop();	
			}
}
