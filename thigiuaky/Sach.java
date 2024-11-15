package thigiuaky;

public class Sach {
private int id;
private String name;
private String tentacgia;
private String nxb;
public Sach(int id, String name, String tentacgia, String nxb) {
	this.id=id;
	this.name=name;
	this.tentacgia=tentacgia;
	this.nxb=nxb;
	
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getTentacgia() {
	return tentacgia;
}
public void setTentacgia(String tentacgia) {
	this.tentacgia = tentacgia;
}
public String getNxb() {
	return nxb;
}
public void setNxb(String nxb) {
	this.nxb = nxb;
}
@Override
public String toString() {
	return "sach ten "+name+" co id la "+id+" co nha xuat ban la "+nxb+" va co tac gia la "+tentacgia;
}
}
