package cf.naechelin.mapper;

import cf.naechelin.exception.ReviewException;
import cf.naechelin.vo.QueryVO;
import cf.naechelin.vo.ReviewVO;
import cf.naechelin.vo.StoreVO;

import java.util.List;

public interface ReviewMapper
{
    void insert(ReviewVO reivew)throws ReviewException;
    void delete(ReviewVO review) throws ReviewException;
    List<ReviewVO> viewList(QueryVO query)throws ReviewException;
    ReviewVO viewDetail(ReviewVO review) throws ReviewException;
    List<ReviewVO> myNaechelinList(QueryVO query)throws ReviewException;
    List<StoreVO> guideList()throws ReviewException;
}
