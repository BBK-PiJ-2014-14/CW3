public class SampleableListImp implements SampleableList {
  private List list;
  
  SampleableListImp(List list) {
    this.list = list;
  }
  SampleableListImp() {
    this.list = new LinkedList();
  }
  
  public boolean isEmpty() {
    return list.isEmpty();
  }
  
  public int size() {
    return list.size();
  } 
  
  public ReturnObject get(int index) {
    return list.get(index);
  }
  
  public ReturnObject remove(int index) {
    return list.remove(index);
  }
  
  public ReturnObject add(int index, Object item) {
    return list.add(index, item);
  }
  
  public ReturnObject add(Object item) {
    return list.add(item);
  }
  
  public SampleableList sample() {
    SampleableListImp newSample = new SampleableListImp();
    if (this.list.isEmpty()){
      return newSample;
    } else {
      for (int n=0; n<this.size()/2; n++) {
        newSample.add(this.list.get(n*2).getReturnValue());
      }
    }
    return newSample;
  }
}