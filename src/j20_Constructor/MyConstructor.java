package j20_Constructor;

public class MyConstructor {
    int x=3;
    int y=5;
    public MyConstructor() {
        x+=1;//inst. variable +1 update edildi
        System.out.println("-x"+x);
    }
    public MyConstructor(int i ){
        this();//p'siz cons. call edildi
        this.y = i;//conc. parametresi i değeri inst. variable y'ye atandı
        x+=y;//inst. y değeri inst. x değerine atandı
        System.out.println("-x"+x);
    }
    public MyConstructor(int i, int i2) {
        this(3);//int p'li cons.  parametre 3 atanarak call edildi
        this.x -= 4;//inst. x variable -4  update edildi
        System.out.println("-x"+x);
    }
    public static void main(String[] args) {
        MyConstructor mc1= new MyConstructor(4,3);//2 int parametre 4 ve 3 atanarak cons. call edildi
    }
}