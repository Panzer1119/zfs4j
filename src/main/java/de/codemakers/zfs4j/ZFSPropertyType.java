public abstract class ZFSPropertyType<T> {

  protected final String name;
  
  public ZFSPropertyType(String name) {
    this.name = name;
  }
  
  abstract T deserialize(String value);
  
  abstract String serialize(T value);
  
  public static ZFSPropertyType<UUID> GUID = new ZFSPropertyType<>("guid") {
    @Override
    UUID deserialize(String value) {
      return UUID.parse(value);
    }
    @Override
    String serialize(UUID value) {
      return value.toString();
    }  
  };

}