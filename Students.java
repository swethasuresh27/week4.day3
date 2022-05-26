package week4.day3;

public class Students {
	public void getStudentInfo(int studentId,String name) {
		System.out.println("StudentId:"+studentId+" "+"Studentname:"+name);
	}
	public void getStudentInfo(String email,long phoneNumber) {
		System.out.println("EmailId:"+email+" "+"PhoneNumber:"+phoneNumber);
	}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	        Students stud = new Students();
	        stud.getStudentInfo(101,"Swetha");
	        stud.getStudentInfo("swethasujas@gmail.com",6385383743l);
	}

}
