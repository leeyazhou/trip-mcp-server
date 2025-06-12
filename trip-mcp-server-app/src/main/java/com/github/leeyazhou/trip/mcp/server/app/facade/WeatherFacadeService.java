/**
 * 
 */
package com.github.leeyazhou.trip.mcp.server.app.facade;

import org.springframework.ai.tool.annotation.Tool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.github.leeyazhou.trip.mcp.server.app.service.WeatherService;

/**
 * @author leeyazhou
 */
@Component
public class WeatherFacadeService extends BaseFacadeService {
	
	@Autowired
	private WeatherService weatherService;

	@Tool(description = "根据城市名称获取天气预报")
	public String getWeather(String city) {
		return weatherService.getWeatherByCity(city);
	}

	// Additional methods can be added as needed

}
