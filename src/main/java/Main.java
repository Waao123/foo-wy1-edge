import com.alibaba.nacos.common.model.RestResult;
import com.sanrui.core.auth.UserUtils;
import com.sanrui.core.utils.SequenceUtils;

public class Main {
    public static void main(String[] args) {
        long generate = SequenceUtils.generate();
        String s = SequenceUtils.generateStr();
        System.out.println(s);
        System.out.println(generate);
    }
}
