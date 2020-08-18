package cf.naechelin.service.member;

import cf.naechelin.exception.MemberException;
import cf.naechelin.vo.MemberTypeVO;

public interface MemberTypeListService extends MemberService
{
    void doService(MemberTypeVO memberType) throws MemberException;
}
