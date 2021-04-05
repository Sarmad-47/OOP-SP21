package lab6;

public class NoofObjectsRunner {

    public static void main(String[] args) {
        NoofObjects o1 = new NoofObjects();
        NoofObjects o2 = new NoofObjects(122);
        NoofObjects o3 = new NoofObjects(150);
        System.out.println("Objects created:" + NoofObjects.getObjs());
        System.out.println("Objects created:" + o1.getObjs());
    }

}
