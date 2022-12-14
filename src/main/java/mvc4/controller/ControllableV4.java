package mvc4.controller;

import java.util.Map;

@FunctionalInterface
public interface ControllableV4 {

    String process(Map<String, Object> model);
}
