package cf.naechelin.dao;

import cf.naechelin.vo.CouponVO;

import java.awt.image.BufferedImage;
import java.util.List;

public interface CouponDAO
{
    void insert(CouponVO coupon);
    void delete(CouponVO coupon);
    CouponVO view(CouponVO coupon);
    List<CouponVO> list(String condition, String word);
    BufferedImage createQR(CouponVO coupon);
}
