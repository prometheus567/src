package thigiuaky;
import java.util.ArrayList;
import java.util.List;
public class Danhsach {
private List<Sach> dssach = new ArrayList<>();
private Sach timsach(int id) {
	for(Sach sach : dssach) {
		if(sach.getId()==id) {
			return sach;
		}
	}return null;
}
public void them(Sach sach) {
	dssach.add(sach);
}
public void sua(int id, String newname, String newnxb, String newtentacgia) {
	Sach sach = timsach(id);
	if(sach != null) {
		sach.setName(newname);
		sach.setNxb(newnxb);
		sach.setTentacgia(newtentacgia);
	}else {
		System.out.println("khong tim thay");
	}
}
public void hienthi() {
	for(Sach k : dssach) {
		System.out.println(k);
	}
}
}
