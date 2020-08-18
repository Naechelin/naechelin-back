package cf.naechelin.service.review;

import cf.naechelin.dao.ReviewDAO;
import cf.naechelin.exception.ReviewException;
import cf.naechelin.vo.MissionVO;
import cf.naechelin.vo.QueryVO;
import cf.naechelin.vo.ReviewVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service("reviewDeleteService")
public class ReviewDeleteServiceImpl implements ReviewDeleteService
{
    @Autowired
    ReviewDAO reviewDAO;

    @Override
    public void doService(int memberId, int storeId)throws ReviewException
    {
        ReviewVO review = new ReviewVO();
        int lastLineNum=0;
        ArrayList<Integer> lineList = reviewDAO.findLineId(memberId);
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
        MissionVO missionVO = reviewDAO.insertCheck(query);
        if(missionVO.getMissionSuccessTime() == null){
            throw new ReviewException("리뷰 삭제 실패, 먼저 방문해 주세요.");
        }
        review.setLineId(lastLineNum);
        review.setStoreId(storeId);
        reviewDAO.delete(review);
    }
}
