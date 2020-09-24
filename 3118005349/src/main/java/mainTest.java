import org.junit.Assert;
import static org.junit.Assert.*;
public class mainTest {

    @org.junit.Test
    public void origAndOrig() {
        String s1=readToString.readToString("testfile/orig.txt");
        String s2=readToString.readToString("testfile/orig.txt");
        double sum=getCos.getCos(s1,s2);
        System.out.println("orig.txt"+"  "+sum);

    }
    @org.junit.Test
    public void origAndAdd() {
        String s1=readToString.readToString("testfile/orig.txt");
        String s2=readToString.readToString("testfile/orig_0.8_add.txt");
        double sum=getCos.getCos(s1,s2);
        System.out.println("orig_0.8_add.txt"+"  "+sum);

    }
    @org.junit.Test
    public void origAndDel() {
        String s1=readToString.readToString("testfile/orig.txt");
        String s2=readToString.readToString("testfile/orig_0.8_del.txt");
        double sum=getCos.getCos(s1,s2);
        System.out.println("orig_0.8_del.txt"+"  "+sum);

    }
    @org.junit.Test
    public void origAndDis1() {
        String s1=readToString.readToString("testfile/orig.txt");
        String s2=readToString.readToString("testfile/orig_0.8_dis_1.txt");
        double sum=getCos.getCos(s1,s2);
        System.out.println("orig_0.8_dis_1.txt"+"  "+sum);

    }
    @org.junit.Test
    public void origAndDis10() {
        String s1=readToString.readToString("testfile/orig.txt");
        String s2=readToString.readToString("testfile/orig_0.8_dis_10.txt");
        double sum=getCos.getCos(s1,s2);
        System.out.println("orig_0.8_dis_10.txt"+"  "+sum);

    }

    @org.junit.Test
    public void origAndDis15() {
        String s1=readToString.readToString("testfile/orig.txt");
        String s2=readToString.readToString("testfile/orig_0.8_dis_15.txt");
        double sum=getCos.getCos(s1,s2);
        System.out.println("orig_0.8_dis_15.txt"+"  "+sum);

    }
}