package sample;

public class Student 
{
String name ;
int id;
int age;
public Student(String name,int id,int age)
  {
	super();
	this.name=name;
	this.id=id;
	this.age=age;
  }
public String toString()
{
	return (" Student name :"+name +"\n Student ID :"+id +"\n AGE :"+age);
}
}
