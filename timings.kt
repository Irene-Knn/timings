fun main(){
    var time = 5

    if (time >=12 && time <=12){
        println("NOON ;)")
    }
    else if (time >=13 && time <=15){
        println("Good Afternoon :)")
    }
    else if (time >=16 && time<=19){
        println("Good Evening :)")
    }
    else if (time >=20 && time <=23){
        println("Good Night :)")
    }
    else if (time >=24 && time <=24){
        println("Midnight ;)")
    }
    else if (time >=1 && time <=11){
        println("Good Morning :)")
    }
    else {
        println("Not perfect timing :/")
    }


}
