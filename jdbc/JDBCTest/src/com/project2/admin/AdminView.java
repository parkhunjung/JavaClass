package com.project2.admin;

import java.util.Scanner;

import com.project2.main.MainView;

public class AdminView {

	public final static int TEACHERACCOUNTMNG = 1;
	public final static int OPENCOURSE_SUBJECTMNG = 2;
	public final static int STUDENTMNG = 3;
	public final static int ATTENDANCEMNG = 4;
	public final static int TESTMNG_SCORECHECK = 5;
	public final static int ADD = 1;
	public final static int EDIT = 2;
	public final static int LIST = 3;
	public final static int SCOREJOHAE = 2;
	public final static int PILGI = 1;
	public final static int SILGI = 2;

	private MainView mview;

	public AdminView() {

		mview = new MainView();

	}

	public void login() {
		System.out.println();
		System.out.println("[관리자 로그인 화면]");
	}

	public void loginSucess() {
		System.out.println();
		System.out.println("로그인 성공이야 !!!");
	}

	public void begin() {
		System.out.println();
		System.out.println("관리자 계정 시작합니다.");

	}

	public void menu() {

		System.out.println("============================");
		System.out.println("[관리자 메뉴]");
		System.out.println("1. 강사 계정 관리");
		System.out.println("2. 개설 과정 & 과목 관리");
		System.out.println("3. 교육생 관리");
		System.out.println("4. 출결 관리 및 조회");
		System.out.println("5. 시험 관리 및 성적 조회");
		System.out.println("0. 뒤로가기");
		System.out.println("============================");
		System.out.print("선택 : ");

	}

	public void end() {
		System.out.println();
		System.out.println("관리자 계정 종료합니다.");

	}

	public void title(int n) {

		if (n == AdminView.TEACHERACCOUNTMNG) {
			System.out.println();
			System.out.println("[강사 계정 관리]");
		} else if (n == AdminView.OPENCOURSE_SUBJECTMNG) {
			System.out.println();
			System.out.println("[개설 과정 & 과목 관리]");
		} else if (n == AdminView.STUDENTMNG) {
			System.out.println();
			System.out.println("[교육생 관리]");
		} else if (n == AdminView.ATTENDANCEMNG) {
			System.out.println();
			System.out.println("[출결 관리 및 조회]");
		} else if (n == AdminView.ATTENDANCEMNG) {
			System.out.println();
			System.out.println("[시험 관리 및 성적 조회]");
		}
/////////////////////////////////////////////////////////////////////////////////////////////////////////////
	}

	public void teacherbegin() {
		System.out.println();
		System.out.println("강사 계정 관리를 시작합니다.");

	}

	public void teachermenu() {
		System.out.println("============================");
		System.out.println("1. 강사 정보 입력");
		System.out.println("2. 강사 정보 수정");
		System.out.println("3. 강사 정보 출력(삭제)");
		System.out.println("0. 뒤로가기");
		System.out.println("============================");
		System.out.print("선택 : ");

	}

	public void teacherend() {
		System.out.println();
		System.out.println("강사 계정 관리를 종료합니다.");

	}

	public void teachertitle(int n) {

		if (n == AdminView.ADD) {
			System.out.println();
			System.out.println("[강사 정보 입력]");

		} else if (n == AdminView.EDIT) {
			System.out.println();
			System.out.println("[강사 정보 수정]");
			System.out.println("[번호]\t[이름]\t\t\t[전화번호]\t[주소]");//0417헌정수정
		} else if (n == AdminView.LIST) {
			System.out.println();
			System.out.println("[강사 정보 삭제]");
			System.out.println("[번호]\t[이름]\t\t\t[주민등록번호]\t[전화번호]\t[등록일]\t[상태]\t[주소]");
		}
	}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////	

	public void opencourseMenu() {

		System.out.println("============================");
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("0. 뒤로가기");
		System.out.println("============================");
		System.out.print("선택 : ");

	}

	public void opencoursetitle(int n) {

		if (n == AdminView.ADD) {
			System.out.println();
			System.out.println("[입력]");
		} else if (n == AdminView.EDIT) {
			System.out.println();
			System.out.println("[수정]");
		} else if (n == AdminView.LIST) {
			System.out.println();
			System.out.println("[조회]");
			System.out.println("[과목명]\t[시작일]\t[종료일]\t[강사이름]\t[교재명]");

		}

	}
/////////////////////////////////////////////////////////////////////////////////////////////////////////////

	public void opencourse_studentmng() {
		System.out.println();
		System.out.println("[교육생 관리 메뉴]");

	}

	public void studentmng() {
		System.out.println("============================");
		System.out.println("1. 교육생 정보 입력");
		System.out.println("2. 교육생 정보 수정");
		System.out.println("3. 교육생 정보 조회");
		System.out.println("0. 뒤로가기");
		System.out.println("============================");
		System.out.print("선택 : ");

	}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////

	public void opencourse_attendancemng() {
		System.out.println();
		System.out.println("[출결관리 및 조회 메뉴]");

	}

	public void attendancemng() {
		System.out.println("============================");
		System.out.println("1. 교육생 출결 관리");
		System.out.println("2. 교육생 출결 조회");
		System.out.println("0. 뒤로가기");
		System.out.println("============================");
		System.out.print("선택 : ");
	}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////

	public void opencourse_attend_inquiry() {
		System.out.println();
		System.out.println("[출결조회 메뉴]");

	}

	public void attend_inquiry() {
		System.out.println("============================");
		System.out.println("1. 교육생 전체 출결 조회");
		System.out.println("2. 교육생 출결 일별 조회");
		System.out.println("3. 교육생 출결 월별 조회");
		System.out.println("4. 교육생 출결 연도별 조회");
		System.out.println("5. 과정별 출결 조회");
		System.out.println("0. 뒤로가기");
		System.out.println("============================");
		System.out.print("선택 : ");
	}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////	   


	public void testmng_scoreChecktitle(int n) {

		if (n == AdminView.ADD) {
			System.out.println();
			System.out.println("[시험 및 성적 등록 여부]");
		} else if (n == AdminView.SCOREJOHAE) {
			System.out.println();
			System.out.println("[성적조회하기]");
		}

	}

	public void testmng_scoreCheckMenu() {
		System.out.println();
		System.out.println("[관리자의 시험 관리 및 성적 조회]");

		System.out.println("============================");
		System.out.println("1. 시험 및 성적 등록 여부");
		System.out.println("2. 성적조회하기");
		System.out.println("0. 뒤로가기");
		System.out.println("============================");
		System.out.print("선택 : ");

	}

	public void scoreAddstart() {
		System.out.println();
		System.out.println("[관리자의 시험 및 성적 등록 여부]");

	}

	public void scoreLISTStart() {
		System.out.println();
		System.out.println("[관리자의 성적 조회]");

	}

	public void scoreLISTMenu() {
		System.out.println("============================");
		System.out.println("1. 과목별 성적 조회하기");
		System.out.println("2. 교육생별 성적 조회하기");
		System.out.println("0. 뒤로가기");
		System.out.println("============================");
		System.out.print("선택 : ");

	}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	// 헌정 추가 => 회원상태
	public void student_editcolumn() {
		System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
		System.out.println("[번호]\t[이름]\t\t\t[주민번호]\t[전화번호]\t[상태]\t[주소지]"); //(헌정0417수정)
		System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
	}
	public void student_eline() {
		System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
	}
	
	public void student_columnname() {
		System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
		System.out.println("[번호]\t[이름]\t\t\t[주민번호]\t[전화번호]\t[등록일]\t[상태]\t[주소지]"); //(헌정0417수정)
		System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
	}
	
	public void student_cline() {
		System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
	}
	

	public void attend_day() {
		System.out.println();
		System.out.println("[일별 출결 조회]");
		System.out.println("[출근날짜]\t[출근시간]\t[퇴근시간]\t[이름]\t\t\t\t[상태]\t\t[과정명]"); //(0417 헌정수정)
	}

	public void attend_month() {
		System.out.println();
		System.out.println("[월별 출결 조회]");
		System.out.println("[출근날짜]\t[출근시간]\t[퇴근시간]\t[이름]\t\t\t\t[상태]\t\t[과정명]"); //(0417 헌정수정)
	}

	public void attend_year() {
		System.out.println();
		System.out.println("[년도별 출결 조회]");
		System.out.println("[출근날짜]\t[출근시간]\t[퇴근시간]\t[이름]\t\t\t\t[상태]\t\t[과정명]"); //(0417 헌정수정)
	}
	
	public void attend_whole() {
		System.out.println();
		System.out.println("[교육생 전체 출결 조회]");
		System.out.println("[교육생명]\t[과정명]\t[출근시간]\t[퇴근시간]\t\t[상태]");
	}
	
	
	
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		   
	public void scoreLISTtitle(int n) {

		if (n == AdminView.ADD) {
			System.out.println();
			System.out.println("[교육생별 성적 조회]");
			System.out.println("[교육생명]\t\t\t[주민번호뒷자리]\t[개설 과정명]\t\t\t\t[개설과정기간]\t\t[강의실명]\t[강사명]\t[개설 과목명]\t\t[개설 과목기간]\t\t\t\t[필기]\t[실기]");
		} else if (n == AdminView.SCOREJOHAE) {
			System.out.println();
			System.out.println("[과목별 성적 조회]");
			System.out.println("[강사명]\t[과정명]\t\t\t\t[과정기간]\t\t[강의실명]\t[과목명]\t[교재명]\t[교육생이름]\t[주민번호뒷자리]\t[필기]\t[실기]");
		}

	}

	public void scoreAddmenu() {
		System.out.println("============================");
		System.out.println("1. 필기 등록 여부");
		System.out.println("2. 실기 등록 여부");
		System.out.println("0. 뒤로가기");
		System.out.println("============================");
		System.out.print("선택 : ");

	}

	public void scoreAddtitle(int n) {

		if (n == AdminView.PILGI) {
			System.out.println();
			System.out.println("[필기 등록 여부]");
			System.out.println("[과목명]\t\t[시험문제 등록 여부]\t[성적 등록 여부]");//0417헌정수정
		} else if (n == AdminView.SILGI) {
			System.out.println();
			System.out.println("[실기 등록 여부]");
			System.out.println("[과목명]\t\t[시험문제 등록 여부]\t[성적 등록 여부]");//0417헌정수정
		}

	}

	public void pause() {
		mview.pause();
	}

	public void pauseBack() {
		mview.pauseBack();
	}

	public void attend_management() {
		System.out.println();
		System.out.println("[관리자 출결관리]");
		
	}

	public void attend_subject() {
		System.out.println();
		System.out.println("[과목별 출결조회]");
	}

	public void attend_subjectsub() {
		System.out.println();
		System.out.println("[교육생명]\t\t\t[상태]\t[출석시간]\t\t\t[과정번호]\t[과정명]\t\t\t\t\t[과정기간]");//헌정0417수정
	}
	
	///예찬's 뷰
	public void emptyroomtitle() {/* 예찬 */
		System.out.println();
		System.out.println("[비어있는 강의실 정보입니다.]");
		System.out.println("[번호]\t[비어있는 강의실명]\t[강의실 정원]");
	}

	public void subjectList() {/* 예찬 */
		System.out.println();
		System.out.println("[등록 가능한 과목 정보입니다.]");
		System.out.println("[번호]\t[과목명]");
	}

	public void teacherList() {/* 예찬 */
		System.out.println();
		System.out.println("[해당 과목 가능한 강사 정보입니다.]");
		System.out.println("[번호]\t[강사명]\t[나이]\t[등록일]");

	}

	public void bookList() {/* 예찬 */
		System.out.println();
		System.out.println("[해당 과목 교재 정보입니다.]");
		System.out.println("[번호]\t[교재명]\t[출판사]");

	}

	public void registCourseSuccess(int courseResult) {/* 예찬 */

		if (courseResult == 1) {
			System.out.println("[과정 정보 등록 완료]");
		} else {
			System.out.println("[과정 정보 등록 실패]");
		}

	}

	public void registCourseSubjectSuccess(int courseSubjectResult, int i) {/* 예찬 */

		if (courseSubjectResult == 1) {
			System.out.printf("[%d과목 정보 등록 완료]\n", i + 1);
		} else {
			System.out.printf("[%d과목 정보 등록 실패]\n", i + 1);
		}

	}

	public void courseList() {/* 예찬 */
		System.out.println();
		System.out.println("[전체 과정 정보입니다.]");
		System.out.println("[과정번호]\t[과정명]\t\t\t\t[시작일]\t\t[종료일]\t\t[강의실명]\t[상태]\t[비고]");

	}

	public void studentList() {/* 예찬 */
		System.out.println();
		System.out.println("[해당 과정의 교육생 정보]");
		System.out.println("[교육생번호]\t[교육생명]\t\t[주민등록번호]\t\t[전화번호]\t\t[주소]");
	}

	public void soloStudent() {
		System.out.println();
		System.out.println("[특정 교육생의 정보]");
		System.out.println("[교육생이름]\t[주민등록번호]\t\t[전화번호]\t\t[주소]\t\t\t\t[수강중인과정]\t\t\t\t[과정기간]\t\t[강의실명]\t[수료및중도탈락여부]\t[수료및중도탈락날짜]\t[상태]");
	}

	public void attSearch() {
		System.out.println();
		System.out.println("특정 교육생의 출결정보");
		System.out.println("[교육생명]\t\t\t[출근시간]\t\t[퇴근시간]\t\t[상태]\t[과정명]");
		
	}//없어서 추가한 뷰(헌정0417수정)
	
	
}













