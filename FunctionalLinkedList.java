public class FunctionalLinkedList extends LinkedList implements FunctionalList {

  
  public ReturnObjectImp head() {
     ReturnObjectImp result = new ReturnObjectImp();
    if (this.head == null) {
      result.errorMessage = ErrorMessage.EMPTY_STRUCTURE;
    } else {
      result.returnObject = head.getObject();
    }
    return result;
  }
  
  public FunctionalLinkedList rest() {
    FunctionalLinkedList newhead = new FunctionalLinkedList();
    if (head.getNext() == null) {
      newhead = null;
    } else {
      for(int n=1; n<this.size(); n++) {
        newhead.add(this.get(n).getReturnValue());
      }
    }
    return newhead;
  }
}