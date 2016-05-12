package tr.com.epias.web.test.gen.invoke.auth;

import tr.com.epias.web.test.gen.invoke.Pair;

import java.util.Map;
import java.util.List;

public interface Authentication {
  /** Apply authentication settings to header and query params. */
  void applyToParams(List<Pair> queryParams, Map<String, String> headerParams);
}