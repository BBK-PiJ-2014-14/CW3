public class FunctionalArrayList extends ArrayList implements FunctionalList  {
  
  FunctionalArrayList(int index) {
    super(index);
  }
  
  public ReturnObjectImp head() {
    ReturnObjectImp result = new ReturnObjectImp();
    if (this.arrayList[0] == null) {
      result.errorMessage = ErrorMessage.EMPTY_STRUCTURE;
    } else {
      result.returnObject = this.arrayList[0];
    }
    return result;
  }
  
  public FunctionalArrayList rest() {
    FunctionalArrayList result = this;
    remove(0);
    return result;
  }
}