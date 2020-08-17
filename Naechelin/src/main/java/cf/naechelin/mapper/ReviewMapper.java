package cf.naechelin.mapper;

import cf.naechelin.exception.ReviewException;
import cf.naechelin.vo.*;

import java.util.List;

public interface ReviewMapper
{
    void insert(ReviewVO reivew)throws ReviewException;
    void delete(ReviewVO review) throws ReviewException;
    List<ReviewVO> viewList(QueryVO query)throws ReviewException;
    ReviewVO viewDetail(ReviewVO review) throws ReviewException;
    List<NaechelinStarVO> myNaechelinList(QueryVO query)throws ReviewException;
    List<NaechelinStarVO> guideList()throws ReviewException;
    MissionVO insertCheck(ReviewVO review) throws ReviewException;
    int findLineId(int memberId)throws ReviewException;
    void reviewEdit(ReviewVO review)throws ReviewException;
}
