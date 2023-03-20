package springTest.spring.discount;

import springTest.spring.member.Grade;
import springTest.spring.member.Member;
import org.springframework.stereotype.Component;

//
public class FixedDiscountPolicy implements DiscountPolicy{
    private int discountFixAmount=1000;
    @Override
    public int discount(Member member, int price) {
        if(member.getGrade()== Grade.VIP)
        {
            return discountFixAmount;
        }
        else
        return 0;
    }
}
