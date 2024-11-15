package thigiuaky;
import java.util.Scanner;
public class Main {
public static void main(String[] agrs ) {
	Danhsach danhsach = new Danhsach();
	Scanner scanner = new Scanner(System.in);
	int chon;
	do {
		System.out.println("1.hien thi cac quyen sach");
		System.out.println("2.them vao danh sach");
		System.out.println("3.sua thong tin sach theo id");
		System.out.println("4.thoat");
		chon = scanner.nextInt();
		scanner.nextLine();
	switch(chon) {
	case 1 :
		danhsach.hienthi();
		break;
	case 2 :
		System.out.println("hay nhap ten sach ");
		String name = scanner.nextLine();
		System.out.println("hay nhap id");
		int id = scanner.nextInt();
		scanner.nextLine();
		System.out.println("hay nhap ten tac gia ");
		String tentacgia = scanner.nextLine();
		System.out.println("hay nhap ten nxb ");
		String nxb = scanner.nextLine();
		
	    danhsach.them(new Sach(id, name, tentacgia, nxb ));
	    break;
	case 3 :
		System.out.println("hay nhap id sach can sua");
		int sid = scanner.nextInt(); 
		System.out.println("hay nhap ten sach moi ");
		String newname = scanner.nextLine();
		System.out.println("hay nhap ten nxb moi ");
		String newnxb = scanner.nextLine();
		System.out.println("hay nhap ten tac gia moi ");
		String newtacgiasach = scanner.nextLine();
	    danhsach.sua(sid, newname, newnxb, newtacgiasach);
	    break;
	case 4:
		System.out.println("thoat");
		break;
	default:
	     System.out.println("chon sai roi");
	}} while (chon != 4);
	scanner.close();
}
}
