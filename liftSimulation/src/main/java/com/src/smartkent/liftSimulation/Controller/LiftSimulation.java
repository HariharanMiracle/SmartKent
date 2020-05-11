package com.src.smartkent.liftSimulation.Controller;


import com.fasterxml.jackson.databind.util.JSONPObject;
import com.src.smartkent.liftSimulation.Model.Lift;
import com.src.smartkent.liftSimulation.Service.LiftService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/smartkent")
public class LiftSimulation {

    private final LiftService liftService;

    @Autowired
    public LiftSimulation(LiftService liftService){
        this.liftService = liftService;
    }

    @GetMapping("/liftsimulation")
    @ResponseBody
    public String  pickAndDrop(@RequestParam("fromFloor") int fromFloor, @RequestParam("toFloor") int toFloor) throws InterruptedException{

        int eta = liftService.pickAndDrop(fromFloor, toFloor);
        if(eta != -1){
            return"{'ETA':"+eta+"}";
        }
        else{
            return"{'Message':'Warning!!!'}";
        }

    }

    // Test service for debugging
    @GetMapping("/test")
    @ResponseBody
    public String test(){
        return "Test service";
    }

}
