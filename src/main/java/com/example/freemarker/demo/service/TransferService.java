package com.example.freemarker.demo.service;

import com.example.freemarker.demo.dto.Car;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import java.io.IOException;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class TransferService {

  @Resource
  private Configuration freemarkerConfiguration;

  public String convert(Car car) throws IOException, TemplateException {
    StringWriter stringWriter = new StringWriter();
    Template template = freemarkerConfiguration.getTemplate("case2.ftl");

    Map<String, Object> maps = new HashMap<>();
    maps.put("car", car);

    template.process(maps, stringWriter);
    return stringWriter.toString();
  }

}
