public class MyVector extends Object {

    public String ten;
    public int tuoi;

    public MyVector(String i, int i1) {
        this.ten = i;
        this.tuoi = i1;

    }
    public MyVector add(MyVector other)
    {
        return new MyVector(ten + other.ten, tuoi + other.tuoi);
    }
    public String toString()
    {
        return "(" + ten + " , " + tuoi + ")";
    }

}
