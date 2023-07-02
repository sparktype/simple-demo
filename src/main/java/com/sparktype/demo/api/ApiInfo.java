package com.sparktype.demo.api;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Data
@Builder
public class ApiInfo {

  @NonNull
  private String version;

  @NonNull
  private String name;

} 