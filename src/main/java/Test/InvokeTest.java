package Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

import static org.aspectj.lang.reflect.DeclareAnnotation.Kind.Method;

/**
 * Company: www.leadmap.net
 * Description:
 *
 * @author: 96964
 * @Date: 2019/3/18 11:14
 */
public class InvokeTest {
    public static void main(String[] args){
        final List<String> list = new ArrayList<String>();
        List<String> proxyInstance =
                (List<String>) Proxy.newProxyInstance(list.getClass().getClassLoader(),list.getClass().getInterfaces(),
                        new InvocationHandler(){
                            @Override
                            public Object invoke(Object proxy, java.lang.reflect.Method method, Object[] args) throws Throwable {
                                return method.invoke(list, args);
                            }
        });
        proxyInstance.add("你好");
        System.out.println(list);
    }
}
