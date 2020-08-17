package cf.naechelin.service.member;

import cf.naechelin.dao.MemberDAO;
import cf.naechelin.exception.MemberException;
import cf.naechelin.vo.MemberVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class MemberLogoutServiceImpl implements MemberLogoutService
{
    @Autowired
    @Qualifier("memberDAO")
    private MemberDAO dao;

    @Override
    public void doService(MemberVO member) throws MemberException {

    }
}
