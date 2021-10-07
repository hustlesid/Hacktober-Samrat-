import java.util.*;



class Get_Min_From_Stack
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T>0)
		{
			int q = sc.nextInt();
			GfG g = new GfG();
			while(q>0)
			{
				int qt = sc.nextInt();
				
				if(qt == 1)
				{
					int att = sc.nextInt();
					g.push(att);
					//System.out.println(att);
				}
				else if(qt == 2)
				{
					System.out.print(g.pop()+" ");
				}
				else if(qt == 3)
				{
					System.out.print(g.getMin()+" ");
				}
			
			q--;
			}
			System.out.println();
		T--;
		}
		
	}
}


// } Driver Code Ends


class GfG
{
	int minEle;
	Stack<Integer> s; // = new Stack<Integer>();;
    
	GfG()
	{
		s = new Stack<Integer>();
	}
	
	int getMin()
	{
		if(s.isEmpty())
			return -1;
		else
			return minEle;
	}
	int pop()
	{
		if(s.isEmpty())
			return -1;
		
		int t = s.pop();
		if(t < minEle)
		{
			int k = minEle;
			minEle = 2*minEle - t;
			return k;
		}
		else 
		{
			return t;
		}
	}
	void push(int x)
	{
		
		//System.out.println(s.peek());
		if(s.isEmpty())
		{
			minEle = x;
			s.push(x);
			return ;
		}
		else if(x < minEle)
			{
				s.push(2*x - minEle);
				minEle = x;
			}
			else
			{
				s.push(x);
			}
	}	
}

