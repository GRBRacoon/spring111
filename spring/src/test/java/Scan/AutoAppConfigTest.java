package Scan;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import springTest.spring.AutoAppConfig;
import springTest.spring.member.MemberService;
import org.assertj.core.api.Assertions;
public class AutoAppConfigTest {
    AnnotationConfigApplicationContext ac = new
            AnnotationConfigApplicationContext(AutoAppConfig.class);
    /*@Test
    @DisplayName("모든 빈 출력하기")
    void findAllBean() {
        String[] beanDefinitionNames = ac.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            Object bean = ac.getBean(beanDefinitionName);
            System.out.println("name=" + beanDefinitionName + " object=" +
                    bean);
        }
    }*/
    @Test
    void basicScan(){
        ApplicationContext ac=new AnnotationConfigApplicationContext(AutoAppConfig.class);
        MemberService memberService= ac.getBean(MemberService.class);
        Assertions.assertThat(memberService).isInstanceOf(MemberService.class);
    }
}
