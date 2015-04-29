package view;

import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;

import control.CGangjwaControl;
import entity.CGangjwa;
import entity.CSugang;
import entity.VUser;
import exception.GangjwaIDMismatchingException;

public class CSugangView extends CView{

	public void sugangSinCheong(VUser vUser) throws IOException, GangjwaIDMismatchingException {
		// show Gangjwa List

		CGangjwaControl gangjwaControl = (CGangjwaControl) this.getControl();
		Vector<CGangjwa> gangjwaList = gangjwaControl.getGangwaList();
		System.out.println("����ID�� �Է��ϼ���");
		for(CGangjwa gangjwa: gangjwaList){
			System.out.println("���� ID : "+gangjwa.getId()+" "+gangjwa.getName());
		}
		Scanner scanner = new Scanner(System.in);
		System.out.print("����ID : ");
		String gangjwaID = scanner.next();
		//���� ��ȣ�� ��ȿ�� Ȯ��
		for(CGangjwa gangjwa: gangjwaList){
			if(gangjwa.getId().equals(gangjwaID)) {
				CSugang sugang = new CSugang(vUser.getUserID(), gangjwa.getId());
				gangjwaControl.sugangSincheong(sugang);
				return;
			}
		}
		throw new IOException("���� ID�� ��ġ���� �ʽ��ϴ�.");
		
	}

}
