package android.databinding;

public class DataBinderMapperImpl extends MergedDataBinderMapper {
  DataBinderMapperImpl() {
    addMapper(new smartbox.test.application.DataBinderMapperImpl());
  }
}
