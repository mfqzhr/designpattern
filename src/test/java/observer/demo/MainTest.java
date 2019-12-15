package observer.demo;

import observer.demo.observers.concrete.DigitalObserver;
import observer.demo.observers.concrete.GraphObserver;
import observer.demo.subjects.concrete.EvenNumberGenerator;
import observer.demo.subjects.concrete.OddNumberGenerator;
import observer.demo.subjects.concrete.RandomNumberGenerator;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;

/**
 * @author 穆繁强
 * @date 2019/12/4
 */
public class MainTest {

    /**
     * 测试随机数计数器,只有数字观察者
     */
    @Test
    public void test1() {
        new RandomNumberGenerator()
                .addObserver(new DigitalObserver())
                .execute();
    }

    /**
     * 测试随机数计数器,只有图形观察者
     */
    @Test
    public void test2() {
        new RandomNumberGenerator()
                .addObserver(new GraphObserver())
                .execute();
    }

    /**
     * 测试随机数计数器,同时有图形观察者和数字观察者
     */
    @Test
    public void test3() {
        new RandomNumberGenerator()
                .addObserver(new GraphObserver())
                .addObserver(new DigitalObserver())
                .execute();
    }

    /**
     * 测试偶数计数器,同时有图形观察者和数字观察者
     */
    @Test
    public void test4() {
        new EvenNumberGenerator()
                .addObserver(new GraphObserver())
                .addObserver(new DigitalObserver())
                .execute();
    }

    /**
     * 测试奇数计数器,同时有图形观察者和数字观察者
     */
    @Test
    public void test5() {
        new OddNumberGenerator()
                .addObserver(new GraphObserver())
                .addObserver(new DigitalObserver())
                .execute();
    }


    @Test
    public void test6() throws Exception {
        String filePath = "src/aaa.png";
        File f = new File(filePath);
        System.out.println(f.exists());

        FileInputStream fis = new FileInputStream(filePath);
        FileChannel fileChannelSrc = fis.getChannel();

        FileOutputStream fos = new FileOutputStream("src/bbb.png");
        FileChannel fileChannelDt = fos.getChannel();

        //fileChannelSrc.transferTo(0,fileChannelSrc.size(),fileChannelDt);
        System.out.println(fileChannelSrc.size());
        fileChannelDt.transferFrom(fileChannelSrc,0,fileChannelSrc.size());

        fileChannelSrc.close();
        fileChannelDt.close();
        fis.close();
        fos.close();
    }
}
