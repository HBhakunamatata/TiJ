package Ch09.Exercises;

import com.sun.xml.internal.ws.runtime.config.TubelineFeatureReader;
import sun.rmi.transport.tcp.TCPTransport;

import java.security.cert.TrustAnchor;

public class Parcel6 {
    public void internalTracing (boolean b) {
        if(b){
            class TracingSlip {
                private String slip;
                TracingSlip(String id){
                    slip = id;
                }
                String getSlip(){
                    return slip;
                }
            }
            TracingSlip ts = new TracingSlip("x");
            System.out.println(ts.getSlip());
        }
    }

    public void trace(){
        internalTracing(true);
    }

    public static void main(String[] args) {
        Parcel6 parcel6 =new Parcel6();
        parcel6.trace();
    }
}
