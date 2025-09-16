public class Box {
    int h, w, d;

    public Box(){
        h = w = d = 0;
    }

    public Box(int i){
        h = w = d = i;
    }

    public Box(int i, int j){
        h = w = i;
        d = j;
    }

    public Box(int i, int j, int k){
        h = i;
        w = j;
        d = k;
    }

    public void volume(){
        System.out.println("Volume of Box is "+(h*w*d));
    }
}
