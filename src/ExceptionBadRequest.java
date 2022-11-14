public class ExceptionBadRequest extends RuntimeException{
    public ExceptionBadRequest() {
        super("400 Bad Request");
    }

}
