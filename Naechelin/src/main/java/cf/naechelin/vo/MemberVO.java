package cf.naechelin.vo;

import java.sql.Timestamp;
import java.util.List;

enum Gender { M, F };

public class MemberVO
{
    private int memberId;
    private String memberEmail;
    private String memberPass;
    private String memberNick;
    private Timestamp memberBirth;
    private Gender memberGender;
    private String memberType;
    private Timestamp memberRegDate;
    private Timestamp memberEndDate;
    private String memberTel;
    private List<StoreVO> storeList;
    private MemberTypeVO memberTypeVO;

    public MemberVO() { }

    public MemberVO(int memberId, String memberEmail, String memberPass, String memberNick, Timestamp memberBirth, Gender memberGender, String memberType, Timestamp memberRegDate, Timestamp memberEndDate, String memberTel, List<StoreVO> storeList, MemberTypeVO memberTypeVO)
    {
        this.memberId = memberId;
        this.memberEmail = memberEmail;
        this.memberPass = memberPass;
        this.memberNick = memberNick;
        this.memberBirth = memberBirth;
        this.memberGender = memberGender;
        this.memberType = memberType;
        this.memberRegDate = memberRegDate;
        this.memberEndDate = memberEndDate;
        this.memberTel = memberTel;
        this.storeList = storeList;
        this.memberTypeVO = memberTypeVO;
    }

    public int getMemberId()
    {
        return memberId;
    }

    public void setMemberId(Object param)
    {
        this.memberId = memberId;
    }

    public String getMemberEmail()
    {
        return memberEmail;
    }

    public void setMemberEmail(Object param)
    {
        this.memberEmail = memberEmail;
    }

    public String getMemberPass()
    {
        return memberPass;
    }

    public void setMemberPass(Object param)
    {
        this.memberPass = memberPass;
    }

    public String getMemberNick()
    {
        return memberNick;
    }

    public void setMemberNick(Object param)
    {
        this.memberNick = memberNick;
    }

    public Timestamp getMemberBirth()
    {
        return memberBirth;
    }

    public void setMemberBirth(Object param)
    {
        this.memberBirth = memberBirth;
    }

    public Gender getMemberGender()
    {
        return memberGender;
    }

    public void setMemberGender(Object param)
    {
        this.memberGender = memberGender;
    }

    public String getMemberType()
    {
        return memberType;
    }

    public void setMemberType(Object param)
    {
        this.memberType = memberType;
    }

    public Timestamp getMemberRegDate()
    {
        return memberRegDate;
    }

    public void setMemberRegDate(Object param)
    {
        this.memberRegDate = memberRegDate;
    }

    public Timestamp getMemberEndDate()
    {
        return memberEndDate;
    }

    public void setMemberEndDate(Object param)
    {
        this.memberEndDate = memberEndDate;
    }

    public String getMemberTel()
    {
        return memberTel;
    }

    public void setMemberTel(Object param)
    {
        this.memberTel = memberTel;
    }

    public List<StoreVO> getStoreList()
    {
        return storeList;
    }

    public void setStoreList(Object param)
    {
        this.storeList = storeList;
    }

    public MemberTypeVO getMemberTypeVO()
    {
        return memberTypeVO;
    }

    public void setMemberTypeVO(Object param)
    {
        this.memberTypeVO = memberTypeVO;
    }
}
