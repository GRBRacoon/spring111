package springTest.spring.discount;

import springTest.spring.member.Grade;
import springTest.spring.member.Member;
import org.springframework.stereotype.Component;

@Component
public class RateDiscountPolicy implements DiscountPolicy{
    private int discountRate=10;
    @Override
    public int discount(Member member, int price) {
        if(member.getGrade()== Grade.VIP)
        {
            return price*discountRate;
        }
        else
        return 0;
    }
}
