package NoteBook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class note {
	static ArrayList<String> Content_list = new ArrayList<>(); 
	static ArrayList<String> Status_list = new ArrayList<>();
	static note note = new note();
	public static void main(String[] args) {
		
	
	while(true){
		note.menu();
		int choice;
		choice=note.InputInt();
		if(choice==1) {
			System.out.print("�����������¼�Ĵ������");
			String string2 = InputString();
			note.Add(string2);
		}
		else if(choice==2){
			note.printnt();
			System.out.print("ѡ������ɾ�������");
			int input=note.InputInt();
			note.Delete(input);
		}
		else if(choice==3){
			note.printnt();
			int choose;
			System.out.print("ѡ�������޸ĵ����");
			int input=note.InputInt();
			System.out.print("ѡ�������޸ĵ�״̬T/F(0��ʾF��1��ʾT)��");
			choose=note.InputInt();
			if(choose==1) note.Change_status(input, true);
			else if(choose==0) note.Change_status(input, false);
		}
		else if(choice==4){
			note.printnt();
		}
		else if(choice==5) {
			System.out.print("--------Wecome!--------");
			break;
		}
		
		
	}
	
		
		
	}
	//״̬���
	public  void menu(){
		System.out.print("--------NoteBook--------\n");
		
		System.out.println("1.��Ӵ�������\n2.ɾ����������\n3.�ı���������״̬\n4.��ѯ��ǰ���������¼\n5.�˳�");
		System.out.print("��ѡ��");
	}
	
	
	public static String InputString() {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		return s;
	}
	
	
	
	//ѡ����ӣ�ɾ�����޸ĺ��˳�����--����int
	public  int InputInt() {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		return x;
	}
	//ɾ����������--����boolean
	public  boolean Delete(int index) {
	try{
		System.out.print("ɾ�����");
		System.out.print(Content_list.get(index-1));
		Content_list.remove(index-1);
		Status_list.remove(index-1);
		}catch(Exception e){
			System.out.print("��ǰ�޿�ɾ����\n");
			return false;
		}
		return true;
	}
	//�����������--����boolean
	public  boolean Add(String s) {
		System.out.print("�������");
		System.out.print(s+"\n");
	
		Content_list.add(s);
		Status_list.add("δ���");
		return true;
	}
	//�޸�״̬--����boolean
    public void Change_status(int index,boolean b) {
    	
		try{
    	if(b) Status_list.set(index-1,"�����");
    	else Status_list.set(index-1, "δ���");
    	System.out.printf("%d:�޸����\n",index);
    	}catch(Exception e){
    		e.printStackTrace();
    		System.out.print("��ǰ�޿��޸���");
    		
    	}
	}
    //��ӡ��ǰ����Ŀ¼--����boolean
    public  void printnt(){
    	int i;
		for(i=0;i<Content_list.size();i++) {
			System.out.printf("%d\n", i+1);
			System.out.println("���ݣ� "+Content_list.get(i));
			System.out.println("���ԣ� "+Status_list.get(i));
		}	
    }

}
