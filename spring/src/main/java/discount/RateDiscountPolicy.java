package discount;

import member.Grade;
import member.Member;

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
