package nameCheck;

/**
 * @author hui
 * 2021/1/13 0013 16:58
 */
public class BADLY_NAMED_CODE {
    enum  colors{
        red,blue,green;
    }
    static final int _FORTY_TWO = 42;

    public static int NOT_A_CONSTANT= _FORTY_TWO;

    protected void BADLY_NAME_CODE(){
        return;
    }

    public void NOTcamelCASEmethodNAME(){
        return;
    }
}
