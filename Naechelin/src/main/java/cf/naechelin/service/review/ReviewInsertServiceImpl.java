package cf.naechelin.service.review;

import cf.naechelin.dao.ReviewDAO;
import cf.naechelin.exception.ReviewException;
import cf.naechelin.vo.MissionVO;
import cf.naechelin.vo.ReviewVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("reviewInsertService")
public class ReviewInsertServiceImpl implements ReviewInsertService
{
    @Autowired
    @Qualifier("reviewDao")
    ReviewDAO reviewDao;

    @Override
    public void doService(int memberId, int storeId) throws ReviewException
    {
        ReviewVO review = new ReviewVO();
        review.setLineId(reviewDao.findLineId(memberId));
        review.setStoreId(memberId);
        MissionVO missionVO = reviewDao.insertCheck(review);
        if(missionVO.getMissionSuccessTime() == null){
            throw new ReviewException("리뷰 작성 실패, 먼저 방문해 주세요.");
        }
        reviewDao.insert(review);
    }
}
