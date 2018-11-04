package cc.mivisi.language;  
/**  
 * ClassName:InputStream <br/>  
 * Function:  <br/>  
 * Date:     2018年9月24日 下午2:51:37 <br/>       
 */
public class InputStreamCodeDemo {
    public static void main(String[] arg) throws Exception {
        String s = "慕课网ABC";
        // 转换成字节序列用的是项目默认的编码方式（该项目默认为 utf-8）
        byte[] bytes1 = s.getBytes();
        //utf-8编码中文占3个字节，编码英文占1个字节
        for (byte b : bytes1) {
            // 把字节转换成了int，以16进制的方式显示
            System.out.print(Integer.toHexString(b & 0xff) + " ");
        }
        System.out.print("\n");
        
        //把字符串按指定格式的编码（gbk）转换成字节
        byte[] bytes2 = s.getBytes("gbk");
        //gbk编码中文占两个字节，英文占1个字节
        for(byte b : bytes2) {
            //把字节转换成了int，以16进制方式显示
            System.out.print(Integer.toHexString(b & 0xff) + " ");
        }
        System.out.print("\n");
        
        //java是双字节编码 utf-16be
        byte[] bytes3 = s.getBytes("utf-16be");
        //utf-be 中文占用2个字节，英文占用2个字节
        for(byte b : bytes3) {
            System.out.print((b & 0xff) + " ");
        }
        System.out.print("\n");
        
        /*
         * 当你的字节序列是某种编码时，这个时候想把字节序列转换
         * 成字符串时，也需要用这种编码方式，否则会出现乱码
         */
        //不指定编码方式时，用项目默认的编码（当前为utf-8）
        //因为bytes3编码方式为utf-16be,故会出现乱码
        String str1 = new String(bytes3);
        System.out.println(str1);
        //改为如下形式就不会有乱码
        String str2 = new String(bytes3, "utf-16be");
        System.out.println(str2);
        
        //相应的bytes1的编码方式 是默认的编码方式（utf-8）
        String str3 = new String(bytes1);
        String str4 = new String(bytes1, "utf-8");
        System.out.println(str3 + " " + str4);
        
        //bytes2的编码方式为gbk
        String str5 = new String(bytes2, "gbk");
        System.out.print(str5);
        
        /*
         * 文本文件 就是字节序列
         * 可以是任意编码的字节序列
         * 如果我们在中文机器上直接创建文本文件
         * 那么该文本文件只认识ansi编码
         * 中文系统下ansi编码代表gbk编码
         * 文本文件可以识别任意类型的文本文件，若把文件拷贝到机器上则不会出现乱码
         * 联通、联这是一种巧合，他们正好符合了utf-8编码的规则。
         *<strong><span style="color:#ff6666;"> eclipse编辑器中的每个项目都有自己的编码方式
         * 该项目设置为什么编码方式，则该项目中的文本文件必须为该编码方式
         * 否则会出现乱码
         * 若另外的编码方式文本内容拷贝到该项目的文本文件中，则不会出现乱码
         * 因为，编辑器会自动转换成对应的编码方式显示</span></strong>
         * 
         */
    }



}
  
