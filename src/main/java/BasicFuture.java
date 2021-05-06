
import java.util.ArrayList;
import java.util.List;

public class BasicFuture {


    private static List<FreqControlRule> doParseRuleData1(String ruleData) {

        // todo

        List<FreqControlRule> datasOfRule = new ArrayList<>();

        String[] str = ruleData.split("\n|\r|\r\n");

        for (int i = 0;i<str.length;i++)
        {
            if (str[i].contains("rule")){
                FreqControlRule rule = new FreqControlRule();
                for (int j = 0;j < 5;j++){
                    if (str[++i].contains("match_app")){
                        rule.app = str[i].split("=")[1].trim();
                    }else if (str[i].contains("rule_type")){
                        rule.ruleType = str[i].split("=")[1].trim();
                    }else if (str[i].contains("min_interval")){
                        rule.minInterval = Integer.parseInt( str[i].split("=")[1].trim().split(",")[0]);
                        rule.maxReqForMinInterval = Integer.parseInt( str[i].split("=")[1].trim().split(",")[1]);
                    }else if (str[i].contains("mid_interval")){
                        rule.midInterval = Integer.parseInt(str[i].split("=")[1].trim().split(",")[0]);
                        rule.maxReqForMidInterval = Integer.parseInt(str[i].split("=")[1].trim().split(",")[1]);
                    } else if (str[i].contains("max_interval")){
                        rule.maxInterval = Integer.parseInt(str[i].split("=")[1].trim().split(",")[0]);
                        rule.maxReqForMaxInterval = Integer.parseInt(str[i].split("=")[1].trim().split(",")[1]);
                    }
                }
                datasOfRule.add(rule);
            }
        }
        return datasOfRule;
    }

    private static List<FreqControlRule> doParseRuleData2(String ruleData) {

        // todo

        List<FreqControlRule> datasOfRule = new ArrayList<>();

        String[] str = ruleData.split("\n|\r|\r\n");


        for (int i = 0;i<str.length;i++)
        {
            if (str[i].contains("rule")){
                FreqControlRule rule = new FreqControlRule();
                for(int j = 0;j < 5;j++) {
                    String[] s = str[++i].split("=");
                    switch (s[0].trim()) {
                        case "match_app":
                            rule.app = s[1].trim();
                            break;
                        case "rule_type":
                            rule.ruleType = s[1].trim();
                            break;
                        case "min_interval":
                            rule.minInterval = Integer.parseInt(s[1].trim().split(",")[0]);
                            rule.maxReqForMinInterval = Integer.parseInt(s[1].trim().split(",")[1]);
                            break;
                        case "mid_interval":
                            rule.midInterval = Integer.parseInt(s[1].trim().split(",")[0]);
                            rule.maxReqForMidInterval = Integer.parseInt(s[1].trim().split(",")[1]);
                            break;
                        case "max_interval":
                            rule.maxInterval = Integer.parseInt(s[1].trim().split(",")[0]);
                            rule.maxReqForMaxInterval = Integer.parseInt(s[1].trim().split(",")[1]);
                            break;
                    }
                }
                datasOfRule.add(rule);
            }
        }
        return datasOfRule;
    }


    /*private static List<FreqControlRule> doParseRuleData3(String ruleData) {

        // todo

        List<FreqControlRule> datasOfRule = new ArrayList<>();

        String[] str = ruleData.split("\n|\r|\r\n");
        String pattern1 = "^\\[.*\\]$";
        String pattern2 = "^[a-zA-Z]+\\[.*\\]$";


        for (int i = 0;i<str.length;i++)
        {
            if (Pattern.matches(pattern1,str[i])){
                FreqControlRule rule = new FreqControlRule();
                rule.targets = new HashSet<>();
                for(int j = 0;j < 5;j++) {
                    String[] s = str[++i].split("=");
                    switch (s[0].trim()) {
                        case "match_app":
                            rule.app = s[1].trim();
                            break;
                        case "rule_type":
                            if (Pattern.matches(pattern2,s[1].trim())){
                                rule.ruleType = s[1].trim().split("\\[")[0];
                                String[] str1 = s[1].trim().split("\\[")[1].trim().split("\\]")[0].trim().split(",");
                                for (int k = 0; k < str1.length;k++){
                                    if (!str1[k].contains(".")){
                                        rule.targets.add(Integer.parseInt(str1[k].trim()));
                                    }else {
                                        rule.targets.add(IPUtils.transferIp(str1[k].trim()));
                                    }
                                }
                            }else{
                                rule.targets = null;
                                rule.ruleType = s[1].trim();
                            }
                            break;
                        case "min_interval":
                            rule.minInterval = Integer.parseInt(s[1].trim().split(",")[0]);
                            rule.maxReqForMinInterval = Integer.parseInt(s[1].trim().split(",")[1]);
                            break;
                        case "mid_interval":
                            rule.midInterval = Integer.parseInt(s[1].trim().split(",")[0]);
                            rule.maxReqForMidInterval = Integer.parseInt(s[1].trim().split(",")[1]);
                            break;
                        case "max_interval":
                            rule.maxInterval = Integer.parseInt(s[1].trim().split(",")[0]);
                            rule.maxReqForMaxInterval = Integer.parseInt(s[1].trim().split(",")[1]);
                            break;
                    }
                }
                datasOfRule.add(rule);
            }
        }
        return datasOfRule;
    }*/
    public static void main(String[] args){
        String data = "[rule1]\n" +
                      "match_app = com.foo.service1\n" +
                      "rule_type = callerId\n" +
                      "min_interval = 60,600\n" +
                      "mid_interval = 3600,10000\n" +
                      "max_interval = 86400,80000\n" +
                      "\n" +
                     "[rule2]\n" +
                     "rule_type = callerIp\n" +
                     "min_interval = 60,600\n" +
                     "match_app = com.foo.service2\n" +
                     "mid_interval = 3600,10000\n" +
                     "max_interval = 86400,80000\n" +
                     "\n" +
                     "[rule3]\n" +
                     "match_app = com.foo.service3\n" +
                     "mid_interval = 3600,10000\n" +
                     "rule_type = callerIp\n" +
                     "min_interval = 60,600\n" +
                     "max_interval = 86400,80000\n";


        long t1 = System.nanoTime();
        List<FreqControlRule> rules1 = doParseRuleData1(data);
        System.out.println(System.nanoTime()-t1);


        System.out.println(rules1.size());
        System.out.println(rules1);

        long t2 = System.nanoTime();
        List<FreqControlRule> rules2 = doParseRuleData2(data);
        System.out.println(System.nanoTime()-t2);

        System.out.println(rules2.size());
        System.out.println(rules2);
    }
}
