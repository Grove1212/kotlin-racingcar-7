package racingcar.controller

import racingcar.model.Car
import racingcar.view.UserInterface
import camp.nextstep.edu.missionutils.Randoms

class CarRacing(private val view: UserInterface) {
    //    fun run() {
//        val cars = view.getCarName()
//        val attempts = view.getNumberOfAttempts()
//
//    }
    fun generateCarList(input: String): List<Car> {
        val carArray = input.split(",")
        val carList = mutableListOf<Car>()
        for (i in carArray) {
            carList.add(Car(i, 0))
        }
        return carList
    }

    fun getRandomNumber(): Int {
        return Randoms.pickNumberInRange(0, 9)
    }

    fun driveCar(car: Car) {
        val number = getRandomNumber()
        if (number >= 4){
            car.distanceCovered++
        }
    }
}