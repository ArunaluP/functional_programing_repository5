object practical_5_3{
    def main(args: Array[String]):Unit={
        val n = 20
        val fibb=fib(n)
        println(s"The first $n Fibonacci numbers are: ${fibb.mkString(", ")}")  
    }
    def fib(n:Int):List[Int] ={
        def fibbonacci(n:Int):Int=n match{
        case 0 => 0
                 
        case 1 => 1
                
        case _  => fibbonacci(n-1)+fibbonacci(n-2)
                
                
            }
        (0 until n).toList.map(fibbonacci)
    }


        
    }


    
