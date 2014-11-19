public class ImprovedStackImp implements ImprovedStack{
  private StackImp internalStack;
  
  ImprovedStackImp(List list) {
    internalStack = new StackImp(list);
  }
 
  public boolean isEmpty() {
    return internalStack.isEmpty();
  }
  
  public int size() {
    return internalStack.size();
  }
  
  public void push(Object item) {
    internalStack.push(item); 
  }
  
  public ReturnObject top() {
    return internalStack.top();  
  }
  
  public ReturnObject pop() {
    return internalStack.pop();
  }

  public ImprovedStack reverse() {
    LinkedList list = new LinkedList();
    ImprovedStack newStack = new ImprovedStackImp(list);
    for(int n=1; n<=this.size(); n++) {
      newStack.push(this.internalStack.internalList.get(this.size()-n).getReturnValue());
    }
    return newStack;
  }

  public void remove(Object object) {
    for(int n=0; n<this.size(); n++) {
      while(internalStack.internalList.get(n).getReturnValue() !=null && internalStack.internalList.get(n).getReturnValue().equals(object)){
          internalStack.internalList.remove(n);
      }
    }
  }
}