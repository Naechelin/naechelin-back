package cf.naechelin.service.review;

import cf.naechelin.dao.ReviewDAO;
import cf.naechelin.exception.ReviewException;
import cf.naechelin.vo.MissionVO;
import cf.naechelin.vo.QueryVO;
import cf.naechelin.vo.ReviewVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

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
        int lastLineNum=0;
        ArrayList<Integer> lineList = reviewDao.findLineId(memberId);
        StringBuilder sb = new StringBuilder();
        for(Integer num : lineList){
            sb.append(num+",");
            lastLineNum = num;
        }
        if(sb == null) { return ;}
        sb.deleteCharAt(sb.length());
        QueryVO query = new QueryVO();
        query.setWord(sb.toString());
        query.setIntWord(review.getStoreId());
        MissionVO missionVO = reviewDao.insertCheck(query);
        if(missionVO.getMissionSuccessTime() == null){
            throw new ReviewException("리뷰 작성 실패, 먼저 방문해 주세요.");
        }
        review.setLineId(lastLineNum);
        reviewDao.insert(review);
    }
}
