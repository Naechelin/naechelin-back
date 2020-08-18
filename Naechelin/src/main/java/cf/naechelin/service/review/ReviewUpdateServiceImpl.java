package cf.naechelin.service.review;

import cf.naechelin.dao.ReviewDAO;
import cf.naechelin.exception.ReviewException;
import cf.naechelin.vo.ReviewVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("reviewUpdateService")
public class ReviewUpdateServiceImpl implements ReviewUpdateService
{
    @Autowired
    ReviewDAO reviewDAO;

    @Override
    public void doService(int memberId, int storeId) throws ReviewException
    {
        ReviewVO review = new ReviewVO();
        review.setLineId(reviewDAO.findLineId(memberId));
        review.setStoreId(storeId);
        reviewDAO.reviewEdit(review);
    }
}
