object practical_5_1{
    def main(args:Array[String]):Unit ={
        var productList:List[String]=List()
        println("enter Your product list hat you want to buy")
        
        val enteredproductList=getProduct(productList)
        val a =noProducts(enteredproductList)
        println("Number of products in the list")
        println(a)
        println("Choosen products")
        printList(1,enteredproductList)

    }
    def getProduct(b:List[String]):List[String] ={
        println("Enter product or (done) for finish")
        val product = scala.io.StdIn.readLine()
        if(product == "done") b
        else getProduct(b:+ product)

        
    }
    def noProducts(a:List[String]):Int={
        a.length
    }
    def printList(no:Int,ele:List[String]): Unit = ele match{
        case Nil=> 
        case head :: tail =>
                println(s"$no. $head")
                printList(no+1,tail)
    }

}