这个动态代理类 有两种方式，
一种是，在实现代理类中 同时创建Proxy.newProxyInstance和invoke方法
第二种是，在实现代理类中 只创建invoke方法，但是在测试类中创建Proxy.newProxyInstance方法
