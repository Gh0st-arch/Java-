# Java-
Java课程作业项目仓库

## 实验目的
```
1.完成教材p110第四题关于PC、内存等模拟的程序。
```
```
2.学习使用构造方法构造变量。
```
```
3.根据课堂中关于访问权限的内容，学习使用多种定义属性的修饰符，体会修饰符private的用法。
```
```
4.强化java逻辑判断。
```

## 实验内容
·用类描述计算机中CPU的速度和硬盘的容量。要求Java应用程序有4个类,名字分别是PC、CPU、HardDisk、Test，其中Test是主类。
其中，PC类要求getSpeed()返回speed的值，要求setSpeed(int m)方法将参数m的值赋值给speed;HardDisk类要求getAmount()返回amount的值，要求setAmount(int m)方法将参数m的值赋值给amount;PC类要求setCPU(CPU c)将参数c的值赋值给cpu，要求setHardDisk(HardDisk h)方法将参数h的值赋值给HD，要求show()的方法能显示cpu的速度和硬盘的容量。
·主类Test的要求
（1）main方法中创建一个CPU对象cpu，cpu将自己的speed设置为2200。
（2）main方法中创建一个HardDisk对象disk，disk将自己amount设置为200。
（3）main方法中创建一个PC对象pc。
（4）pc调用setCPU(CPU c)方法，调用时实参是cpu。
（5）pc调用setHardDisk（HardDisk h）方法，调用时实参是disk。
（6）pc调用show()方法。

## 实验设计
·本实验设计了计算机模拟程序内的CPU和硬盘，其中CPU类有Speed属性，硬盘类有amount属性，PC里设计有密码属性，在主类里有用try和if来检测用户是否输入密码正确，用户需要输入密码才能查看CPU的速度和硬盘的容量，在PC里有CheckPasssword这个构造方法和inputPassword用以让用户输入密码，用CheckPassword构造PC类变量时赋予了PC一个密码为123456。

## 核心方法
1.
```
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
```
2.
```
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
```
3.
 ```
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
 ```


## 实验结果
![result](https://github.com/Gh0st-arch/Java-/blob/main/img/QQ%E6%88%AA%E5%9B%BE20201008201025.png)

## 实验感想
本次实验让我体会到了java这种面向对象编程的代码严谨的逻辑，强化了我对这种面向对象编程的思考能力，让我学习了如何使用权限修饰符来进行其他形式的访问对象。初步认识了java这种面对对象的简单编程，在有其他语言编程的基础上，体会到了面对对象与面对过程编程的区别，初步具备了编写简单小的java程序的能力。
