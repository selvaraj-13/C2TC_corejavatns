package encapsul;

public class Demo {
	
String name,dept;
int num,regno;
float mark;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDept() {
	return dept;
}
public void setDept(String dept) {
	this.dept = dept;
}
public int getNum() {
	return num;
}
public void setNum(int num) {
	this.num = num;
}
public int getRegno() {
	return regno;
}
public void setRegno(int regno) {
	this.regno = regno;
}
public float getMark() {
	return mark;
}
public void setMark(float mark) {
	this.mark = mark;
}
@Override
public String toString() {
	return "Demo [name=" + name + ", dept=" + dept + ", num=" + num + ", regno=" + regno + ", mark=" + mark + "]";
}

}
