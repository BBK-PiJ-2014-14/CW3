public class ReturnObjectImp implements ReturnObject {
  public Object returnObject;
  public ErrorMessage errorMessage;
  
  public ReturnObjectImp() {
    this.returnObject=null;
    errorMessage = ErrorMessage.NO_ERROR;
  }
  
  public boolean hasError() {
    return (errorMessage.equals(ErrorMessage.NO_ERROR) == false);
  }
  
  public ErrorMessage getError() {
    return errorMessage;
  }
  
  public Object getReturnValue() {
    if(this.hasError()) {
      return null;
    } else{
    return returnObject;
    }
  }
}  