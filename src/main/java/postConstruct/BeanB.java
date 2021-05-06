package postConstruct;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * @author hui
 * 2020/1/7 0007 11:46
 */
@Service
public class BeanB {
    public BeanB() {
        System.out.println("BeanB 构造方法");
    }
    @PostConstruct
    private void init(){
        System.out.println("BeanB 初始化方法");
    }
    public void test(){
        System.out.println("BeanB testing");
    }
}
