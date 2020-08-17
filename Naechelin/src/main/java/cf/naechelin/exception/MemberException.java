package cf.naechelin.exception;

public abstract class MemberException extends RuntimeException
{
    public MemberException(String message)
    {
        super(message);
    }
}
