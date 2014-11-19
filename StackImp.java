public class StackImp extends AbstractStack  {

  
  public StackImp(List list) {
    super(list);
  }
  
  public boolean isEmpty() {
    if(this.internalList.isEmpty()) {
      return true;
    } else {
      return false;
    }
  }
  
  public int size() {
    return this.internalList.size();
  }
  
  public void push(Object item) {
    this.internalList.add(item);
  }
  
  public ReturnObject top() {
    ReturnObject result = new ReturnObjectImp();
    if (this.internalList.isEmpty()) {
      ((ReturnObjectImp)result).errorMessage = ErrorMessage.EMPTY_STRUCTURE;
    } else {
      result = this.internalList.get(this.size()-1);
    }
    return result;
  }

  public ReturnObject pop() {
    ReturnObject result = new ReturnObjectImp();
    if (this.internalList.isEmpty()) {
      ((ReturnObjectImp)result).errorMessage = ErrorMessage.EMPTY_STRUCTURE;
    } else {
      result = this.internalList.get(this.size()-1);
      this.internalList.remove(this.size()-1);
    }
    return result;
  }
}
