public class Rectangle {
    int len;
    int wid;

    int perim(){
        return len * wid;
    }

    void init(int len, int wid){
        this.len = len;
        this.wid = wid;
    }
}
