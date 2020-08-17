// likeyDao jeonka 2020.08.15
package cf.naechelin.dao;

import cf.naechelin.exception.LikeyException;
import cf.naechelin.mapper.LikeyMapper;
import cf.naechelin.vo.LikeyVO;
import cf.naechelin.vo.QueryVO;
import cf.naechelin.vo.StoreVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("likeyDao")
public class LikeyDAOImpl implements LikeyDAO
{

    @Autowired
    LikeyMapper likeyMapper;

    @Override
    public void insert(LikeyVO likey) throws LikeyException
    {
        likeyMapper.insert(likey);
    }

    @Override
    public void delete(LikeyVO likey) throws LikeyException
    {
        likeyMapper.delete(likey);
    }

    @Override
    public List<LikeyVO> LikeStoreList(QueryVO query) throws LikeyException
    {

        return likeyMapper.LikeStoreList(query);
    }

    @Override
    public List<StoreVO> MyLikeList(List<LikeyVO> likeyList) throws LikeyException
    {
        List<StoreVO> list = new ArrayList<>();
        for(LikeyVO likey : likeyList)
        {
            list.add(likeyMapper.viewStore(likey));
        }
        return list;
    }
}
