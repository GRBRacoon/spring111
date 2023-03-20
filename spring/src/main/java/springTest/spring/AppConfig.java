package springTest.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springTest.spring.discount.DiscountPolicy;
import springTest.spring.discount.FixedDiscountPolicy;
import springTest.spring.member.MemberRepository;
import springTest.spring.member.MemberService;
import springTest.spring.member.MemberServiceImpl;
import springTest.spring.member.MemoryMemberRepository;
import springTest.spring.order.OderServiceImpl;
import springTest.spring.order.OrderService;

/*@Configuration
public class AppConfig {
   @Bean
    public MemberService memberService(){
        return new MemberServiceImpl(memberRepository());
    }
    @Bean
    public OrderService orderService(){
        return new OderServiceImpl(
                memberRepository(),
                discountPolicy()
        );
    }
    @Bean
    public MemberRepository memberRepository(){
     return new MemoryMemberRepository();
    }
    @Bean
    public DiscountPolicy discountPolicy(){
        return new FixedDiscountPolicy();
    }

}
*/