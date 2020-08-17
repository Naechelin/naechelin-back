package cf.naechelin.dao;

import cf.naechelin.vo.MissionVO;
import org.springframework.stereotype.Repository;

import java.awt.image.BufferedImage;
import java.util.List;

@Repository("MissionDAO")
public class MissionDAOImpl implements MissionDAO
{
    @Override
    public void insert(MissionVO mission)
    {

    }

    @Override
    public void update(MissionVO mission)
    {

    }

    @Override
    public void delete(MissionVO mission)
    {

    }

    @Override
    public MissionVO view(MissionVO mission)
    {
        return null;
    }

    @Override
    public List<MissionVO> list(String condition, String word)
    {
        return null;
    }

    @Override
    public BufferedImage createQR(MissionVO mission)
    {
        return null;
    }
}
