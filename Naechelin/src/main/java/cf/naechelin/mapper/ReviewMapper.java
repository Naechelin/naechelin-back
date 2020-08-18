package cf.naechelin.mapper;

import cf.naechelin.exception.ReviewException;
import cf.naechelin.vo.*;

import java.util.ArrayList;
import java.util.List;

public interface ReviewMapper
{
    void insert(ReviewVO reivew)throws ReviewException;
    void delete(ReviewVO review) throws ReviewException;
    List<ReviewVO> reviewList(QueryVO query);
    ReviewVO viewDetail(ReviewVO review) throws ReviewException;
    List<NaechelinStarVO> myNaechelinList(QueryVO query)throws ReviewException;
    List<NaechelinStarVO> guideList()throws ReviewException;
    MissionVO insertCheck(QueryVO query) throws ReviewException;
    ArrayList<Integer> findLineId(int memberId)throws ReviewException;
    void reviewEdit(ReviewVO review)throws ReviewException;
}
