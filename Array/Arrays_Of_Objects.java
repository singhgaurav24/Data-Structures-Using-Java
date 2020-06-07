class Student
	{
		public int rollno;
		String name;
		
		Student(int rollno, String name)
		{
			this.rollno = rollno;
			this.name = name;
		}
	}

public class Arrays_Of_Objects {
	
      public static void main(String[] args) {
		// TODO Auto-generated method stub
              Student arr[] = new Student[5];
             
              
              arr[0] = new Student(26,"gaurav");
              arr[1] = new Student(26,"gaurav");
              arr[2] = new Student(26,"gaurav");
              arr[3] = new Student(26,"gaurav");
              arr[4] = new Student(26,"gaurav");
              
              for(int i = 0;i<arr.length;i++)
              {
            	  System.out.println(arr[i].rollno +" "+arr[i].name);
              }
	}

}
