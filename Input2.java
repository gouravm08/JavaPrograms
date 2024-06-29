import java.io.*;
class Input2
{
	public static void main(String[]args) throws Exception
	{
		//FileWriter fw=new FileWriter("abc.txt",true);//for appending
		//fw.write();
		FileWriter fw=new FileWriter("abc.txt");//for overriding
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write("hello");
		bw.newLine();
		bw.write("gourav makwna");
		bw.flush();
		bw.close();
		// fw.write("Sukhmani apartment");
		// fw.write("301");
		// fw.write('\n');
		// fw.write("AB Road");
		// fw.write('\n');
		// fw.flush();
		// fw.close();
		// System.out.println("success");
	//	File f=new File("abc.txt");
	//	f.delete();
	}
}