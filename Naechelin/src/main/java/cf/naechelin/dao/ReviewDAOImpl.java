package cf.naechelin.dao;


import cf.naechelin.exception.ReviewException;
import cf.naechelin.mapper.ReviewMapper;
import cf.naechelin.vo.QueryVO;
import cf.naechelin.vo.ReviewVO;
import cf.naechelin.vo.StoreVO;
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
    public List<ReviewVO> getNaechelinList(QueryVO query) throws ReviewException
    {
        ArrayList<ReviewVO> list;
        list = (ArrayList<ReviewVO>)reviewMapper.myNaechelinList(query);
        return list;
    }

    @Override
    public List<StoreVO> getStoreList() throws ReviewException
    {
        ArrayList<StoreVO> list;
        list = (ArrayList<StoreVO>)reviewMapper.guideList();
        return list;
    }
}
