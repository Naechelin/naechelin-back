package cf.naechelin.mapper;

import cf.naechelin.vo.CouponVO;
import cf.naechelin.vo.QueryVO;

import java.util.List;

public interface CouponMapper
{
    CouponVO view(int lineId);
    List<CouponVO> list(QueryVO query);
}
