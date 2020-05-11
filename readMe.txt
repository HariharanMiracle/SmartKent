Output =>
Lift{liftId=1, state='TO_PICKUP', direction='UP', person=0, floor=1}
Lift{liftId=2, state='TO_PICKUP', direction='UP', person=0, floor=1}
Lift{liftId=2, state='PICKUP', direction='NAN', person=1, floor=2}
Lift{liftId=2, state='TO_DROPOFF', direction='UP', person=1, floor=2}
Lift{liftId=1, state='PICKUP', direction='NAN', person=1, floor=5}
Lift{liftId=1, state='TO_DROPOFF', direction='UP', person=1, floor=5}
Lift{liftId=2, state='DROPOFF', direction='NAN', person=0, floor=7}
Lift{liftId=1, state='DROPOFF', direction='NAN', person=0, floor=9}
Lift{liftId=2, state='IDLE', direction='NAN', person=0, floor=7}
Lift{liftId=1, state='IDLE', direction='NAN', person=0, floor=9}

I have added the screen shots of the results using postman.
I called all the function parallelly.

Functions =>
http://localhost:8090/smartkent/liftsimulation/?fromFloor=5&toFloor=9
http://localhost:8090/smartkent/liftsimulation/?fromFloor=2&toFloor=7
http://localhost:8090/smartkent/liftsimulation/?fromFloor=10&toFloor=1
http://localhost:8090/smartkent/liftsimulation/?fromFloor=9&toFloor=8
http://localhost:8090/smartkent/liftsimulation/?fromFloor=4&toFloor=10

Assumption:
Assumed a warning is returned:
	* when the lift is in use.
	* when out of bound parametes like negative floor numbers are entered.