public class LinkedListItem {
  private Object value;
  private LinkedListItem nextObject;


  LinkedListItem(Object value) {
    this.value=value;
    this.nextObject=null;
  }
  
  LinkedListItem() {
    this.value=null;
    this.nextObject=null;
  }
  
  public Object getObject() {
    return value;
  }
  public LinkedListItem getNext() {
    return nextObject;
  }
  public  void setNext(LinkedListItem next) {
    this.nextObject = next;
  }
}
 

