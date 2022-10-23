fun main(){
    print("Enter the number of questions (1 to 17): ")
    val numOfQuestion = readLine().toString();

    if( numOfQuestion.toInt() < 1 || numOfQuestion.toInt() > 17 ) {
        println("\nERROR\nChoose the number of questions between 1 and 17!\n")
    }
    else {
        ItemController().quiz( numOfQuestion.toInt() );
    }
}