package com.src.smartkent.liftSimulation.Service;

import com.src.smartkent.liftSimulation.Model.Lift;
import org.springframework.stereotype.Service;

@Service
public class LiftService {

    // Initialization of lift1 and lift 2
    private static Lift lift1 = new Lift(1, "IDLE", "NAN", 0);
    private static Lift lift2 = new Lift(2, "IDLE", "NAN", 0);

    public int pickAndDrop(int fromFloor, int toFloor) throws InterruptedException{

        if((fromFloor > 10 || fromFloor < 1) || (toFloor > 10 || toFloor < 1)){
            // Validation of floor numbers => not negative and between 1 and 10
            return -1;
        }
        else if(fromFloor == toFloor){
            // Validation of floor numbers are equal to deny the service
            return -1;
        }

        // Lift Simulation Service Begin

        // Check for lift availability
        if(lift1.getState().equals("IDLE") || lift2.getState().equals("IDLE")){
            // Lift is available
            if(lift1.getState().equals("IDLE")){
                // Using lift 1


                // Initiating to pick up
                if(lift1.getFloor() > fromFloor){
                    lift1.setDirection("DOWN");
                }
                else{
                    lift1.setDirection("UP");
                }
                lift1.setState("TO_PICKUP");
                lift1.setPerson(0);
                System.out.println(lift1.toString());


                // Travelling to pick up
                Thread.sleep(3000 * Math.abs(lift1.getFloor() - fromFloor));


                // While pick up
                lift1.setFloor(fromFloor);
                lift1.setState("PICKUP");
                lift1.setDirection("NAN");
                lift1.setPerson(1);
                System.out.println(lift1.toString());


                Thread.sleep(4000);


                // Travelling to drop the person
                lift1.setState("TO_DROPOFF");
                if(lift1.getFloor() > toFloor){
                    lift1.setDirection("DOWN");
                }
                else{
                    lift1.setDirection("UP");
                }
                System.out.println(lift1.toString());


                Thread.sleep(3000 * Math.abs(lift1.getFloor() - toFloor));


                // While dropping
                lift1.setState("DROPOFF");
                lift1.setPerson(0);
                lift1.setFloor(toFloor);
                lift1.setDirection("NAN");
                System.out.println(lift1.toString());


                Thread.sleep(4000);


                // IDLE
                lift1.setState("IDLE");
                lift1.setPerson(0);
                lift1.setFloor(toFloor);
                lift1.setDirection("NAN");
                System.out.println(lift1.toString());


            }
            else{
                // Using lift 2


                // Initiating to pick up
                if(lift2.getFloor() < fromFloor){
                    lift2.setDirection("UP");
                }
                else{
                    lift2.setDirection("DOWN");
                }
                lift2.setState("TO_PICKUP");
                lift2.setPerson(0);
                System.out.println(lift2.toString());


                // Travelling to pick up
                Thread.sleep(3000 * Math.abs(lift2.getFloor() - fromFloor));


                // While pick up
                lift2.setFloor(fromFloor);
                lift2.setState("PICKUP");
                lift2.setDirection("NAN");
                lift2.setPerson(1);
                System.out.println(lift2.toString());


                Thread.sleep(4000);


                // Travelling to drop the person
                lift2.setState("TO_DROPOFF");
                if(lift2.getFloor() > toFloor){
                    lift2.setDirection("DOWN");
                }
                else{
                    lift2.setDirection("UP");
                }
                System.out.println(lift2.toString());


                Thread.sleep(3000 * Math.abs(lift2.getFloor() - toFloor));


                // While dropping
                lift2.setState("DROPOFF");
                lift2.setPerson(0);
                lift2.setFloor(toFloor);
                lift2.setDirection("NAN");
                System.out.println(lift2.toString());


                Thread.sleep(4000);


                // IDLE
                lift2.setState("IDLE");
                lift2.setPerson(0);
                lift2.setFloor(toFloor);
                lift2.setDirection("NAN");
                System.out.println(lift2.toString());


            }
        }
        else{
            return -1;
        }

        // Lift Simulation Service End
        return 3 * Math.abs(toFloor - fromFloor);

    }

}
