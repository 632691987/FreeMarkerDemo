package com.example.freemarker.demo;

import com.example.freemarker.demo.dto.Car;
import com.example.freemarker.demo.service.TransferService;
import javax.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class JobCommandLine implements CommandLineRunner {

  @Resource
  private TransferService transferService;

  @Override
  public void run(String... args) throws Exception {
    Car car = new Car("make_value", "model_value");
    log.info("==============================================");
    log.info("==============================================");
    log.info("==============================================");
    log.info(transferService.convert(car));
    log.info("==============================================");
    log.info("==============================================");
    log.info("==============================================");
  }
}
