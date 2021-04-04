
package lab6;

public class NoofObjects {
    private static int objs=0;
    private int a;
    public NoofObjects(){
        objs++;
        
    }
    public NoofObjects(int x){
        a=x;
        objs++;
    }
    public static int getObjs(){
        return objs;
        
    }
}
