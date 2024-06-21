
package Proxy1;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet {
    private RealInternet realInternet = new RealInternet();
    private static List<String> sitiosProhibidos;

    static {
        sitiosProhibidos = new ArrayList<String>();
        sitiosProhibidos.add("abc.com");
        sitiosProhibidos.add("def.com");
        sitiosProhibidos.add("ijk.com");
        sitiosProhibidos.add("lnm.com");
    }

    @Override
    public void connectTo(String serverHost) throws Exception {
        if (sitiosProhibidos.contains(serverHost.toLowerCase())) {
            throw new Exception("Acceso Denegado");
        }
        realInternet.connectTo(serverHost);
    }
}
