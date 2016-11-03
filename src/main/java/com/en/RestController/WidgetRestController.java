package com.en.RestController;

import com.en.Entity.WidgetEntity;
import com.en.Repository.WidgetRepository;
import com.en.Service.SonarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: azafirov
 * Date: 10/31/2016
 * Time: 12:59 PM
 * To change this template use File | Settings | File and Code Templates.
 */
@RestController
@RequestMapping("/sonar/widgets")
public class WidgetRestController {

    @Autowired
    WidgetRepository widgetRepository;

    @Autowired
    SonarService sonarService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<WidgetEntity> getAllWidgets(){
        return widgetRepository.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String getDataFromWidget(@PathVariable("id") Long widgetId){
        long startTime = System.currentTimeMillis();
        try{
            String response = sonarService.getResponse(widgetId);
            long endTime = System.currentTimeMillis();
            System.out.println("That took " + (endTime - startTime) + " milliseconds");
            return response;
        }catch (Exception e){
            System.out.println(e.getMessage());
            return  "ERROR:Widget with undefined index: " + widgetId;
        }
    }
}
