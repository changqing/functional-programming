package recfun
import common._

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = {
    if (c == 0 || r == c) {
    	1
    }  else {
      pascal(c-1, r-1) + pascal(c, r-1)
    }
  }

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {
    def isBalance(chars: List[Char], leftCount: Int):Boolean = {
    	if (leftCount < 0) {
    	  false
    	} else {
	    	if (chars.isEmpty) {
	    	  leftCount == 0
	    	} else {
	    	  if (chars.head == '(') {
	    	    isBalance(chars.tail, leftCount+1)
	    	  } else if (chars.head == ')') {
	    	    isBalance(chars.tail, leftCount-1)
	    	  } else {
	    	    isBalance(chars.tail, leftCount)
	    	  }
	    	}
    	}
    }
    isBalance(chars, 0)
  }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = {
	if (money == 0) 1
	else if (money < 0 || coins.isEmpty) 0
	else countChange(money - coins.head, coins) + countChange(money, coins.tail)
  }	
}
