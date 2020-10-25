package com.spring.ioc.userMod.controller;

import com.spring.ioc.userMod.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/*
*基於註解的組件化管理:
* @Component，@Controller(控制層)，@Service(邏輯層)，@Repository(持久層)
* 以上四個註解功能完全相同，不過在實際開發中，要在實現不同功能的類上加上相應的註解
* 完成組件化管理的過程:
* 1.在需要被Spring管理的類上加上相應註解
* 2.在配置文件中通過<context:component-scan>:掃描物件，對設置的包下面的類進行掃描，會將加上註解的類作為Spring的物件進行加載
* 物件:Spring管理的bean
* 作為Spring的物件進行加載:會自動在Spring的配置文件中生成相對應的bean，這些bean的id會以類的首字母小寫為值
* 3.自動裝配:在需要賦值得非字面量屬性上，加上@Autowired，就可以在spring容器中，通過不同的方式匹配到相對應的bean
* @Autowired配置時，會默認使用byType的方式，此時要求spring容器中只有一個能夠為其賦值
* 當byType實現不了會自動切換到byName，此時要求spring容器中，必須存在一個bean的id和屬性名一致
* 若自動裝配時，匹配到多個能夠賦值的bean，可使用@Qualifier(value="beanId")來指定使用的bean
* */

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    public  void addUser(){
        userService.addUser();
    }

    public UserController() {
        System.out.println("UserController");
    }
}
