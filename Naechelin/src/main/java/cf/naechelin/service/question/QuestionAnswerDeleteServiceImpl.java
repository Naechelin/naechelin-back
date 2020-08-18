package cf.naechelin.service.question;

import cf.naechelin.dao.AnswerDAO;
import cf.naechelin.exception.QuestionException;
import cf.naechelin.vo.AnswerVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class QuestionAnswerDeleteServiceImpl implements QuestionAnswerDeleteService
{
    @Autowired
    @Qualifier("answerDAO")
    private AnswerDAO dao;

    @Override
    public void doService(AnswerVO answer) throws QuestionException
    {
        dao.delete(answer.getQuestionId());
    }
}
