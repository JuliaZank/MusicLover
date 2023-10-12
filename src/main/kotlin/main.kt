import kotlin.random.Random

fun main() {
    var cost: Int = Random.nextInt(10100, 1_00000);
    var constantClient: Boolean = Random.nextBoolean();
    val discount: Double = 0.05;
    val discountConstant: Double = 0.01;
    var result_1 = (if (constantClient === true) cost - cost * discountConstant else cost).toInt();
    var result_2 =
        (if (constantClient === true) (cost - 100) - (cost - 100) * discountConstant else cost - 100).toInt();
    var result_3 =
        (if (constantClient === true) (cost - cost * discount) - ((cost - cost * discount) * discountConstant) else cost - cost * discount).toInt();

    if (cost in 1..1000) {
        println("$result_1 рублей");
    } else if (cost in 1001..10_000) {
        println("$result_2 рублей");
    } else if (cost >= 10_101) {
        println("$result_3 рублей");
    }
}