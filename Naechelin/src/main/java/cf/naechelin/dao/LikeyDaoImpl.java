package cf.naechelin.dao;

import cf.naechelin.vo.LikeyVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("likeyDao")
public class LikeyDaoImpl implements LikeyDao
{

    @Autowired
    private JdbcTemplate jtemp;

    @Override
    public void insert(LikeyVO like) throws LikeyException
    {

    }

    @Override
    public void delete(LikeyVO like) throws LikeyException
    {

    }

    @Override
    public List<LikeyVO> viewLikeStoreList(String condition, String word) throws LikeyExecption
    {
        return null;
    }

    @Override
    public List<StoreVO> viewMyLikeList(List<LikeyVO> likeyList) throws LikeyException
    {
        return null;
    }
}
