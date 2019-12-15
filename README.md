#### 单例模式
* 饿汉模式:   
   类加载到内存后,就实例化一个单例,JVM保证线程安全   
   简单实用,推荐使用   
   唯一缺点: 不管用到与否,类加载时就完成实例化   
* 懒汉模式:   
   虽然带来了按需求初始化的目的,但是却带了了线程不安全的问题   
   解决办法: 加锁,但是效率带来了降低

#### Iterator模式

#### 观察者模式

![](https://github.com/mfqzhr/designpattern/blob/master/img/observer.png)