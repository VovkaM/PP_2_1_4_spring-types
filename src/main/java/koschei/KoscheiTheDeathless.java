package koschei;

import koschei.models.Deth8;
import koschei.models.Egg6;
import koschei.models.Needle7;
import koschei.models.Ocean1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class KoscheiTheDeathless {

    private Ocean1 ocean;
    private Deth8 deth8;
    private Egg6 egg6;
    private Needle7 needle7;
    public String getRulesByDeth() {
        return "На свете есть океан , " + ocean.toString() + deth8.getDuck5() + egg6.toString() + needle7.toString();
    }
    @Autowired
    public void setNeedle7(Needle7 needle7){
        this.needle7 = needle7;
    }
    @Autowired
    public void setEgg6(Egg6 egg6){
        this.egg6 = egg6;
    }
    @Autowired
    public  void setDeth8(Deth8 deth8){
        this.deth8 = deth8;
    }
    @Autowired
    public void setOcean(Ocean1 ocean) {
        this.ocean = ocean;
    }
}
