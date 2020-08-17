package cf.naechelin.service.likey;

import cf.naechelin.dao.LikeyDAO;
import cf.naechelin.exception.LikeyException;
import cf.naechelin.vo.LikeyVO;
import cf.naechelin.vo.QueryVO;
import cf.naechelin.vo.StoreVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("likeyListService")
public class LikeyListServiceImpl implements LikeyListService
{
    @Autowired
    @Qualifier("likeyDao")
    LikeyDAO likeyDao;

    @Override
    public List<StoreVO> doService(String condition, String word) throws LikeyException
    {
        List<LikeyVO> list;
        QueryVO query = new QueryVO(condition,word);
        try
        {
            list = likeyDao.LikeStoreList(query);
        }
        catch(LikeyException e){
            e.setMessage("Likey list get error");
            throw e;
        }
        return likeyDao.MyLikeList(list);
    }
}
