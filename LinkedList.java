public class LinkedList implements List {
  public LinkedListItem head; 
  public int count;
  
  LinkedList() {
    this.head = null;
    count = 0;
  }

  public boolean isEmpty () {
    return  (count == 0);
  }
  
  public int size() {
    return count;
  }
  
  public ReturnObjectImp get(int index) {
    ReturnObjectImp result = new ReturnObjectImp();
    if (index < 0 || index >= this.size()) {
      result.errorMessage = ErrorMessage.INDEX_OUT_OF_BOUNDS;
    } else {
        LinkedListItem rslt = head;
        for (int n=0; n<index; n++) {
          rslt = rslt.getNext();
        }
       result.returnObject = rslt.getObject(); 
    }
    return result;
  }

  public ReturnObjectImp remove(int index) {
    ReturnObjectImp result = new ReturnObjectImp();
    if (index<0 || index>= this.size()) {
      result.errorMessage = ErrorMessage.INDEX_OUT_OF_BOUNDS;
    } else {
      if (index==0) {
        result.returnObject = head.getObject();
        head=null;
      } else {
        LinkedListItem current = head;
        for(int n=1; n<index; n++) {
            current = current.getNext();
        }
        result.returnObject = current.getNext().getObject();
        current.setNext(current.getNext().getNext());
      }
      count--;
    }  
    return result;
  }  
  
  public ReturnObjectImp add(int index, Object item) {
    ReturnObjectImp result = new ReturnObjectImp();
    if (index<0 || index > this.size()) {
        result.errorMessage = ErrorMessage.INDEX_OUT_OF_BOUNDS;
    } else if(item==null) {
      result.errorMessage = ErrorMessage.INVALID_ARGUMENT;
    } else {
      LinkedListItem newItem = new LinkedListItem(item);
      if (count == 0) {
        head = newItem;
      } else if (index == 0) {
        newItem.setNext(head);
        head = newItem;
      } else {
        LinkedListItem current = head;
        for (int n=1; n<index; n++) {
          current = current.getNext();
        }
        newItem.setNext(current.getNext());
        current.setNext(newItem);
      }
      result.returnObject=item;
      count++;
    }
    return result;
  }
  
  public ReturnObjectImp add(Object item) {
    return this.add(count, item);
  }             
}  
    
    