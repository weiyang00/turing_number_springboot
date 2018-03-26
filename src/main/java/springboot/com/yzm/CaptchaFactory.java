package springboot.com.yzm;

import com.github.bingoohuang.patchca.color.RandomColorFactory;
import com.github.bingoohuang.patchca.custom.ConfigurableCaptchaService;
import com.github.bingoohuang.patchca.word.RandomWordFactory;

/**
 * @author weiyang
 * @date 2018/3/23
 */
public class CaptchaFactory {

    private static ConfigurableCaptchaService cs = new ConfigurableCaptchaService();

    static {
        cs.setColorFactory(new RandomColorFactory());
        RandomWordFactory wf = new RandomWordFactory();
        wf.setCharacters("1234567890AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz");
        wf.setMaxLength(4);
        wf.setMinLength(4);
        cs.setWordFactory(wf);
    }

    public static ConfigurableCaptchaService getInstance() {
        return cs;
    }
}
