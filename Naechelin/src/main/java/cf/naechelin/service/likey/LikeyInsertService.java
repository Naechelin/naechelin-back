package cf.naechelin.service.likey;

import cf.naechelin.exception.LikeyException;
import cf.naechelin.vo.LikeyVO;
import org.springframework.stereotype.Service;


public interface LikeyInsertService
{
    void doService(LikeyVO likey)throws LikeyException;
}
