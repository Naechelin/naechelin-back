package cf.naechelin.service.review;

import cf.naechelin.exception.ReviewException;
import cf.naechelin.vo.ReviewVO;

public interface ReviewInsertService
{
    void doService(int memberId, int storeId) throws ReviewException;
}
