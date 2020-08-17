package cf.naechelin.dao;


import cf.naechelin.exception.ReviewException;
import cf.naechelin.mapper.ReviewMapper;
import cf.naechelin.vo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import java.util.ArrayList;
import java.util.List;

@Repository("reviewDao")
public class ReviewDAOImpl implements ReviewDAO
{
    @Autowired
    ReviewMapper reviewMapper;

    @Override
    public void insert(ReviewVO review) throws ReviewException
    {
        reviewMapper.insert(review);
    }

    @Override
    public void delete(ReviewVO review) throws ReviewException
    {
        reviewMapper.delete(review);
    }

    @Override
    public List<ReviewVO> getList(QueryVO query) throws ReviewException
    {
        ArrayList<ReviewVO> list;
        list = (ArrayList<ReviewVO>)reviewMapper.viewList(query);
        return list;
    }

    @Override
    public ReviewVO getStoreReview(ReviewVO review) throws ReviewException
    {
        return reviewMapper.viewDetail(review);
    }

    @Override
    public List<NaechelinStarVO> getNaechelinList(QueryVO query) throws ReviewException
    {
        ArrayList<NaechelinStarVO> list;
        list = (ArrayList<NaechelinStarVO>)reviewMapper.myNaechelinList(query);
        return list;
    }

    @Override
    public List<NaechelinStarVO> getStoreList() throws ReviewException
    {
        ArrayList<NaechelinStarVO> list;
        list = (ArrayList<NaechelinStarVO>)reviewMapper.guideList();
        return list;
    }

    @Override
    public MissionVO insertCheck(ReviewVO review) throws ReviewException
    {
        return reviewMapper.insertCheck(review);
    }

    @Override
    public int findLineId(int memberId) throws ReviewException
    {
        return reviewMapper.findLineId(memberId);
    }

    @Override
    public void reviewEdit(ReviewVO review) throws ReviewException
    {
        reviewMapper.reviewEdit(review);
    }
}
