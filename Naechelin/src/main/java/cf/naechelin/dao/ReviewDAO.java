package cf.naechelin.dao;

import cf.naechelin.exception.ReviewException;
import cf.naechelin.vo.QueryVO;
import cf.naechelin.vo.ReviewVO;
import cf.naechelin.vo.StoreVO;

import java.util.List;

public interface ReviewDAO
{
    void insert(ReviewVO review)throws ReviewException; // 리뷰 작성
    void delete(ReviewVO review) throws ReviewException; // 리뷰 삭제
    List<ReviewVO> getList(QueryVO query)throws ReviewException; // 리뷰 목록 가져오기 ( 가게의 )
    ReviewVO getStoreReview(ReviewVO review) throws ReviewException; // 리뷰 상세 보기
    List<ReviewVO> getNaechelinList(QueryVO query)throws ReviewException; // 내슐랭
    List<StoreVO> getStoreList()throws ReviewException; // 내슐랭 가이드
}
