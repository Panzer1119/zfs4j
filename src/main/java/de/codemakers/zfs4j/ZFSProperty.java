public class ZFSProperty<T> {

  protected final ZFSPropertyType<T> type;
  protected final T value;
  
  public ZFSProperty(ZFSPropertyType<T> type, T value) {
    this.type = type;
    this.value = value;
  }

}