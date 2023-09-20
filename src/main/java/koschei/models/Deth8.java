package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Deth8 {
    @Autowired
    private Duck5 duck5;
    @Qualifier
    public Duck5 getDuck5() {
       duck5.toString();
       return duck5;
    }
}
