import com.zhiyun360.wsn.droid.WSNRTConnect;

public class demo2 {
    private static String ID = "836502434997";                           //�û��˺�
    private static String KEY = "CQUFBwMKBQUNAAhzQxFAVFxbUFpAGwMXDAQCBwcKBQUNChUXGl1XWFUQDhMWVUxEURFLIA";    //�û���Կ
    private static String server = "api.zhiyun360.com:28080";
    private String mMac = "00:12:4B:00:1A:C6:31:C6";//��ʪ�ȴ������ڵ�IEEE��ַ

    private static WSNRTConnect wRTConnect;                            //����WSNRTConnectʵ��

    public static void main(String[] args) {
        wRTConnect = new WSNRTConnect(ID, KEY); 				//����wRTConnect���ӣ�����ʼ��
        wRTConnect.setServerAddr(server);
    }
}
