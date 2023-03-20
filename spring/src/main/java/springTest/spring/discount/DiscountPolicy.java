package springTest.spring.discount;

import springTest.spring.member.Member;

public interface DiscountPolicy {
    int discount(Member member, int price);
}
