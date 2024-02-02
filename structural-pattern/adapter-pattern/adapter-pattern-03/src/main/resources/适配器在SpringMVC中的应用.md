SpringMvc中的HandlerAdapter使用了适配器模式
![doDispatch.png](img/img.png)
![HandlerAdapter.png](img/img_2.png)
![调用适配器方法.png](img/img_1.png)
![获取适配器方法.png](img/img_3.png)
![类图.png](img/img_4.png)

* 适配器的价值：controller变化了，适配器也会跟着变化，最终调用的方法也不同
* 扩展Controller 时，只需要增加一个适配器类就完成了SpringMVC的扩展了
* 如果不使用适配器：可以看到处理器的类型不同，有多重实现方式，那么调用方式就不是确定的，如果需要直接调用Controller方法，需要调用的时候就得不断是使用if else来进行判断是哪一种子类然后执行。那么如果后面要扩展Controller，就得修改原来的代码，这样违背了OCP原则
