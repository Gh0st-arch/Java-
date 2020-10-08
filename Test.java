package package1;
import java.util.Scanner;
public class Test {
	public static void main(String args[]) {
		CPU cpu = new CPU();
		cpu.setspeed(2200);
		HardDisk disk = new HardDisk();
		disk.setAmount(200);
		PC pc = new PC(123456);
		pc.setCPU(cpu);
		pc.setHardDisk(disk);
		System.out.println("Please input Password");
		try (Scanner reader = new Scanner(System.in)) 
		{
			pc.inputPassword(reader.nextInt());
		}
		if(pc.CheckPassword == pc.getPassword())
		{
			pc.show();
			Test.Checksuccess();
		}
		else
		{
			Test.Checkfail();
		}
	}
	static void Checksuccess()
	{
		System.out.println("Test success!");
	}
	static void Checkfail()
	{
		System.out.println("Test failed!");
	}
}
