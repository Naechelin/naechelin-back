package cf.naechelin.service.likey;

import cf.naechelin.exception.LikeyException;
import cf.naechelin.vo.LikeyVO;

public interface LikeyDeleteService
{
    void doService(LikeyVO likey)throws LikeyException;
}
