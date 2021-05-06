
public class FreqControlRule {

    String app;
    String ruleType;
    int minInterval;
    int maxReqForMinInterval;
    int midInterval;
    int maxReqForMidInterval;
    int maxInterval;
    int maxReqForMaxInterval;

    @Override
    public String toString() {
        return "app:" + app + ", ruleType:" + ruleType + ", freqRule:["
                + minInterval + "," + maxReqForMinInterval + "/"
                + midInterval + "," + maxReqForMidInterval + "/"
                + maxInterval + "," + maxReqForMaxInterval + ";";
    }
}