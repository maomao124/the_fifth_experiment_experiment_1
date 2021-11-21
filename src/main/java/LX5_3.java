/**
 * Project name(项目名称)：第五次实验 实验1
 * Package(包名): PACKAGE_NAME
 * Class(类名): LX5_3
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2021/11/21
 * Time(创建时间)： 20:49
 * Version(版本): 1.0
 * Description(描述)：
 * 1. 使用标准数据流的应用程序
 * 标准数据流指在字符方式下（如DOS 提示符）程序与系统进行输入输出的方式，键盘和显示器屏幕是标准输入输出设备，
 * 数据输入的起点为键盘，数据输出的终点是屏幕，输出的数据可以在屏幕上显示出来。
 * （1）程序功能：将键盘上输入的字符在屏幕上显示出来。
 * （2）编写LX5_3.java 程序文件，源代码如下。
 * (3)编译LX5_3.java 文件。
 * (4)在命令提示符窗口运行LX5_3.class 文件，并输入1234，结果如下图所示。
 */

public class LX5_3
{
    public static void main(String[] args) throws java.io.IOException
    {
        byte[] buffer = new byte[10];
        System.out.println("从键盘输入不超过10 个字符，按回车键结束输入：");
        int count = System.in.read(buffer);//读取输入的字符并存放在缓冲区buffer 中
        System.out.println("保存在缓冲区buffer 中元素的个数为：" + count);
        System.out.println("buffer 中各元素的值为：");
        for (int i = 0; i < count; i++)
        {
            System.out.print(" " + buffer[i]);//在屏幕上显示buffer 元素的值
        }
        System.out.println();
        System.out.println("输出buffer 字符元素：");
        System.out.write(buffer, 0, count);
    }

}
