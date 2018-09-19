package cc.mivisi;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Enumeration;

/**
 * ClassName:IPAddress <br/>
 * Function: <br/>
 * Date: 2018年9月9日 下午2:57:48 <br/>
 */
public class IPAddress {
    public static void main(String[] args) throws SocketException, UnknownHostException {
        // 方式1，linux下存在着缺陷
        InetAddress ia = InetAddress.getLocalHost();
        String hostAddress = ia.getHostAddress();
        System.out.println("hostAddress--->" + hostAddress);

        String localMac = getLocalMac(ia);
        System.out.println("macAddress--->" + localMac);

        // 方式2，最优解
        InetAddress ias = getLocalHostLANAddress();
        String hostAddresss = ias.getHostAddress();
        System.out.println("hostAddresss--->" + hostAddresss);
        String localMac2 = getLocalMac(ias);
        System.out.println("macAddress--->" + localMac2);

    }

    private static String getLocalMac(InetAddress ia) throws SocketException {
        // TODO Auto-generated method stub
        // 获取网卡，获取地址
        byte[] mac = NetworkInterface.getByInetAddress(ia).getHardwareAddress();
        StringBuffer sb = new StringBuffer("");
        for (int i = 0; i < mac.length; i++) {
            if (i != 0) {
                sb.append("-");
            }
            // 字节转换为整数
            int temp = mac[i] & 0xff;
            String str = Integer.toHexString(temp);
            // System.out.println("每8位:"+str);
            if (str.length() == 1) {
                sb.append("0" + str);
            } else {
                sb.append(str);
            }
        }
        return sb.toString();
    }

    public static InetAddress getLocalHostLANAddress() throws UnknownHostException {
        try {
            InetAddress candidateAddress = null;
            // 遍历所有的网络接口
            for (Enumeration ifaces = NetworkInterface.getNetworkInterfaces(); ifaces
                    .hasMoreElements();) {
                NetworkInterface iface = (NetworkInterface) ifaces.nextElement();
                // 在所有的接口下再遍历IP
                for (Enumeration inetAddrs = iface.getInetAddresses(); inetAddrs
                        .hasMoreElements();) {
                    InetAddress inetAddr = (InetAddress) inetAddrs.nextElement();
                    if (!inetAddr.isLoopbackAddress()) {// 排除loopback类型地址
                        if (inetAddr.isSiteLocalAddress()) {
                            // 如果是site-local地址，就是它了
                            return inetAddr;
                        } else if (candidateAddress == null) {
                            // site-local类型的地址未被发现，先记录候选地址
                            candidateAddress = inetAddr;
                        }
                    }
                }
            }
            if (candidateAddress != null) {
                return candidateAddress;
            }
            // 如果没有发现 non-loopback地址.只能用最次选的方案
            InetAddress jdkSuppliedAddress = InetAddress.getLocalHost();
            if (jdkSuppliedAddress == null) {
                throw new UnknownHostException(
                        "The JDK InetAddress.getLocalHost() method unexpectedly returned null.");
            }
            return jdkSuppliedAddress;
        } catch (Exception e) {
            UnknownHostException unknownHostException =
                    new UnknownHostException("Failed to determine LAN address: " + e);
            unknownHostException.initCause(e);
            throw unknownHostException;
        }
    }

}
