package cf.naechelin.service.likey;

import cf.naechelin.dao.LikeyDAO;
import cf.naechelin.exception.LikeyException;
import cf.naechelin.vo.LikeyVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("likeyInsertService")
public class LikeyInsertServiceImpl implements LikeyInsertService
{
    @Autowired
    @Qualifier("likeyDao")
    private LikeyDAO liekyDao;

    @Override
    public void doService(LikeyVO likey) throws LikeyException
    {
        if(likey == null){
            throw new LikeyException("insert error");
        }
        liekyDao.insert(likey);
    }
}
