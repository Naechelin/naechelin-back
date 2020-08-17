package cf.naechelin.service.question;

import cf.naechelin.exception.QuestionException;
import cf.naechelin.vo.AnswerVO;

public interface QuestionAnswerInsertService extends QuestionService
{
    void doService(AnswerVO answer) throws QuestionException;
}
