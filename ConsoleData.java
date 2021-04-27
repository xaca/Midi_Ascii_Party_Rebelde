import java.util.ArrayList;
import java.util.*;

public class ConsoleData{
	public static void processDescription(){

	}

	public static boolean isTitle(String line)
	{
		StringTokenizer st = new StringTokenizer(line,";");
		//String[] out = new String[st.countTokens()];
		//int count = 0;
		String temp;

		while(st.hasMoreTokens()){
			temp = st.nextToken();
			if(temp.length()>5){
				if(temp.substring(0,5).equals("https"))
				{
					return true;
				}
			}
			//System.out.print(token);
		}//System.out.println(); 
		return false;
	}

	public static String[][] dataList(String []data){
		ArrayList<String> out = new ArrayList<String>(); 

		for(int i=0;i<data.length;i++)
		{
			if(isTitle(data[i]))
			{
				//System.out.println(data[i]);
				out.add(i+";"+data[i]);
			}
		}
		return ConsoleFile.arrayListToMatrix(out);
	}
}