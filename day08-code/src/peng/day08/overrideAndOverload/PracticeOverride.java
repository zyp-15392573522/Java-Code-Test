package peng.day08.overrideAndOverload;

/*
重写（Override）
概念：在继承关系当中，方法的名称一样，参数列表也一样

重写（Override）：方法的名称一样，参数列表【也一样】。覆盖、覆写
重载（Overload）：方法的名称一样，参数列表【不一样】。

方法覆盖重写特点：
    创建的是子类对象，则优先使用子类方法。

方法覆盖重写的注意事项：
1.必须保证父子类之间方法的名称相同，参数列表也相同。
@Override:写在方法前面，用来检测是不是有效的正确覆盖重写。
这个注解就算不写，只要满足要求，也是正确的方法覆盖你重写。

2.子类方法的返回值必须【小于等于】父类方法的返回值范围。
前提：java.long.Object类是所有类的公共最高父类（祖宗类）,java.long.String就是Object的子类。

3.子类方法的权限必须【大于等于】父类方法的权限修饰符。
提示：public > protected > (default) > private
备注:（default）不是关键字default，而是什么都不写，留空。
*/
public class PracticeOverride {

    //(default)
    //int num;

}