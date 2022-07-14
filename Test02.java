package topic.test2;

/**
 * @author yaokoo
 * @create 2022/7/7 16:21
 */
public class Test02 {


    public static void main(String[] args) {
        int i = multiply(24);

        /*System.out.println(toInt(toByte(i)));*/


/*        int anInt=shortToInt((short) 123,(short) 321);
        short[] shorts = IntToShort(anInt);

        for (int j = 0; j < shorts.length; j++) {
            System.out.println(shorts[j]);
        }*/

        int n = charToInt('a', 'b');
        char[] chars = intToChar(n);
        for (int j = 0; j < chars.length; j++) {
            System.out.println(chars[j]);
        }

    }

    //1.用位移的方式 将值int值 乘以2
    public static int multiply(int n) {
        int res = n << 1;
        return res;
    }

    //用位移的方式 将该int值取出 有值的位置 并打印出位置的index
    public static byte[] toByte(int n) {
        byte[] bytes = new byte[4];
        bytes[3] = (byte) n;
        bytes[2] = (byte) (n >> 8);
        bytes[1] = (byte) (n >> 16);
        bytes[0] = (byte) (n >> 24);
        return bytes;
    }

    public static int toInt(byte[] bytes) {
        int num = 0;
        for (int i = 0; i < 4; i++) {
            if (bytes[i] != 0) {
                System.out.println("有值的位置是第" + i + "个元素");
            }
            num += bytes[i] << (4 - 1 - i) * 8;
        }
        return num;
    }

    //将两个short的值写入int 并取出值
    //0000 0000 0111 1011  123       0000 0000 0111 1011 0000 0001 0100 0001
    //0000 0001 0100 0001  321
    public static int shortToInt(short s1, short s2) {
        return (int) (s1 << 16) | s2;
    }

    public static short[] IntToShort(int n) {
        short[] shorts = new short[2];
        shorts[1] = (short) n;
        shorts[0] = (short) (n >> 16);
        return shorts;
    }

    //将4(2)个char类型写入int 并取出char的ascii的值和字符值
    public static int charToInt(char a, char b) {
        return (int) (a << 16) | b;

    }

    public static char[] intToChar(int n) {
        char[] chars = new char[2];
        chars[1] = (char) n;
        chars[0] = (char) (n >> 16);
        for (int i = 0; i < chars.length; i++) {
            int val = Integer.valueOf(chars[i]);
            System.out.println(chars[i] + "的ascii值为" + val);
        }
        return chars;
    }

}
