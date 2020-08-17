package cf.naechelin.service.review;

import cf.naechelin.dao.ReviewDAO;
import cf.naechelin.exception.ReviewException;
import cf.naechelin.vo.ReviewVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("reviewInsertService")
public class ReviewInsertServiceImpl implements ReviewInsertService
{
    @Autowired
    @Qualifier("reviewDao")
    ReviewDAO reviewdao;

    @Override
    public void doService(ReviewVO review) throws ReviewException
    {

    }
}
