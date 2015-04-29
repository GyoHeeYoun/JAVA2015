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
		System.out.println("강좌ID를 입력하세요");
		for(CGangjwa gangjwa: gangjwaList){
			System.out.println("강좌 ID : "+gangjwa.getId()+" "+gangjwa.getName());
		}
		Scanner scanner = new Scanner(System.in);
		System.out.print("강좌ID : ");
		String gangjwaID = scanner.next();
		//강좌 번호의 유효성 확인
		for(CGangjwa gangjwa: gangjwaList){
			if(gangjwa.getId().equals(gangjwaID)) {
				CSugang sugang = new CSugang(vUser.getUserID(), gangjwa.getId());
				gangjwaControl.sugangSincheong(sugang);
				return;
			}
		}
		throw new IOException("강좌 ID가 일치하지 않습니다.");
		
	}

}
