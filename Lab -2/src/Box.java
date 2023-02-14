public class Box {
    public int height;
    public int width;
    public int length;
    static void Calculate_area(int height,int width,int length){

        System.out.println(height*width*length);
    }
    static void Calculate_area(int height,int width){

        System.out.println(height*width);
    }
    public void display(){
        System.out.println(height+" "+width+" "+length);

    }
    public static void main(String[] args){
        Box b1=new Box();
        b1.height=3;
        b1.length=2;
        b1.width=5;
        b1.display();
        Calculate_area(2,4,6);
        Calculate_area(2,4);
    }
}