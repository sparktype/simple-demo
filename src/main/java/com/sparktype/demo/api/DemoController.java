package com.sparktype.demo.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api")
public class DemoController {

  @RequestMapping
  public Mono<ResponseEntity<ApiInfo>> demo() {
    return Mono.just(ResponseEntity.ok(ApiInfo.builder().version("1.0.1").name("demo").build()));
  }

}