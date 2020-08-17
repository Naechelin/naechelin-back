package cf.naechelin.exception;

public abstract class QuestionException extends RuntimeException
{
    public QuestionException(String message)
    {
        super(message);
    }
}
