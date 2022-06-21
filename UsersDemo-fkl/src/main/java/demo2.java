import com.zhiyun360.wsn.droid.WSNRTConnect;

public class demo2 {
    private static String ID = "836502434997";                           //用户账号
    private static String KEY = "CQUFBwMKBQUNAAhzQxFAVFxbUFpAGwMXDAQCBwcKBQUNChUXGl1XWFUQDhMWVUxEURFLIA";    //用户密钥
    private static String server = "api.zhiyun360.com:28080";
    private String mMac = "00:12:4B:00:1A:C6:31:C6";//温湿度传感器节点IEEE地址

    private static WSNRTConnect wRTConnect;                            //创建WSNRTConnect实例

    public static void main(String[] args) {
        wRTConnect = new WSNRTConnect(ID, KEY); 				//创建wRTConnect链接，并初始化
        wRTConnect.setServerAddr(server);
    }
}
