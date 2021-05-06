package postConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * @author hui
 * 2020/1/7 0007 11:18
 */
@Service
public class BeanA {
    @Autowired
    private BeanB beanB;

    public BeanA() {
        System.out.println("BeanA 构造方法");
    }

    @PostConstruct
    public void init() {
        System.out.println("BeanA 初始化方法");
        beanB.test();
    }
}
