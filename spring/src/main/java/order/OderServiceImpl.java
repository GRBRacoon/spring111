package order;

import discount.DiscountPolicy;
import discount.FixedDiscountPolicy;
import member.Member;
import member.MemberRepository;
import member.MemberService;
import member.MemoryMemberRepository;

public class OderServiceImpl implements OrderService{
    private final MemberRepository memberRepository=new MemoryMemberRepository();
    private final DiscountPolicy discountPolicy=new FixedDiscountPolicy();

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member= memberRepository.findById(memberId);
        int discountPrice= discountPolicy.discount(member,itemPrice);

        return new Order(memberId,itemName,itemPrice,discountPrice);
    }
}
