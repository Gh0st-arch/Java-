package package1;
public class PC {   
	CPU cpu;
	HardDisk HD;
	int CheckPassword;
	int inputPassword;
	public PC()
	{
		
	}
	public PC(int CheckPassword)
	{
		this.CheckPassword = CheckPassword;
	}
	void inputPassword(int p)
	{
		this.inputPassword = p;
	}
	int getPassword()
	{
		return inputPassword;
	}
	void setCPU(CPU c)
	{
		cpu = c;
	}
	void setHardDisk(HardDisk h)
	{
		HD = h;
	}
	void show()
	{
		System.out.println("Your CPU speed is :"+cpu.getSpeed());
		System.out.println("Your HardDisk amount is :"+HD.getAmount());
	}
}
