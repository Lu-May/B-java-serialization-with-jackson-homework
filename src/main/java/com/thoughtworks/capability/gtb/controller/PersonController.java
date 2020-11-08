package com.thoughtworks.capability.gtb.controller;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.thoughtworks.capability.gtb.vo.PersonVo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class PersonController {

  @GetMapping("/persons/{id}")
  public PersonVo getPerson(@PathVariable("id") String id) {
    return new PersonVo(id, null, "张三", null);
  }
}
