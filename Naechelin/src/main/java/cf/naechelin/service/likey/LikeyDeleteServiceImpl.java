package cf.naechelin.service.likey;

import cf.naechelin.dao.LikeyDAO;
import cf.naechelin.exception.LikeyException;
import cf.naechelin.vo.LikeyVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("likeyDeleteService")
public class LikeyDeleteServiceImpl implements LikeyDeleteService
{
    @Autowired
    @Qualifier("likeyDao")
    private LikeyDAO likeyDao;

    @Override
    public void doService(LikeyVO likey) throws LikeyException
    {
        if(likey == null){
            throw new LikeyException("delete");
        }
        likeyDao.delete(likey);
    }
}
