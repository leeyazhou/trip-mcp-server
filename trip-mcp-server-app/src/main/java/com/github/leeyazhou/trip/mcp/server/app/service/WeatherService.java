package com.github.leeyazhou.trip.mcp.server.app.service;

import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class WeatherService {
  private static final Logger logger = LoggerFactory.getLogger(WeatherService.class);

  public String getWeatherByCity(String city) {
    Map<String, String> mockData = Map.of("西安", "晴天", "北京", "小雨", "上海", "大雨");
    logger.info("查询城市：{}", city);
    return mockData.getOrDefault(city, "抱歉：未查询到对应城市！");
  }

}
