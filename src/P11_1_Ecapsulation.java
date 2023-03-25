class employeeee
{
    private int emid;
    public void setid(int id )
    {
        emid=id;
    }

    public int getid()
    {
        return emid;
    }

}


public class P11_1_Ecapsulation {
    public static void main(String[] args)
    {
        employeeee e=new employeeee();
        e.setid(5);
        System.out.println(e.getid());
    }
}
