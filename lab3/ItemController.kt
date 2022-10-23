import java.io.File

class ItemController {


    val items = arrayListOf<Item>()

    init {
        val lines = File( "questions.txt" ).readLines()
        for ( i in 0..lines.size - 1 step 5){
            items.add( Item(lines[i], listOf( lines[i + 1], lines[i + 2], lines[i + 3], lines[i + 4] ) ));
        }
    }

    fun quiz( numberOfQuestions : Int ){

        randomizeQuestions()

        var yourAnswer : String
        var yourScore : Int = 0
        var iter : Int = 0

        while( numberOfQuestions!= iter ){

            val correctAnswer : String = items[iter].answers[0]

            println("${iter+1}. " + items[iter].question)
            var quizAnswers = items[iter].answers.shuffled()
            println("1. " + quizAnswers[0])
            println("2. " + quizAnswers[1])
            println("3. " + quizAnswers[2])
            println("4. " + quizAnswers[3])

            print("Your answer (1/2/3/4): ")
            yourAnswer = readLine().toString()

            if( yourAnswer.toInt() >= 1 && yourAnswer.toInt() <= 4 ) {
                if (correctAnswer == quizAnswers[yourAnswer.toInt() - 1]) {
                    yourScore++
                    println("\nCorrect answer\n")
                }
                else println("\nWrong answer\nThe right answer is: $correctAnswer")

                iter++
                println()
            }
            else {
                println("\nERROR\nThe answers are numbered from 1 to 4!\n")
            }


        }

        println("Your final score: $yourScore/$numberOfQuestions" )
    }

    fun randomizeQuestions(){
        items.shuffle()
    }

    fun randomItem() : Item {
        return items.random()
    }

    fun save(item: Item){

    }

    fun size() : Int{
        return items.size
    }
}