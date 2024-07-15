fun main(args: Array<String>) {


    do {
        println("Enter a command:")
        val command = readLine()
        println("You entered: $command")

        if (command != null) {
            sqrt(command.toDouble())

            println(" kotlin.math.sqrt() : ${kotlin.math.sqrt(command.toDouble())}")
        };


    } while (command != ":quit")
}

// 目标：计算一个数的平方根
fun sqrt(number: Double): Double{

    // 平方根近似值，初始值为1
    var approxSqrt = 1.0;

    // 误差 初始值为1
    var error = 1.0

    while (error > 0.000000000001) {
        // 计算近似值
        approxSqrt = (approxSqrt + number / approxSqrt) / 2.0
        // 计算误差
        error = Math.abs(approxSqrt * approxSqrt - number)
    }

    println("The square root of $number is $approxSqrt")

    return approxSqrt;
}