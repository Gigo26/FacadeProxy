package Proxy4;

import java.util.HashMap;
import java.util.Map;

public class ProxyCache implements ServicioCostoso {
    private ServicioCostosoReal servicioReal = new ServicioCostosoReal();
    private Map<Integer, Integer> cache = new HashMap<>();

    @Override
    public int realizarOperacion(int entrada) {
        if (!cache.containsKey(entrada)) {
            cache.put(entrada, servicioReal.realizarOperacion(entrada));
        }
        return cache.get(entrada);
    }
}