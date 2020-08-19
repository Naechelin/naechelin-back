package cf.naechelin.service.review;

import cf.naechelin.dao.ReviewDAO;
import cf.naechelin.exception.ReviewException;
import cf.naechelin.vo.MissionVO;
import cf.naechelin.vo.QueryVO;
import cf.naechelin.vo.ReviewVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.ArrayList;

@Service("reviewInsertService")
public class ReviewInsertServiceImpl implements ReviewInsertService
{
    @Autowired
    @Qualifier("reviewDao")
    ReviewDAO reviewDao;

    @Override
    public void doService(int memberId, ReviewVO review) throws ReviewException
    {

        int lineId = reviewDao.findLineId(memberId);
        review.setLineId(lineId);

        MissionVO mission = reviewDao.insertCheck(review);
        if(mission == null || mission.getMissionSuccessTime() == null){
            throw new ReviewException("리뷰 작성 실패, 먼저 방문해 주세요.");
        }
        Timestamp successTime = mission.getMissionSuccessTime();
        Timestamp currentTime = new Timestamp(System.currentTimeMillis());
        long hour = currentTime.getTime() - successTime.getTime();


        if((hour/3600000) >= 24){
            throw new ReviewException("리뷰 작성/제출은 방문 24시간 이내에 가능합니다.");
        }

        reviewDao.insert(review);
    }
}
