import java.util.Scanner;

public class Book 
{
     private String tensach;
     private int giabia;
    Book(String tensach,int giabia)
    {
    	 this.tensach=tensach;
    	 this.giabia=giabia;
     }
     public String getTensach() {
		return tensach;
	}
	public void setTensach(String tensach) {
		this.tensach = tensach;
	}
	public int getGiasach() {
		return giabia;
	}
	public void setGiasach(int giabia) {
		this.giabia = giabia;
	}
	void getBook()
    {
     Scanner sc= new Scanner(System.in);
   	 System.out.println("nhap ho ten sach: ");
   	 tensach=sc.nextLine();
   	 System.out.println("nhap dia chi: ");
   	 giabia=sc.nextInt();
   	 }
	public int tinhVAT(int giabia) 
	{
		return (int) (giabia*0.05);
	}
     public void in()
    {
        System.out.println("Ten: "+tensach+"gia bia "+giabia);	
      }
     public static void main(String[] args) 
     {
    	Book sach=new Book("sach lap trinh",1000000) ;
    	sach.in();
    	
    
     }
    
}
