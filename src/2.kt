import java.util.*
data class Player( var name : String, var xp : Double = 0.0,var maxHP : Double = 10.0, var hp : Double = 100.0, var lvl : Int = 1,
                   var NextLvlXP : Double = 30.0)
{
    fun deathPenalty()
    {
        xp /= 2
        hp = 5.0
    }

    fun gainXP(value : Double)
    {
        if (NextLvlXP < xp + value)
        {
            lvl++
            xp = 0.0
            NextLvlXP = NextLvlXP * 2
        }
    }


}


fun main(args: Array<String>){
    val player = Player("hero1")
    player.gainXP(5.0)
}                     